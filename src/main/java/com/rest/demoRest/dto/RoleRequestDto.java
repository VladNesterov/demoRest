package com.rest.demoRest.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@EqualsAndHashCode(of = "id")
public class RoleRequestDto {

    private long id;

    private String name;

}