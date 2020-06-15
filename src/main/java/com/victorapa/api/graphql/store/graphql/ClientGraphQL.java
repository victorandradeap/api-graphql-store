package com.victorapa.api.graphql.store.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.victorapa.api.graphql.store.model.dto.ClientCreateDto;
import com.victorapa.api.graphql.store.model.dto.ClientUpdateDto;
import com.victorapa.api.graphql.store.model.entity.Client;
import com.victorapa.api.graphql.store.service.ClientService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final ClientService clientService;

    public ClientGraphQL(ClientService clientService) {
        this.clientService = clientService;
    }

    public Client findClientById(Long id) {
        return clientService.findById(id);
    }

    public List<Client> findAllClients() {
        return clientService.findAll();
    }

    public Client createClient(ClientCreateDto clientCreateDto) {
        return clientService.create(clientCreateDto);
    }

    public Client updateClient(ClientUpdateDto clientUpdateDto) {
        return clientService.update(clientUpdateDto);
    }

    public boolean deleteClient(long id) {
        return clientService.delete(id);
    }
}
