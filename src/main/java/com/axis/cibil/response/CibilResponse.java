package com.axis.cibil.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CibilResponse {
    private String status;
    private String cibilValueFirst;
    private String cibilValueSecond;


    public CibilResponse(String status, String cibilValueFirst, String cibilValueSecond) {
        this.status = status;
        this.cibilValueFirst = cibilValueFirst;
        this.cibilValueSecond = cibilValueSecond;
    }

    @Override
    public String toString() {
        return "CibilResponse{" +
                "status='" + status + '\'' +
                ", cibilValueFirst='" + cibilValueFirst + '\'' +
                ", cibilValueSecond='" + cibilValueSecond + '\'' +
                '}';
    }
}
