package com.rest.demoRest.controller;

import com.rest.demoRest.dto.RoleRequestDto;
import com.rest.demoRest.dto.RoleResponseDto;
import com.rest.demoRest.service.RoleService;
import com.rest.demoRest.service.StudentService;
import jakarta.validation.Valid;
import lombok.Data;
import org.hibernate.validator.internal.metadata.aggregated.rule.ReturnValueMayOnlyBeMarkedOnceAsCascadedPerHierarchyLine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("shop/role")
@Data
public class RoleController {

    private final RoleService roleService;

    @PutMapping("create")
    public List<RoleResponseDto> createRole(@Valid @RequestBody List<RoleRequestDto> roles) {
        return roleService.saveRole(roles);
    }

    @GetMapping("getByIds")
    public List<RoleResponseDto> getRoleByIds(@RequestBody List<Long> role, Pageable pageable) {
        return roleService.getRoleByIds(role);
    }

    @GetMapping("getAll")
    public Page<RoleResponseDto> getRoles(Pageable page) {
        return roleService.getAllRole(page);
    }

    @DeleteMapping
    public void removeRole(@Valid @RequestBody List<Long> id) {
        roleService.removeRole(id);
    }
}
