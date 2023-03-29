package com.rest.demoRest.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(of = "id")
public class CourseResponseDto {

    private Long id;

    private String name;

    private String description;

    private Set<StudentDto> student;

}
