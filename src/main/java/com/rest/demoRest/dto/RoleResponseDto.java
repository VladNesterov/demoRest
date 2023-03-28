package com.rest.demoRest.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(of = "id")
public class RoleResponseDto {

    private Long id;

    private String name;
}
