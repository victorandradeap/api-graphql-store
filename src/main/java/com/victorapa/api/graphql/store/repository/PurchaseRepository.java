package com.victorapa.api.graphql.store.repository;

import com.victorapa.api.graphql.store.model.entity.Client;
import com.victorapa.api.graphql.store.model.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    List<Purchase> findByClient(Client client);
}
