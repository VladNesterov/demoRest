package com.rest.demoRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class ProductAndStructureManyToMany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    ProductEntity productEntity;

    @ManyToOne
    @JoinColumn(name = "structure_id")
    StructureEntity structureEntity;

}
