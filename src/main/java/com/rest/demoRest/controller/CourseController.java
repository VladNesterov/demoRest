package com.rest.demoRest.controller;

import com.rest.demoRest.dto.CourseRequestDto;
import com.rest.demoRest.dto.CourseResponseDto;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("shop/course")
public class CourseController {

    @PutMapping("create")
    public ResponseEntity<List<CourseResponseDto>> createCourse(@Valid @RequestBody List<CourseRequestDto> course) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("change")
    public ResponseEntity<CourseResponseDto> changeCourse(@PathVariable Long id, @Valid @RequestBody CourseRequestDto course) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("getByIds/{id}")
    public ResponseEntity<List<CourseResponseDto>> getCourseById(@PathVariable List<Long> ids) {
        //retrieval logic
        return ResponseEntity.ok(new ArrayList<>());
    }

    @DeleteMapping
    public ResponseEntity<Void> removeProduct(@Valid @RequestBody List<Long> id) {
        //retrieval logic
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
