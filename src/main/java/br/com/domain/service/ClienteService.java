package br.com.domain.service;

import br.com.domain.entity.Cliente;
import br.com.domain.repository.ClienteRepository;

import java.util.List;
import java.util.Objects;

public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(){
        this.repository = new ClienteRepository();
    }

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public Cliente findById(Long id){
        return repository.findById(id);
    }

    public List<Cliente> findByName(String nome){
        return repository.findByName(nome);
    }

    public List<Cliente> findByCpf(String CPF){
        return repository.findByCpf(CPF);
    }

    public Cliente persist(Cliente cliente){
        if (Objects.nonNull(cliente)){
            return repository.persist(cliente);
        }else {
            return null;
        }
    }
}
