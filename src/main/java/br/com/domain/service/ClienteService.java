package br.com.domain.service;

import br.com.domain.entity.Cliente;
import br.com.domain.repository.ClienteRepository;

import java.util.List;
import java.util.Objects;

public class ClienteService implements Service<Cliente, Long>{

    private ClienteRepository repository;

    public ClienteService(){
        this.repository = new ClienteRepository();
    }
    @Override
    public List<Cliente> findAll(){
        return repository.findAll();
    }
    @Override
    public Cliente findById(Long id){
        return repository.findById(id);
    }
    @Override
    public List<Cliente> findByName(String texto){
        return repository.findByName(texto);
    }

    public List<Cliente> findByCpf(String CPF){
        return repository.findByCpf(CPF);
    }
    @Override
    public Cliente persist(Cliente cliente){
        if (Objects.nonNull(cliente)){
            return repository.persist(cliente);
        }else {
            return null;
        }
    }
}
