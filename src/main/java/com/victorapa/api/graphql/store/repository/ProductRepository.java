package com.victorapa.api.graphql.store.repository;

import com.victorapa.api.graphql.store.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
