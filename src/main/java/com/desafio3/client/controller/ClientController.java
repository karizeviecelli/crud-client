package com.desafio3.client.controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio3.client.dto.ClientDto;
import com.desafio3.client.service.ClientService;



@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    // Listar todos-- Pageable paginacao
    @GetMapping
    public Page<ClientDto> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }



    
    }