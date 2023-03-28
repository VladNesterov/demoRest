package com.rest.demoRest.dto;

import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Data
public class StudentRequestFilterDto implements Serializable {

    private Set<Long> id;

    private Set<String> name;

    private Set<String> lastName;

    @Email
    private Set<String> email;

    private Set<Long> courseIds;

    private Set<Long> roleIds;

}
