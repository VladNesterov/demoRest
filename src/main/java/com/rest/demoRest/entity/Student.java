package com.rest.demoRest.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NamedEntityGraph(
        name = "student-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("role"),
        }
)
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
