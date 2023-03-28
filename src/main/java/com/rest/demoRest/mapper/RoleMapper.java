package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.*;
import com.rest.demoRest.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role roleRequestDtoToRole(RoleRequestDto roleRequestDto);

    RoleResponseDto roleToRoleResponseDto(Role role);

}
