package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.entity.Student;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = UtilTyMapper.class)
public interface StudentMapper {
    @Mapping(target = "course", source = "studentRequestDto", qualifiedByName = "getCoursesById")
    @Mapping(target = "role", source = "studentRequestDto", qualifiedByName = "getRolesById")
    Student studentRequestDtoToStudent(StudentRequestDto studentRequestDto);

    StudentResponseDto studentToStudentResponseDto(Student student);

}
