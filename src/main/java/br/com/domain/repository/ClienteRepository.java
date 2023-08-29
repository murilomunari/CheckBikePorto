package br.com.domain.repository;

import br.com.domain.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private List<Cliente> clientes;

    public ClienteRepository(){
        clientes = new ArrayList<>();
    }
    public List<Cliente> findall(){
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

    public List<Cliente> findByName(String nome){
        List<Cliente> clientesCadastrado = new ArrayList<>();
        for (Cliente c: clientes){
            if (c.getNome().equalsIgnoreCase(nome)){
                clientesCadastrado.add(c);
            }
        }
        return clientesCadastrado;
    }


}
