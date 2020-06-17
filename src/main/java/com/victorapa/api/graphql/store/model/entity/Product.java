package com.victorapa.api.graphql.store.model.entity;

import com.victorapa.api.graphql.store.model.dto.ProductCreateDto;
import com.victorapa.api.graphql.store.model.dto.ProductUpdateDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String name;
    private double price;

    public static Product fromCreateDto(ProductCreateDto productCreateDto) {
        return new Product(null, productCreateDto.getName(), productCreateDto.getPrice());
    }

    public static Product fromUpdateDto(ProductUpdateDto productUpdateDto) {
        return new Product(productUpdateDto.getId(), productUpdateDto.getName(), productUpdateDto.getPrice());
    }
}
