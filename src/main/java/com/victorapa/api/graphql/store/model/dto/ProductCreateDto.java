package com.victorapa.api.graphql.store.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductCreateDto {
    private String name;
    private double price;
}
