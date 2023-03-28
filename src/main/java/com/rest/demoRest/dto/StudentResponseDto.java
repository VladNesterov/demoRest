package com.rest.demoRest.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Set;

@Data
@EqualsAndHashCode(of = "id")
public class StudentResponseDto implements Serializable {

    private Long id;

    private String name;

    private String lastName;

    private String email;

    private Set<CourseDto> course;

    private Set<RoleResponseDto> role;
}
