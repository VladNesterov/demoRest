package com.rest.demoRest.controller;

import com.rest.demoRest.dto.CourseRequestDto;
import com.rest.demoRest.dto.CourseResponseDto;
import com.rest.demoRest.service.CourseService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("shop/course")
public class CourseController {

    private final CourseService courseService;

    @PutMapping("create")
    public ResponseEntity<List<CourseResponseDto>> createCourse(@Valid @RequestBody List<CourseRequestDto> course) {
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    @PutMapping("change")
    public ResponseEntity<CourseResponseDto> changeCourse(@PathVariable Long id, @Valid @RequestBody CourseRequestDto course) {
        return new ResponseEntity<>(courseService.updateStudents(id, course), HttpStatus.CREATED);
    }

    @GetMapping("getByIds")
    public ResponseEntity<List<CourseResponseDto>> getCourseById(@PathVariable List<Long> ids) {

        return ResponseEntity.ok(courseService.getCourseIds(ids));
    }

    @DeleteMapping
    public void removeProduct(@Valid @RequestBody List<Long> ids) {
        courseService.removeCourse(ids);
    }
}
