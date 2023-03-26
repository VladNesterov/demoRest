package com.rest.demoRest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "cart")
public class CartEntity {

    @Id
    Long id;

    @OneToMany(mappedBy = "cart")
    private Set<ProductEntity> items;
}
