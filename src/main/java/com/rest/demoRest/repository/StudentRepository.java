package com.rest.demoRest.repository;


import com.rest.demoRest.entity.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s.*, r.id as roles_id, r.name as roles_name " +
                    "FROM  student_role sr join student s on sr.student_id=s.id join roles r on r.id =sr.role_id where role_id in (:roleIds)")
    List<Student> getStudentsByRole(List<Long> roleIds);
}
