package com.rest.demoRest.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Data
public class RoleResponseDto {

    private Long id;

    private String name;
}
