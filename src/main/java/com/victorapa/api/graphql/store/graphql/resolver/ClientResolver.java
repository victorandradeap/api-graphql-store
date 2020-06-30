package com.victorapa.api.graphql.store.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.victorapa.api.graphql.store.model.entity.Client;
import com.victorapa.api.graphql.store.model.entity.Purchase;
import com.victorapa.api.graphql.store.service.PurchaseService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientResolver implements GraphQLResolver<Client> {

    private final PurchaseService purchaseService;

    public ClientResolver(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    public List<Purchase> purchases(Client client) {
        return purchaseService.findByClient(client);
    }
}
