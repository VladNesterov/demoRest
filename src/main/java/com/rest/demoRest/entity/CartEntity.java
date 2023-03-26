package com.rest.demoRest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="cart")
@Getter
@Setter
public class CartEntity {

    @Id
    @Column(name = "id", nullable = false)
    Long id;

    @OneToMany(mappedBy="cart")
    private Set<ProductEntity> items;
}
