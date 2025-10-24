package com.desafio3.client.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafio3.client.dto.ClientDto;
import com.desafio3.client.entities.Client;
import com.desafio3.client.repository.ClientRepository;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repo) {
        this.repository = repo;
    }

    @Transactional(readOnly = true)
    public ClientDto findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDto(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDto> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(x -> new ClientDto(x));
    }

 
}
