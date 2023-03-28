package com.rest.demoRest.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of="id")
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
