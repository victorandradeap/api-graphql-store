package com.victorapa.api.graphql.store.exception.graphql;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import graphql.servlet.GenericGraphQLError;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

class SimpleError extends GenericGraphQLError {

    @Getter
    @Setter
    @JsonProperty
    private int code;

    SimpleError(String message) {
        super(message);
    }

    SimpleError(String message, int code) {
        super(message);
        this.code = code;
    }

    @Override
    @JsonIgnore
    public List<Object> getPath() {
        return null;
    }

    @Override
    @JsonIgnore
    public Map<String, Object> getExtensions() {
        return null;
    }
}
