package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.CourseRequestDto;
import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Role;
import com.rest.demoRest.entity.Student;
import com.rest.demoRest.repository.CourseRepository;
import com.rest.demoRest.repository.RoleRepository;
import com.rest.demoRest.repository.StudentRepository;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class UtilTyMapper {

    private static CourseRepository courseRepository;
    private static RoleRepository roleRepository;

    private static StudentRepository studentRepository;

    @Named("getCoursesById")
    public static List<Course> getCoursesById(StudentRequestDto studentRequestDto) {
        if (CollectionUtils.isEmpty(studentRequestDto.getRoleIds())) {
            return null;
        }
        return courseRepository.findAllById(studentRequestDto.getCourseIds());
    }

    @Named("getRolesById")
    public static List<Role> getRolesById(StudentRequestDto studentRequestDto) {
        if (CollectionUtils.isEmpty(studentRequestDto.getRoleIds())) {
            return null;
        }
        return roleRepository.findAllById(studentRequestDto.getRoleIds());

    }

    @Named("getStudentById")
    public static List<Student> getStudentById(CourseRequestDto studentRequestDto) {
        if (CollectionUtils.isEmpty(studentRequestDto.getStudentIds())) {
            return null;
        }
        return studentRepository.findAllById(studentRequestDto.getStudentIds());
    }

    @Autowired
    public void setRepositories(CourseRepository courseRepository, RoleRepository roleRepository, StudentRepository studentRepository) {
        UtilTyMapper.courseRepository = courseRepository;
        UtilTyMapper.roleRepository = roleRepository;
        UtilTyMapper.studentRepository = studentRepository;
    }
}
