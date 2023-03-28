package com.rest.demoRest.repository;


import com.rest.demoRest.entity.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    @Query("select s ")
    List<Student> getStudentsByRole(List<Long> roleIds);
}

//    @Query(
//            value = "SELECT s.id,s.email ,s.\"name\" ,s.last_name,r.id,r.\"name\"  \n" +
//                    "FROM  student s\n" +
//                    "    join student_role sr on s.id = sr.student_id \n" +
//                    "    join roles r on r.id = sr.role_id \n" +
//                    "    where r.id  in (102,103,104)\n" +
//                    "   ",
//            nativeQuery = true)
//    List<Student> getStudentsByRole(List<Long> roleIds);
//}
