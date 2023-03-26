package com.rest.demoRest.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "description")
    String description;

    @Column(name = "name")
    String name;

    @OneToMany(mappedBy = "structure")
    List<StructureEntity> structureEntityList;

    @ManyToOne
    @JoinColumn(name="cart_id")
    private CartEntity cartEntity;

    @ManyToOne
    @JoinColumn(name="category_id")
    private CategoryEntity categoryEntity;

}
