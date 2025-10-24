package com.desafio3.client.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio3.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

        
}
