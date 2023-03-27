package com.rest.demoRest.dto;

import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Role;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentRequestFilterDto implements Serializable {

    Set<Long> id;

    Set<String> name;

    Set<String> lastName;

    @Email
    Set<String> email;

    Set<Course> course;

    Set<Role> role;
}
