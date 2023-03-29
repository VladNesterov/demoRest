package com.rest.demoRest.service;

import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.entity.Student;
import com.rest.demoRest.mapper.StudentMapper;
import com.rest.demoRest.repository.StudentRepository;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Data
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper mapperStudent;

    @Transactional
    public List<StudentResponseDto> saveStudents(List<StudentRequestDto> studentRequestDto) {
        List<Student> students = studentRequestDto.stream().map(mapperStudent::studentRequestDtoToStudent).collect(Collectors.toList());
        return new HashSet<>(studentRepository.saveAll(students)).stream().map(mapperStudent::studentToStudentResponseDto).collect(Collectors.toList());
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

    public Page<StudentResponseDto> getAllStudent(Pageable pageable) {
        List<StudentResponseDto> students = studentRepository.findAll(pageable).stream().map(mapperStudent::studentToStudentResponseDto).toList();
        return new PageImpl<>(students, pageable, students.size());
    }

    public List<StudentResponseDto> getStudentByRole(List<Long> roleIds) {
        return new HashSet<>(studentRepository.getStudentsByRole(roleIds)).stream().map(mapperStudent::studentToStudentResponseDto).toList();
    }

}
