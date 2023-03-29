package com.rest.demoRest.service;

import com.rest.demoRest.dto.RoleRequestDto;
import com.rest.demoRest.dto.RoleResponseDto;
import com.rest.demoRest.entity.Role;
import com.rest.demoRest.mapper.RoleMapper;
import com.rest.demoRest.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper mapperRole;

    @Transactional
    public List<RoleResponseDto> saveRole(List<RoleRequestDto> studentRequestDto) {
        List<Role> role = studentRequestDto.stream().map(mapperRole::roleRequestDtoToRole).collect(Collectors.toList());
        return new HashSet<>(roleRepository.saveAll(role)).stream().map(mapperRole::roleToRoleResponseDto).collect(Collectors.toList());
    }


    public void removeRole(List<Long> ids) {
        roleRepository.deleteAllById(ids);
    }

    public List<RoleResponseDto> getRoleByIds(List<Long> ids) {
        return roleRepository.findAllById(ids).stream().map(mapperRole::roleToRoleResponseDto).collect(Collectors.toList());
    }

    public Page<RoleResponseDto> getAllRole(Pageable pageable) {
        List<RoleResponseDto> role = roleRepository.findAll(pageable).stream().map(mapperRole::roleToRoleResponseDto).toList();
        return new PageImpl<>(role, pageable, role.size());
    }

}
