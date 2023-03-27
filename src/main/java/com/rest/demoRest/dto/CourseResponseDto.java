package com.rest.demoRest.dto;

import com.rest.demoRest.entity.Student;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseResponseDto implements Serializable {

    Long id;

    String name;

    String description;

    List<Student> student;

}
