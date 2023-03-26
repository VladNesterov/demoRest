package com.rest.demoRest.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "structure")
public class StructureEntity {
    @Id
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "name", nullable = true)
    String name;

    @OneToMany(mappedBy = "product")
    List<ProductEntity> productEntityList;
}
