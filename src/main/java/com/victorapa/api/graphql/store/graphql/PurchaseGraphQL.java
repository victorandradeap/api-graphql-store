package com.victorapa.api.graphql.store.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.victorapa.api.graphql.store.model.dto.PurchaseCreateDto;
import com.victorapa.api.graphql.store.model.dto.PurchasePageableResult;
import com.victorapa.api.graphql.store.model.entity.Purchase;
import com.victorapa.api.graphql.store.service.PurchaseService;
import org.springframework.stereotype.Component;

@Component
public class PurchaseGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final PurchaseService purchaseService;

    public PurchaseGraphQL(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    public Purchase createPurchase(PurchaseCreateDto purchaseCreateDto) {
        return purchaseService.create(purchaseCreateDto);
    }

    public boolean cancelPurchase(long id) {
        return purchaseService.cancel(id);
    }

    public Purchase findPurchaseById(long id) {
        return purchaseService.findById(id);
    }

    public PurchasePageableResult findAllPurchase(int page, int size) {
        return purchaseService.findAll(page, size);
    }
}
