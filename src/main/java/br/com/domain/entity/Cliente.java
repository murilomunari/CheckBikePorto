package br.com.domain.entity;

public class Cliente {

    private Long id;

    private String nome;

    private String CPF;

    public void addBicicleta(String bicicletas) {
    }

    public Cliente() {
    }

    public Cliente(Long id, String nome, String CPF) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
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

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}


