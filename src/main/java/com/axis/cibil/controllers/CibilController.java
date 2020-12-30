package com.axis.cibil.controllers;

import java.util.Random;
import reactor.core.publisher.Mono;
import com.axis.cibil.response.CibilResponse;
import com.axis.cibil.exception.CibilException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CibilController {

    @RequestMapping(value = "/cibilPost", method = RequestMethod.POST, produces = "application/json")
    public Mono<? extends Object> getCibilResponse(@RequestBody String request) throws CibilException {

        if (checkFailure() || request == null) {
            throw new CibilException("Internal Server Error", "Internal Server Error in processing Cibil Request");
        } else {
            try {
                Thread.sleep(5000);
                CibilResponse response = new CibilResponse("Approved", "100", "007");
                return Mono.just(response);

            } catch (InterruptedException e) {

            }
        }
        return Mono.empty();
    }

    private Boolean checkFailure() {
        Random random = new Random();
        int value = random.nextInt(100);
        if (value % 11 == 0) {
            return true;
        }
        return false;
    }
}
