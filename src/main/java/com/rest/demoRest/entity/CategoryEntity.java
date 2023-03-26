package com.rest.demoRest.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "name")
    String name;

    @OneToMany
    @JoinColumn(name = "product_id", nullable = false)
    List<ProductEntity> productEntityList;
}
