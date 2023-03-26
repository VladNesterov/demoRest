package com.rest.demoRest.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "structure")
public class StructureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String name;

    @OneToMany
    List<ProductEntity> productEntityList;
}
