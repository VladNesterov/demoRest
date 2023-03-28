package com.rest.demoRest.dto;

import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Role;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentResponseDto implements Serializable {

    private Long id;

    private String name;

    private String lastName;

    private String email;

    private Set<CourseDto> course;

    private Set<RoleResponseDto> role;
}
