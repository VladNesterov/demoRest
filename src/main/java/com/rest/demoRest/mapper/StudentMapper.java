package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.StudentDto;
import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.entity.Student;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {
    Student studentRequestDtoToStudent(StudentRequestDto studentRequestDto);

    StudentResponseDto studentToStudentResponseDto(Student student);

    StudentDto studentToStudentDto(Student student);


}
