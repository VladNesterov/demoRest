package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.CourseDto;
import com.rest.demoRest.dto.CourseRequestDto;
import com.rest.demoRest.dto.CourseResponseDto;
import com.rest.demoRest.entity.Course;
import org.mapstruct.factory.Mappers;

import java.util.stream.Collectors;

public class CourseMapperImpl implements CourseMapper {

    private StudentMapper mapper
            = Mappers.getMapper(StudentMapper.class);

    @Override
    public Course courseRequestDtoToCourse(CourseRequestDto courseRequestDto) {
        if (courseRequestDto == null) {
            return null;
        }
        Course course = new Course();
        course.setDescription(courseRequestDto.getDescription());
        course.setName(courseRequestDto.getName());
        return course;
    }

    @Override
    public CourseResponseDto courseToCourseResponseDto(Course course) {
        if (course == null) {
            return null;
        }
        CourseResponseDto courseResponseDto = new CourseResponseDto();
        courseResponseDto.setId(course.getId());
        courseResponseDto.setDescription(course.getDescription());
        courseResponseDto.setName(course.getName());
        courseResponseDto.setStudent(course.getStudent().stream().map(it -> mapper.studentToStudentDto(it)).collect(Collectors.toList()));
        return courseResponseDto;
    }

    @Override
    public CourseDto courseToCourseDto(Course course) {
        if (course == null) {
            return null;
        }
        CourseDto courseDto = new CourseDto();
        courseDto.setDescription(course.getDescription());
        courseDto.setName(course.getName());
        return courseDto;
    }
}
