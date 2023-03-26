package com.rest.demoRest.service;

import com.rest.demoRest.repository.ProductRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.AllArgsConstructor;

@Server
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

}
