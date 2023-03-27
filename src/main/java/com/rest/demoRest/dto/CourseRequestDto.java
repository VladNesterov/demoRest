package com.rest.demoRest.dto;

import com.rest.demoRest.entity.Student;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class CourseRequestDto implements Serializable {


    String name;

    String description;

    List<Student> student;

}
