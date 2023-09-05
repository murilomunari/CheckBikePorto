package br.com.domain.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bicicleta {

    private Long id;
    private String modeloBicicleta;

    private String preco;

    private Set<Bicicleta> bicicletas = new HashSet<>();

    public Bicicleta() {
    }

    public Bicicleta(Long id, String modeloBicicleta, String preco, Set<Bicicleta> bicicletas) {
        this.setId(id);
        this.setModeloBicicleta(modeloBicicleta);
        this.setPreco(preco);
        this.setBicicletas(Objects.isNull(bicicletas) ? new HashSet<>() : bicicletas);
    }

    public Bicicleta(long l, String modelo, String preco) {
    }

    public Long getId() {
        return id;
    }

    public Bicicleta setId(Long id) {
        this.id = id;
        return this;
    }

    public String getModeloBicicleta() {
        return modeloBicicleta;
    }

    public Bicicleta setModeloBicicleta(String modeloBicicleta) {
        this.modeloBicicleta = modeloBicicleta;
        return this;
    }

    public String getPreco() {
        return preco;
    }

    public Bicicleta setPreco(String preco) {
        this.preco = preco;
        return this;
    }

    public Set<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public Bicicleta setBicicletas(Set<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
        return this;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id=" + id +
                ", modeloBicicleta='" + modeloBicicleta + '\'' +
                ", preco='" + preco + '\'' +
                ", bicicletas=" + bicicletas +
                '}';
    }
}



