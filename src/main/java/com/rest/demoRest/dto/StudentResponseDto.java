package com.rest.demoRest.dto;

import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Role;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class StudentResponseDto implements Serializable {

    Long id;

    String name;

    String lastName;

    String email;

    Set<Course> course;

    Set<Role> role;
}
