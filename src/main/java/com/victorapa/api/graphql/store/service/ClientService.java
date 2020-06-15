package com.victorapa.api.graphql.store.service;

import com.victorapa.api.graphql.store.model.dto.ClientCreateDto;
import com.victorapa.api.graphql.store.model.dto.ClientUpdateDto;
import com.victorapa.api.graphql.store.model.entity.Client;
import com.victorapa.api.graphql.store.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client create(ClientCreateDto clientCreateDto) {
        Client client = Client.fromCreateDto(clientCreateDto);
        return clientRepository.save(client);
    }

    public Client update(ClientUpdateDto clientUpdateDto) {
        Client client = Client.fromUpdateDto(clientUpdateDto);
        return clientRepository.save(client);
    }

    public boolean delete(long id) {
        if(clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
