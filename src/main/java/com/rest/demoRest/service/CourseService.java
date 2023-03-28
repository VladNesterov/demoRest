package com.rest.demoRest.service;

import com.rest.demoRest.dto.*;
import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Student;
import com.rest.demoRest.mapper.CourseMapper;
import com.rest.demoRest.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper mapperCourse;

    @Transactional
    public List<CourseResponseDto> saveCourse(List<CourseRequestDto> courseRequestDtos) {
        List<Course> course = courseRequestDtos.stream().map(mapperCourse::courseRequestDtoToCourse).toList();
        return courseRepository.saveAll(course).stream().map(mapperCourse::courseToCourseResponseDto).collect(Collectors.toList());
    }

    @Transactional
    public CourseResponseDto updateStudents(Long id, CourseRequestDto courseRequestDto) {
        Course course = mapperCourse.courseRequestDtoToCourse(courseRequestDto);
        course.setId(id);
        return mapperCourse.courseToCourseResponseDto(courseRepository.save(course));
    }

    public void removeCourse(List<Long> ids) {
        courseRepository.deleteAllById(ids);
    }

    public List<CourseResponseDto> getCourseIds(List<Long> ids) {
        return courseRepository.findAllById(ids).stream().map(mapperCourse::courseToCourseResponseDto).collect(Collectors.toList());
    }

    @Transactional
    public Page<CourseResponseDto> getAllCourse(Pageable pageable) {
        List<CourseResponseDto> role = courseRepository.findAll(pageable).stream().map(mapperCourse::courseToCourseResponseDto).toList();
        return new PageImpl<>(role, pageable, role.size());
    }

}
