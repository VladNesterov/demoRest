package com.rest.demoRest.dto;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@JsonSerializableSchema
public class StudentRequestDto {

    @Pattern(message = "Must start with a capital letter",
            regexp = "^[A-Z][a-z]")
    @Size(min = 4, message = "student name should have at least 2 characters")
    private String name;

    @Pattern(message = "Must start with a capital letter",
            regexp = "^[A-Z][a-z]")
    @Size(min = 5, message = "student LastName should have at least 5 characters")
    private String lastName;

    @Email(message = "Email isn't valid ")
    private String email;

    private Set<Course> course;

    private Set<Role> role;
}
