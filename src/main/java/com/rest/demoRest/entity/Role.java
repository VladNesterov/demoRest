package com.rest.demoRest.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String name;

    @ManyToMany(mappedBy = "role")
    Set<Student> student;
}
