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

   private Long id;

    private String name;

    private String description;

    private List<Student> student;

}
