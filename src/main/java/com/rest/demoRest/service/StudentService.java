package com.rest.demoRest.service;

import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.entity.Student;
import com.rest.demoRest.mapper.StudentMapper;
import com.rest.demoRest.repository.CourseRepository;
import com.rest.demoRest.repository.RoleRepository;
import com.rest.demoRest.repository.StudentRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Server
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final RoleRepository roleRepository;
    private final StudentMapper mapperStudent
            = Mappers.getMapper(StudentMapper.class);

    @Transactional
    public List<StudentResponseDto> saveStudents(List<StudentRequestDto> studentRequestDto) {
        List<Student> students = studentRequestDto.stream().map(it -> {
            Student student = mapperStudent.studentRequestDtoToStudent(it);
            student.setCourse(courseRepository.findAllById(it.getCourseIds()));
            student.setRole(roleRepository.findAllById(it.getRoleIds()));
            return student;
        }).collect(Collectors.toList());

        return studentRepository.saveAll(students).stream().map(mapperStudent::studentToStudentResponseDto).collect(Collectors.toList());
    }

    @Transactional
    public StudentResponseDto updateStudents(Long id, StudentRequestDto studentRequestDto) {

        Student student = mapperStudent.studentRequestDtoToStudent(studentRequestDto);
        student.setId(id);
        student.setCourse(courseRepository.findAllById(studentRequestDto.getCourseIds()));
        student.setRole(roleRepository.findAllById(studentRequestDto.getRoleIds()));
        return mapperStudent.studentToStudentResponseDto(student);
    }

    public void removeStudents(List<Long> ids) {
        studentRepository.deleteAllById(ids);
    }

}
