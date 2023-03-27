package com.rest.demoRest.repository;


import com.rest.demoRest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT qe FROM ProductEntity qe WHERE qe.id = :id")
    Optional<List<Student>> findAll(Long Id);

}
