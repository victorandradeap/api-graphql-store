package com.victorapa.api.graphql.store.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.victorapa.api.graphql.store.model.dto.ProductCreateDto;
import com.victorapa.api.graphql.store.model.dto.ProductUpdateDto;
import com.victorapa.api.graphql.store.model.entity.Product;
import com.victorapa.api.graphql.store.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final ProductService productService;

    public ProductGraphQL(ProductService productService) {
        this.productService = productService;
    }

    public Product findProductById(Long id) {
        return productService.findById(id);
    }

    public List<Product> findAllProducts() {
        return productService.findAll();
    }

    public Product createProduct(ProductCreateDto productCreateDto) {
        return productService.create(productCreateDto);
    }

    public Product updateProduct(ProductUpdateDto productUpdateDto) {
        return productService.update(productUpdateDto);
    }

    public boolean deleteProduct(long id) {
        return productService.delete(id);
    }
}
