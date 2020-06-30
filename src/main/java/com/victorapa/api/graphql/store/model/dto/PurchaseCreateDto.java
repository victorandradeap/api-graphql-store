package com.victorapa.api.graphql.store.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PurchaseCreateDto {
    private int amount;
    private long clientId;
    private long productId;
}
