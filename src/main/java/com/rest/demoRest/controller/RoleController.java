package com.rest.demoRest.controller;

import com.rest.demoRest.dto.RoleRequestDto;
import com.rest.demoRest.dto.RoleResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("shop/role")
public class RoleController {

    @PutMapping("create")
    public ResponseEntity<List<RoleResponseDto>> createRole(@Valid @RequestBody List<RoleRequestDto> roles) {
        //creation logic
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.CREATED);
    }

    @PutMapping("change")
    public ResponseEntity<Void> changeRole(@PathVariable Long id, @Valid @RequestBody RoleRequestDto role) {
        //creation logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("getByIds")
    public ResponseEntity<List<RoleResponseDto>> getRoleByIds(@RequestBody List<Long> role) {
        //retrieval logic
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.CREATED);
    }

//    @GetMapping("getByFilter")
//    public ResponseEntity<Map<String, ProductResponseDto>> getProductsByFilter(@RequestParam(value = "offset", defaultValue = "0") Integer offset,
//                                                                                   @RequestParam(value = "limit", defaultValue = "10") Integer limit,
//                                                                                   @Valid @RequestBody ProductFilterDto productFilterDto) {
//        //retrieval logic
//        return ResponseEntity.ok(new HashMap<>());
//    }

    @DeleteMapping
    public ResponseEntity<Void> removeRole(@Valid @RequestBody List<Long> id) {
        //retrieval logic
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
