package com.victorapa.api.graphql.store.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class PageableResult<T> {

    private List<T> data;
    private int page;
    private int size;

    public PageableResult(Page<T> pageable) {
        this.data = pageable.getContent();
        this.page = pageable.getNumber();
        this.size = pageable.getSize();
    }
}
