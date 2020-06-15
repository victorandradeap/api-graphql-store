package com.victorapa.api.graphql.store.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientUpdateDto {
    private long id;
    private String name;
    private String email;
}
