package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Role;
import com.rest.demoRest.repository.CourseRepository;
import com.rest.demoRest.repository.RoleRepository;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class UtilTyMapper {

    private static CourseRepository courseRepository;
    private static RoleRepository roleRepository;

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

    @Autowired
    public void setRepositories(CourseRepository courseRepository, RoleRepository roleRepository) {
        UtilTyMapper.courseRepository = courseRepository;
        UtilTyMapper.roleRepository = roleRepository;
    }
}
