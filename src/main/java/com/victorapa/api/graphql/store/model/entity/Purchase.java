package com.victorapa.api.graphql.store.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Purchase {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private Date date;
    private int amount;
    private int status;
    @ManyToOne private Client client;
    @ManyToOne private Product product;
}
