package com.rest.demoRest.mapper;

import com.rest.demoRest.dto.RoleRequestDto;
import com.rest.demoRest.dto.RoleResponseDto;
import com.rest.demoRest.entity.Role;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-15T21:24:49+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role roleRequestDtoToRole(RoleRequestDto roleRequestDto) {
        if ( roleRequestDto == null ) {
            return null;
        }

        Role role = new Role();

        role.setName( roleRequestDto.getName() );

        return role;
    }

    @Override
    public RoleResponseDto roleToRoleResponseDto(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleResponseDto roleResponseDto = new RoleResponseDto();

        roleResponseDto.setId( role.getId() );
        roleResponseDto.setName( role.getName() );

        return roleResponseDto;
    }
}
