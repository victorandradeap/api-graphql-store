package com.victorapa.api.graphql.store.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends DomainException {

    public BadRequestException() {
        super(HttpStatus.BAD_REQUEST, "");
    }
}
