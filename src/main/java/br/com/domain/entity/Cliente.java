package br.com.domain.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cliente {

    private Long id;

    private String nome;

    private String CPF;

    private Set<Cliente> clientes = new HashSet<>();

    public void addBicicleta(String bicicletas) {
    }

    public Cliente() {
    }

    public Cliente(Long id, String nome, String CPF, Set<Cliente> clientes) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.clientes = Objects.isNull(clientes) ? new HashSet<>() : clientes;
    }

    public Long getId() {
        return id;
    }

    public Cliente setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Cliente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCPF() {
        return CPF;
    }

    public Cliente setCPF(String CPF) {
        this.CPF = CPF;
        return this;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public Cliente setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
        return this;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}



