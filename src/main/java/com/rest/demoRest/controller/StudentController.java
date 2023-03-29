package com.rest.demoRest.controller;

import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.service.StudentService;
import com.rest.demoRest.validate.ValidateRequestBodyStudentList;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("shop/student")
public class StudentController {

    private final StudentService studentService;

    @PutMapping("create")
    public List<StudentResponseDto> createStudent(@Valid @RequestBody
                                                  ValidateRequestBodyStudentList<@Valid StudentRequestDto> student) {
        return studentService.saveStudents(student.getRequestBody());

    }

    @PutMapping("change")
    public StudentResponseDto changeStudent(@RequestParam Long id, @Valid @RequestBody StudentRequestDto role) {
        return studentService.updateStudents(id, role);
    }

    @GetMapping("getStudents")
    public Page<StudentResponseDto> getAllStudent(Pageable page) {
        return studentService.getAllStudent(page);
    }

    @GetMapping("getByFilter")
    public List<StudentResponseDto> getStudentByRole(@RequestParam List<Long> roleIds) {
        return studentService.getStudentByRole(roleIds);
    }

    @DeleteMapping
    public void removeStudent(@Valid @RequestBody List<Long> ids) {
        studentService.removeStudents(ids);
    }
}
