package com.rest.demoRest.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Set;

@Data
public class StudentRequestDto {

    @NotNull
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotNull
    @NotEmpty(message = "LastName cannot be empty")
    private String lastName;

    @Email(message = "Email isn't valid ")
    private String email;

    private Set<Long> courseIds;

    private Set<Long> roleIds;

}
