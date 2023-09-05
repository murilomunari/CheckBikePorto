package br.com.domain.repository;

import br.com.domain.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements Repository<Cliente, Long>{

    private List<Cliente> clientes;

    public ClienteRepository(){
        clientes = new ArrayList<>();
    }
    public List<Cliente> findAll(){
        return clientes;
    }

    public Cliente findById(Long id){
        for (Cliente c : clientes){
            if (c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    public List<Cliente> findByName(String texto){
        List<Cliente> clientesCadastrado = new ArrayList<>();
        for (Cliente c: clientes){
            if (c.getNome().equalsIgnoreCase(texto)){
                clientesCadastrado.add(c);
            }
        }
        return clientesCadastrado;
    }


    public List<Cliente> findByCpf(String CPF){
        List<Cliente> cpfCadastrado = new ArrayList<>();
        for (Cliente c : clientes){
            if (c.getCPF().equalsIgnoreCase(CPF)){
                cpfCadastrado.add(c);
            }
        }
        return cpfCadastrado;
    }

    public Cliente persist(Cliente c){
        c.setId(clientes.size() + 1L);
        this.clientes.add(c);
        return c;
    }
}
