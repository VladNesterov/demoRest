package com.rest.demoRest.controller;

import com.rest.demoRest.dto.ProductRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shop/cart")
public class CartController {


    @GetMapping("putProduct")
    public ResponseEntity<Void> putProduct(@RequestBody List<Long> productIds) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("showCart")
    public ResponseEntity<ProductRequestDto> getProductById(@PathVariable Long id) {
        //retrieval logic
        return ResponseEntity.ok(new ProductRequestDto());
    }
    @DeleteMapping
    public ResponseEntity<Void> removeProduct(@RequestBody List<Long> id) {
        //retrieval logic
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
