package com.rest.demoRest.controller;

import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentRequestFilterDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.service.StudentService;
import com.rest.demoRest.validate.ValidateRequestBodyStudentList;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("shop/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PutMapping("create")
    public List<StudentResponseDto> createStudent(@Valid @RequestBody
                                                  ValidateRequestBodyStudentList<@Valid StudentRequestDto> student) {
        return studentService.saveStudents(student.getRequestBody());

    }

    @PutMapping("change")
    public StudentResponseDto changeStudent(@RequestParam Long id, @Valid @RequestBody StudentRequestDto role) {
        //creation logic
        return studentService.updateStudents(id, role);
    }


    @GetMapping("getByFilter")
    public ResponseEntity<List<StudentResponseDto>> getProductsByFilter(@RequestParam(value = "offset", defaultValue = "0") Integer offset,
                                                                        @RequestParam(value = "limit", defaultValue = "10") Integer limit,
                                                                        @Valid @RequestBody StudentRequestFilterDto studentRequestDto) {
        //retrieval logic
        return ResponseEntity.ok(new ArrayList<>());
    }

    @DeleteMapping
    public void removeStudent(@Valid @RequestBody List<Long> ids) {
        //retrieval logic
        studentService.removeStudents(ids);
    }
}
