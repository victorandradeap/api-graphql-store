package com.victorapa.api.graphql.store.service;

import com.victorapa.api.graphql.store.exception.BadRequestException;
import com.victorapa.api.graphql.store.exception.EntityNotFound;
import com.victorapa.api.graphql.store.model.dto.PurchaseCreateDto;
import com.victorapa.api.graphql.store.model.dto.PurchasePageableResult;
import com.victorapa.api.graphql.store.model.entity.Client;
import com.victorapa.api.graphql.store.model.entity.Product;
import com.victorapa.api.graphql.store.model.entity.Purchase;
import com.victorapa.api.graphql.store.model.enums.PurchaseStatus;
import com.victorapa.api.graphql.store.repository.ClientRepository;
import com.victorapa.api.graphql.store.repository.ProductRepository;
import com.victorapa.api.graphql.store.repository.PurchaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final ClientRepository clientRepository;
    private final ProductRepository productRepository;

    public PurchaseService(PurchaseRepository purchaseRepository, ClientRepository clientRepository, ProductRepository productRepository) {
        this.purchaseRepository = purchaseRepository;
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
    }

    public Purchase create(PurchaseCreateDto purchaseCreateDto) {
        Client client = clientRepository.findById(purchaseCreateDto.getClientId()).orElseThrow(BadRequestException::new);
        Product product = productRepository.findById(purchaseCreateDto.getProductId()).orElseThrow(BadRequestException::new);

        Purchase purchase = Purchase.builder()
                .amount(purchaseCreateDto.getAmount())
                .status(PurchaseStatus.ACTIVE)
                .client(client)
                .product(product)
                .date(new Date())
                .build();
        return purchaseRepository.save(purchase);
    }

    public boolean cancel(long id) {
        Purchase purchase = purchaseRepository.findById(id).orElseThrow(EntityNotFound::new);

        purchase.setStatus(PurchaseStatus.CANCELED);
        purchaseRepository.save(purchase);
        return true;
    }

    public Purchase findById(long id) {
        return purchaseRepository.findById(id).orElseThrow(EntityNotFound::new);
    }

    public PurchasePageableResult findAll(int page, int size) {
        Page<Purchase> purchasePage = purchaseRepository.findAll(PageRequest.of(page, size));
        return new PurchasePageableResult(purchasePage);
    }

    public List<Purchase> findByClient(Client client) {
        return purchaseRepository.findByClient(client);
    }
}
