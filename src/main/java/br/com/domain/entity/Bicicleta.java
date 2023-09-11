package br.com.domain.entity;

import static br.com.domain.repository.BicicletaRepository.bicicletas;

public class Bicicleta {

    private Long id;
    private String modeloBicicleta;

    private String preco;
    
    private String nome;

    public Bicicleta() {
    }

    public Bicicleta(Long id, String modeloBicicleta, String preco, String nome) {
        this.id = id;
        this.modeloBicicleta = modeloBicicleta;
        this.preco = preco;
        this.nome = nome;
    }

    public Bicicleta(long l, String nome, String preco) {
    }

    public void setPecas(String pecasEscolhidas) {
    }

    public Bicicleta get(int i) {
        if (i >= 0 && i < bicicletas.size()) {
            return bicicletas.get(i);
        } else {

            return null;
        }
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

    public String getNome() {
        return nome;
    }

    public Bicicleta setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id=" + id +
                ", modeloBicicleta='" + modeloBicicleta + '\'' +
                ", preco='" + preco + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void set(String bicicleta) {
    }
}



