package com.rest.demoRest.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "student")
public class Student {

    @Id
    private Long id;

    private String name;

    private String lastName;

    private String email;

    @OneToMany
    private List<Course> course;

    @ManyToMany
    private List<Role> role;
}
