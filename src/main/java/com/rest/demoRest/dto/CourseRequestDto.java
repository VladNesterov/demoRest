package com.rest.demoRest.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;


@Data
public class CourseRequestDto {

    private String name;

    private String description;

    private Set<Long> studentIds;

}
