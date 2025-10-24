package com.desafio3.client.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio3.client.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
        // Custom query methods (if needed) can be defined here
        List<Client> findByName(String name);
        List<Client> findByCpf(String cpf);
        List<Client> findByBirthDate(LocalDate birthDate);
        List<Client> findByIncome(Double income);
        List<Client> findByChildren(Integer children);
        
}
