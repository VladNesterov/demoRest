package com.rest.demoRest.repository;


import com.rest.demoRest.entity.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select s from Student s left join s.course c join s.role r where r.id in (:roleIds)")
    @EntityGraph(value = "student-entity-graph-role")

    List<Student> getStudentsByRole(List<Long> roleIds);
//
//    same logic less query
//
//    @Query(value = "select stud.*, rol.*\n" +
//            "from student s\n" +
//            "left join student_role sr on s.id = sr.student_id\n" +
//            "left join roles r on sr.role_id = r.id\n" +
//            "left join lateral\n" +
//            "(\n" +
//            "select sr2.role_id, sr2.student_id\n" +
//            "from  student_role sr2\n" +
//            "where sr2.student_id = s.id\n" +
//            ") rolesIds on true\n" +
//            "left join lateral\n" +
//            "(\n" +
//            "   select *\n" +
//            "    from student s3\n" +
//            "    where s3.id = rolesIds.student_id\n" +
//            ") stud on true\n" +
//            "left join lateral\n" +
//            "(\n" +
//            "select r3.id as role_id, r3.name as role_name\n" +
//            "from roles r3\n" +
//            "where r3.id = rolesIds.role_id\n" +
//            ") rol on true\n" +
//            "where r.id in (103)\n",
//            nativeQuery = true
//    )
//    List<Student> getStudentsByRole(List<Long> roleIds);

//    JPQL working
//    @Query("select s from Student s join s.role r left join  s.course c where r.id in (:roleIds)")
//    List<Student> getStudentsByRole(List<Long> roleIds);
}
