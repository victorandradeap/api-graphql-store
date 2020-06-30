package com.victorapa.api.graphql.store.exception;

import org.springframework.http.HttpStatus;

public class EntityNotFound extends DomainException {

    public EntityNotFound() {
        super(HttpStatus.NOT_FOUND, "Entity not found!");
    }
}
