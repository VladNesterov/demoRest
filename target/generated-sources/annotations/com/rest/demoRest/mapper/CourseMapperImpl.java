package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.CourseRequestDto;
import com.rest.demoRest.dto.CourseResponseDto;
import com.rest.demoRest.dto.StudentDto;
import com.rest.demoRest.entity.Course;
import com.rest.demoRest.entity.Student;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-15T21:24:48+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course courseRequestDtoToCourse(CourseRequestDto roleRequestDto) {
        if ( roleRequestDto == null ) {
            return null;
        }

        Course course = new Course();

        course.setStudent( UtilTyMapper.getStudentById( roleRequestDto ) );
        course.setName( roleRequestDto.getName() );
        course.setDescription( roleRequestDto.getDescription() );

        return course;
    }

    @Override
    public CourseResponseDto courseToCourseResponseDto(Course role) {
        if ( role == null ) {
            return null;
        }

        CourseResponseDto courseResponseDto = new CourseResponseDto();

        courseResponseDto.setId( role.getId() );
        courseResponseDto.setName( role.getName() );
        courseResponseDto.setDescription( role.getDescription() );
        courseResponseDto.setStudent( studentSetToStudentDtoSet( role.getStudent() ) );

        return courseResponseDto;
    }

    protected StudentDto studentToStudentDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto studentDto = new StudentDto();

        studentDto.setId( student.getId() );
        studentDto.setName( student.getName() );
        studentDto.setLastName( student.getLastName() );
        studentDto.setEmail( student.getEmail() );

        return studentDto;
    }

    protected Set<StudentDto> studentSetToStudentDtoSet(Set<Student> set) {
        if ( set == null ) {
            return null;
        }

        Set<StudentDto> set1 = new LinkedHashSet<StudentDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Student student : set ) {
            set1.add( studentToStudentDto( student ) );
        }

        return set1;
    }
}
