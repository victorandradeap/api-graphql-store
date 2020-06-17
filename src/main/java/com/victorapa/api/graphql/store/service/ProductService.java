package com.victorapa.api.graphql.store.service;

import com.victorapa.api.graphql.store.model.dto.ProductCreateDto;
import com.victorapa.api.graphql.store.model.dto.ProductUpdateDto;
import com.victorapa.api.graphql.store.model.entity.Product;
import com.victorapa.api.graphql.store.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product create(ProductCreateDto productCreateDto) {
        Product product = Product.fromCreateDto(productCreateDto);
        return productRepository.save(product);
    }

    public Product update(ProductUpdateDto productUpdateDto) {
        Product product = Product.fromUpdateDto(productUpdateDto);
        return productRepository.save(product);
    }

    public boolean delete(long id) {
        if(productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
