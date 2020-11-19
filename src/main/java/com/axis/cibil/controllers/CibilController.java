package com.axis.cibil.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class CibilController {

    @RequestMapping(value= "/cibilPost", method = RequestMethod.POST)
    public Map<String, String> getIdmResponse(@RequestBody String request) throws Exception {
        Map<String, String> response = new HashMap<>();

        if(checkFailure() || request == null) {
            throw new Exception();
        }
        else {
            response.put("status", "Approved");
            response.put("cibilValueFirst", "999");
            response.put("cibilValueSecond", "007");
        }

        return response;
    }

    private Boolean checkFailure() {
        Random random = new Random();
        int value = random.nextInt(100);
        if(value%9 == 0) {
            return true;
        }
        return false;
    }
}
