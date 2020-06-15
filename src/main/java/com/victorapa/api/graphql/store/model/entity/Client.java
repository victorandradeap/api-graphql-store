package com.victorapa.api.graphql.store.model.entity;

import com.victorapa.api.graphql.store.model.dto.ClientCreateDto;
import com.victorapa.api.graphql.store.model.dto.ClientUpdateDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String name;
    private String email;

    public static Client fromCreateDto(ClientCreateDto clientCreateDto) {
        return new Client(null, clientCreateDto.getName(), clientCreateDto.getEmail());
    }

    public static Client fromUpdateDto(ClientUpdateDto clientUpdateDto) {
        return new Client(clientUpdateDto.getId(), clientUpdateDto.getName(), clientUpdateDto.getEmail());
    }
}
