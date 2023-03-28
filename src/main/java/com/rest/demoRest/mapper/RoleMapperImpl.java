package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.RoleRequestDto;
import com.rest.demoRest.dto.RoleResponseDto;
import com.rest.demoRest.entity.Role;

public class RoleMapperImpl implements RoleMapper {
    @Override
    public Role roleRequestDtoToRole(RoleRequestDto roleRequestDto) {
        if (roleRequestDto == null) {
            return null;
        }
        Role role = new Role();
        role.setName(roleRequestDto.getName());
        return role;
    }

    @Override
    public RoleResponseDto roleToRoleResponseDto(Role role) {
        if (role == null) {
            return null;
        }
        RoleResponseDto roleResponseDto = new RoleResponseDto();
        roleResponseDto.setId(role.getId());
        roleResponseDto.setName(role.getName());
        return roleResponseDto;
    }
}
