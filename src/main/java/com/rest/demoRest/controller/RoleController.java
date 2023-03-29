package com.rest.demoRest.controller;

import com.rest.demoRest.dto.RoleRequestDto;
import com.rest.demoRest.dto.RoleResponseDto;
import com.rest.demoRest.service.RoleService;
import jakarta.validation.Valid;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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
    public List<RoleResponseDto> getRoleByIds(@RequestParam List<Long> role) {
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
