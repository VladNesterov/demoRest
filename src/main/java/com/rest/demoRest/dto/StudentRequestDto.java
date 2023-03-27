package com.rest.demoRest.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
@JsonDeserialize
public class StudentRequestDto {

    @Pattern(message = "Must start with a capital letter",
            regexp = "^[A-Z][a-z]")
    @Size(min = 4, message = "student name should have at least 2 characters")
    private String name;

    @Pattern(message = "Must start with a capital letter",
            regexp = "^[A-Z][a-z]")
    @Size(min = 5, message = "student LastName should have at least 5 characters")
    private String lastName;

    @Email(message = "Email isn't valid ")
    private String email;

    private Set<Long> courseIds;

    private Set<Long> roleIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Long> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(Set<Long> courseIds) {
        this.courseIds = courseIds;
    }

    public Set<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Set<Long> roleIds) {
        this.roleIds = roleIds;
    }
}
