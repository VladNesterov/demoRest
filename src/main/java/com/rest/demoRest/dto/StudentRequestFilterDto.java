package com.rest.demoRest.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class StudentRequestFilterDto implements Serializable {

    private Set<Long> id;

    private Set<String> name;

    private Set<String> lastName;

    @Email
    private Set<String> email;

    private Set<Long> courseIds;

    private Set<Long> roleIds;

    public Set<Long> getId() {
        return id;
    }

    public void setId(Set<Long> id) {
        this.id = id;
    }

    public Set<String> getName() {
        return name;
    }

    public void setName(Set<String> name) {
        this.name = name;
    }

    public Set<String> getLastName() {
        return lastName;
    }

    public void setLastName(Set<String> lastName) {
        this.lastName = lastName;
    }

    public Set<String> getEmail() {
        return email;
    }

    public void setEmail(Set<String> email) {
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
