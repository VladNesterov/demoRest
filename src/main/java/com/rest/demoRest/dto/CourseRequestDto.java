package com.rest.demoRest.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.rest.demoRest.entity.Student;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
@JsonDeserialize
@Data
public class CourseRequestDto implements Serializable {

    private String name;

    private String description;

    private List<Long> studentIds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getStudent() {
        return studentIds;
    }

    public void setStudent(List<Long> student) {
        this.studentIds = student;
    }
}
