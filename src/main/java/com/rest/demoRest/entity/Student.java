package com.rest.demoRest.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "student")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    Long id;

    String name;

    String lastName;

    String email;

    @OneToMany
    Set<Course> course;

    @ManyToMany
    Set<Role> role;
}
