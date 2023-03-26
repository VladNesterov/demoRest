package com.rest.demoRest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ProductRequestDto implements Serializable {

    String description;

    @NotBlank(message = "categoryName is mandatory")
    String categoryName;

    List<StructureDto> structureDtoList;
}
