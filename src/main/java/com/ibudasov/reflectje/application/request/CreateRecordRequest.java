package com.ibudasov.reflectje.application.request;

public class CreateRecordRequest {
    private String testInput;

    public String getTestInput() {
        return testInput;
    }

    public CreateRecordRequest setTestInput(String testInput) {
        this.testInput = testInput;
        return this;
    }
}
