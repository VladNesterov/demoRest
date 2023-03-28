package com.rest.demoRest.validate;

import jakarta.validation.Valid;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ValidateRequestBodyStudentList<T> {
    @Valid
    private List<T> requestBody;

    public List<T> getRequestBody() {
        return requestBody;
    }
}
