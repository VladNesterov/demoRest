package com.rest.demoRest.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class CourseRequestDto implements Serializable {

    private String name;

    private String description;

    private List<Long> studentIds;

}
