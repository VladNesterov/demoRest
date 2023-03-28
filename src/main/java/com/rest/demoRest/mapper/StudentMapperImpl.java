package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.StudentDto;
import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.entity.Student;
import org.mapstruct.factory.Mappers;

import java.util.stream.Collectors;

public class StudentMapperImpl implements StudentMapper {

    private CourseMapper mapperCourse
            = Mappers.getMapper(CourseMapper.class);
    private RoleMapper mapperRole
            = Mappers.getMapper(RoleMapper.class);

    @Override
    public Student studentRequestDtoToStudent(StudentRequestDto studentRequestDto) {
        if (studentRequestDto == null) {
            return null;
        }
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setLastName(studentRequestDto.getLastName());
        student.setEmail(studentRequestDto.getEmail());
        return student;
    }

    @Override
    public StudentResponseDto studentToStudentResponseDto(Student student) {
        if (student == null) {
            return null;
        }
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setId(student.getId());
        studentResponseDto.setName(student.getName());
        studentResponseDto.setLastName(student.getLastName());
        studentResponseDto.setEmail(student.getEmail());
        studentResponseDto.setRole(student.getRole().stream().map(it -> mapperRole.roleToRoleResponseDto(it)).collect(Collectors.toSet()));
        studentResponseDto.setCourse(student.getCourse().stream().map(it -> mapperCourse.courseToCourseDto(it)).collect(Collectors.toSet()));
        return studentResponseDto;
    }

    @Override
    public StudentDto studentToStudentDto(Student student) {
        if (student == null) {
            return null;
        }
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setEmail(student.getEmail());
        studentDto.setName(student.getName());
        studentDto.setLastName(student.getLastName());

        return studentDto;
    }
}
