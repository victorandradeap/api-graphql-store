package com.victorapa.api.graphql.store.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.victorapa.api.graphql.store.model.entity.Client;
import com.victorapa.api.graphql.store.model.entity.Product;
import com.victorapa.api.graphql.store.model.entity.Purchase;
import com.victorapa.api.graphql.store.service.ClientService;
import com.victorapa.api.graphql.store.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class PurchaseResolver implements GraphQLResolver<Purchase> {

    private final ProductService productService;
    private final ClientService clientService;

    public PurchaseResolver(ProductService productService, ClientService clientService) {
        this.productService = productService;
        this.clientService = clientService;
    }

    public Product product(Purchase purchase) {
        return productService.findById(purchase.getProduct().getId());
    }

    public Client client(Purchase purchase) {
        return clientService.findById(purchase.getClient().getId());
    }
}
