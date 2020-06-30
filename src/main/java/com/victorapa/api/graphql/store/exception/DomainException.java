package com.victorapa.api.graphql.store.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class DomainException extends HttpStatusCodeException {

    @Getter
    @Setter
    @JsonProperty
    private int code;

    public DomainException(HttpStatus httpStatus, String message) {
        super(httpStatus, message);
        this.code = httpStatus.value();
    }

    public DomainException(HttpStatus httpStatus) {
        super(httpStatus, "");
        this.code = httpStatus.value();
    }
}
