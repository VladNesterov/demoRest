package com.rest.demoRest.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.UniqueElements;

import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NamedEntityGraph(
        name = "student-entity-graph-role",
        attributeNodes = {
                @NamedAttributeNode("role"),
                @NamedAttributeNode("course")
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
    Set<Course> course;

    @ManyToMany
    @JoinTable(
            name = "student_role",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    Set<Role> role;

}
