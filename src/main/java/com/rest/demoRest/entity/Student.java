package com.rest.demoRest.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    String lastName;

    String email;

    @OneToMany
    List<Course> course;

    @ManyToMany
    List<Role> role;
}
