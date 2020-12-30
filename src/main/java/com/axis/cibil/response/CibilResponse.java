package com.axis.cibil.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CibilResponse {

    @JsonProperty("status")
    private String status;

    @JsonProperty("cibilValueFirst")
    private String cibilValueFirst;

    @JsonProperty("cibilValueSecond")
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
