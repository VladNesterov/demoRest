package com.rest.demoRest.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String name;

    @ManyToMany(mappedBy = "role")
    Set<Student> student;
}
