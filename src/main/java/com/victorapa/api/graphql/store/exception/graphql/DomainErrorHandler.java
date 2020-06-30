package com.victorapa.api.graphql.store.exception.graphql;

import com.victorapa.api.graphql.store.exception.DomainException;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.servlet.GraphQLErrorHandler;
import graphql.validation.ValidationError;
import org.dom4j.dom.DOMEntityReference;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DomainErrorHandler implements GraphQLErrorHandler {

    @Override
    public List<GraphQLError> processErrors(List<GraphQLError> list) {
        return list.stream().map(this::getErrors).collect(Collectors.toList());
    }

    private GraphQLError getErrors(GraphQLError error) {
        if (error instanceof ExceptionWhileDataFetching) {
            ExceptionWhileDataFetching exceptionError = (ExceptionWhileDataFetching) error;
            if (exceptionError.getException() instanceof DomainException) {
                DomainException domainException = (DomainException) exceptionError.getException();
                return new SimpleError(domainException.getMessage(), domainException.getCode());
            }
            return new SimpleError("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR.value());
        } else if (error instanceof ValidationError) {
            String msg = error.getMessage();
            return new SimpleError(msg, HttpStatus.BAD_REQUEST.value());
        }
        return error;
    }
}

