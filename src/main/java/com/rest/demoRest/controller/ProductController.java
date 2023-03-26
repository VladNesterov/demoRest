package com.rest.demoRest.controller;

import com.rest.demoRest.dto.ProductRequestDto;
import com.rest.demoRest.dto.ProductFilterDto;
import com.rest.demoRest.dto.ProductResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("shop/products")
public class ProductController {

    @PutMapping("create")
    public ResponseEntity<Void> createProduct(@Valid @RequestBody List<ProductRequestDto> product) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("change")
    public ResponseEntity<Void> changeProduct(@PathVariable Long id, @Valid @RequestBody ProductRequestDto product) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<ProductResponseDto> getProductById(@PathVariable Long id) {
        //retrieval logic
        return ResponseEntity.ok(new ProductResponseDto());
    }

    @GetMapping("getByFilter")
    public ResponseEntity<Map<String, ProductResponseDto>> getProductsByFilter(@RequestParam(value = "offset", defaultValue = "0") Integer offset,
                                                                                   @RequestParam(value = "limit", defaultValue = "10") Integer limit,
                                                                                   @Valid @RequestBody ProductFilterDto productFilterDto) {
        //retrieval logic
        return ResponseEntity.ok(new HashMap<>());
    }

    @DeleteMapping
    public ResponseEntity<Void> removeProduct(@Valid @RequestBody List<Long> id) {
        //retrieval logic
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
