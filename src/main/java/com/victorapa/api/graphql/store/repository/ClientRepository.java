package com.victorapa.api.graphql.store.repository;

import com.victorapa.api.graphql.store.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
