package com.rest.demoRest.controller;

import com.rest.demoRest.dto.CourseRequestDto;
import com.rest.demoRest.dto.CourseResponseDto;
import com.rest.demoRest.service.CourseService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("shop/course")
public class CourseController {

    private final CourseService courseService;

    @PutMapping("create")
    public List<CourseResponseDto> createCourse(@RequestBody List<CourseRequestDto> course) {
        return courseService.saveCourse(course);
    }

    @PutMapping("change")
    public CourseResponseDto changeCourse(@RequestParam Long id, @RequestBody CourseRequestDto course) {
        return courseService.updateStudents(id, course);
    }

    @GetMapping("getByIds")
    public List<CourseResponseDto> getCourseById(@RequestParam List<Long> ids) {
        return courseService.getCourseIds(ids);
    }

    @DeleteMapping
    public void removeProduct(@Valid @RequestBody List<Long> ids) {
        courseService.removeCourse(ids);
    }
}
