package br.com.domain.entity;

public class PecaBicicleta {

    private String nome;

    private String marca;

    private double preco;

    public PecaBicicleta() {
    }

    public PecaBicicleta(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public PecaBicicleta setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public PecaBicicleta setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public double getPreco() {
        return preco;
    }

    public PecaBicicleta setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public String toString() {
        return "PecaBicicleta{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }
}
