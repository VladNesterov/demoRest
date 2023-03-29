package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.CourseRequestDto;
import com.rest.demoRest.dto.CourseResponseDto;
import com.rest.demoRest.entity.Course;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = UtilTyMapper.class)
public interface CourseMapper {
    @Mapping(target = "student", source = "roleRequestDto", qualifiedByName = "getStudentById")
    Course courseRequestDtoToCourse(CourseRequestDto roleRequestDto);

    CourseResponseDto courseToCourseResponseDto(Course role);

}
