package com.rest.demoRest.dto;

import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class StudentRequestDto implements Serializable {

    @Pattern(message = "Must start with a capital letter",
            regexp = "^[A-Z][a-z]")
    @Size(min = 4, message = "student name should have at least 2 characters")
    String name;

    @Pattern(message = "Must start with a capital letter",
            regexp = "^[A-Z][a-z]")
    @Size(min = 5, message = "student LastName should have at least 5 characters")
    String lastName;

    @Email(message = "Email isn't valid ")
    String email;

    Set<Course> course;

    Set<Role> role;
}
