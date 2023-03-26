package com.rest.demoRest.repository;


import com.rest.demoRest.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query("SELECT qe FROM ProductEntity qe WHERE qe.id = :id")
    List<ProductEntity> findAll(Long Id);

}
