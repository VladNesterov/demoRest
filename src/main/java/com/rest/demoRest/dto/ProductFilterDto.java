package com.rest.demoRest.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductFilterDto {

    List<String> categories;

    List<String> structures;
}
