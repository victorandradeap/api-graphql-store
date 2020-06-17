package com.victorapa.api.graphql.store.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductUpdateDto {
    private long id;
    private String name;
    private double price;
}
