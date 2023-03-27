package com.rest.demoRest.dto;

import com.rest.demoRest.entity.Student;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class CourseResponseDto implements Serializable {

    Long id;

    String name;

    String description;

    List<Student> student;

}
