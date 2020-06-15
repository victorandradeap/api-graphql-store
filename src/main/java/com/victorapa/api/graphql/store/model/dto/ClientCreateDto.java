package com.victorapa.api.graphql.store.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientCreateDto {
    private String name;
    private String email;
}
