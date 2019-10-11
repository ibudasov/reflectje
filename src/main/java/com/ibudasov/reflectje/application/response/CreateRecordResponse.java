package com.ibudasov.reflectje.application.response;

import com.ibudasov.reflectje.infrastructure.Uuid;

public class CreateRecordResponse {
    private String createdRecordId;

    public String getCreatedRecordId() {
        return createdRecordId;
    }

    public CreateRecordResponse setCreatedRecordId(Uuid createdRecordId) {
        this.createdRecordId = createdRecordId.toString();
        return this;
    }
}
