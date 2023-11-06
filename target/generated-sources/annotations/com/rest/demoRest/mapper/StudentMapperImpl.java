package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.CourseDto;
import com.rest.demoRest.dto.RoleResponseDto;
import com.rest.demoRest.dto.StudentRequestDto;
import com.rest.demoRest.dto.StudentResponseDto;
import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Role;
import com.rest.demoRest.entity.Student;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-15T21:24:49+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student studentRequestDtoToStudent(StudentRequestDto studentRequestDto) {
        if ( studentRequestDto == null ) {
            return null;
        }

        Student student = new Student();

        student.setCourse( UtilTyMapper.getCoursesById( studentRequestDto ) );
        student.setRole( UtilTyMapper.getRolesById( studentRequestDto ) );
        student.setName( studentRequestDto.getName() );
        student.setLastName( studentRequestDto.getLastName() );
        student.setEmail( studentRequestDto.getEmail() );

        return student;
    }

    @Override
    public StudentResponseDto studentToStudentResponseDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentResponseDto studentResponseDto = new StudentResponseDto();

        studentResponseDto.setId( student.getId() );
        studentResponseDto.setName( student.getName() );
        studentResponseDto.setLastName( student.getLastName() );
        studentResponseDto.setEmail( student.getEmail() );
        studentResponseDto.setCourse( courseSetToCourseDtoSet( student.getCourse() ) );
        studentResponseDto.setRole( roleSetToRoleResponseDtoSet( student.getRole() ) );

        return studentResponseDto;
    }

    protected CourseDto courseToCourseDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDto courseDto = new CourseDto();

        courseDto.setName( course.getName() );
        courseDto.setDescription( course.getDescription() );

        return courseDto;
    }

    protected Set<CourseDto> courseSetToCourseDtoSet(Set<Course> set) {
        if ( set == null ) {
            return null;
        }

        Set<CourseDto> set1 = new LinkedHashSet<CourseDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Course course : set ) {
            set1.add( courseToCourseDto( course ) );
        }

        return set1;
    }

    protected RoleResponseDto roleToRoleResponseDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleResponseDto roleResponseDto = new RoleResponseDto();

        roleResponseDto.setId( role.getId() );
        roleResponseDto.setName( role.getName() );

        return roleResponseDto;
    }

    protected Set<RoleResponseDto> roleSetToRoleResponseDtoSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleResponseDto> set1 = new LinkedHashSet<RoleResponseDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleResponseDto( role ) );
        }

        return set1;
    }
}
