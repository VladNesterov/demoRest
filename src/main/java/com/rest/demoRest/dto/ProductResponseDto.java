package com.rest.demoRest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class ProductResponseDto implements Serializable {

    Long id;

    String description;

    String categoryName;

    List<StructureDto> structureDtoList;
}
