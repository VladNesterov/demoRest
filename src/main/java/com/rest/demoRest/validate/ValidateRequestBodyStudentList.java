package com.rest.demoRest.validate;

import jakarta.validation.Valid;

import java.util.List;

public class ValidateRequestBodyStudentList<T> {
    @Valid
    private List<T> requestBody;

    public List<T> getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(List<T> requestBody) {
        this.requestBody = requestBody;
    }

    public ValidateRequestBodyStudentList(List<T> requestBody) {
        this.requestBody = requestBody;
    }

    public ValidateRequestBodyStudentList() {
    }
}
