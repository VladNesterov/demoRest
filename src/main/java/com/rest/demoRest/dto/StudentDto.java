package com.rest.demoRest.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(of = "id")
public class StudentDto implements Serializable {

    private Long id;

    private String name;

    private String lastName;

    private String email;

}
