package com.victorapa.api.graphql.store.model.dto;

import com.victorapa.api.graphql.store.model.entity.Purchase;
import org.springframework.data.domain.Page;

public class PurchasePageableResult extends PageableResult<Purchase> {

    public PurchasePageableResult(Page<Purchase> pageable) {
        super(pageable);
    }
}
