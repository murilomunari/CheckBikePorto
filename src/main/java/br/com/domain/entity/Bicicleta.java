package br.com.domain.entity;

public class Bicicleta {

    private Long id;
    private String modeloBicicleta;

    private String preco;

    public Bicicleta() {
    }

    public Bicicleta(Long id, String modeloBicicleta, String preco) {
        this.id = id;
        this.modeloBicicleta = modeloBicicleta;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id=" + id +
                ", modeloBicicleta='" + modeloBicicleta + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}



