package com.rest.demoRest.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @OneToMany
    @JoinColumn(name = "product_id", nullable = false)
    List<ProductEntity> productEntityList;
}
