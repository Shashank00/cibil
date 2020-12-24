package com.axis.cibil.response;

public class CibilResponse {
    private String status;
    private String cibilValueFirst;
    private String cibilValueSecond;


    public CibilResponse(String status, String cibilValueFirst, String cibilValueSecond) {
        this.status = status;
        this.cibilValueFirst = cibilValueFirst;
        this.cibilValueSecond = cibilValueSecond;
    }
}
