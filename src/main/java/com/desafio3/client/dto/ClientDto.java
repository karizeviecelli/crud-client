package com.desafio3.client.dto;

import java.time.LocalDate;

import com.desafio3.client.entities.Client;

public class ClientDto {

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Integer children;
    private LocalDate birthDate;
    public ClientDto() {
    }
    public ClientDto(Long id, String name, String cpf, Double income, Integer children, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.children = children;
        this.birthDate = birthDate;
    }
 //sobrecarga de construtor pode ser substituido por modelo de mapeamento modelMapper
    public ClientDto(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName(); 
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.children = entity.getChildren();
        this.birthDate = entity.getBirthDate();
    }  



    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public Double getIncome() {
        return income;
    }
    public Integer getChildren() {
        return children;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
   
}
