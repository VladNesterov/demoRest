package com.rest.demoRest.service;

import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentRequestFilterDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.entity.Student;
import com.rest.demoRest.mapper.StudentMapper;
import com.rest.demoRest.repository.CourseRepository;
import com.rest.demoRest.repository.RoleRepository;
import com.rest.demoRest.repository.StudentRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;
    private final RoleRepository roleRepository;
    private final StudentMapper mapperStudent;

    @Transactional
    public List<StudentResponseDto> saveStudents(List<StudentRequestDto> studentRequestDto) {
        List<Student> students = studentRequestDto.stream().map(mapperStudent::studentRequestDtoToStudent).collect(Collectors.toList());
        return studentRepository.saveAll(students).stream().map(mapperStudent::studentToStudentResponseDto).collect(Collectors.toList());
    }

    @Transactional
    public StudentResponseDto updateStudents(Long id, StudentRequestDto studentRequestDto) {
        Student student = mapperStudent.studentRequestDtoToStudent(studentRequestDto);
        student.setId(id);
        return mapperStudent.studentToStudentResponseDto(studentRepository.save(student));
    }

    public void removeStudents(List<Long> ids) {
        studentRepository.deleteAllById(ids);
    }

    public List<StudentResponseDto> getStudentsByFilter(StudentRequestFilterDto studentRequestFilterDto) {
        return null;
    }

}
