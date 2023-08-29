package br.com.domain.entity;

public class Guidao {

    private String marcaGuidao;

    private String manoplas;

    private String maneteDeFreio;

    private String alavancaDeFreio;

    public Guidao() {
    }

    public Guidao(String marcaGuidao, String manoplas, String maneteDeFreio, String alavancaDeFreio) {
        this.marcaGuidao = marcaGuidao;
        this.manoplas = manoplas;
        this.maneteDeFreio = maneteDeFreio;
        this.alavancaDeFreio = alavancaDeFreio;
    }


    public String getMarcaGuidao() {
        return marcaGuidao;
    }

    public Guidao setMarcaGuidao(String marcaGuidao) {
        this.marcaGuidao = marcaGuidao;
        return this;
    }

    public String getManoplas() {
        return manoplas;
    }

    public Guidao setManoplas(String manoplas) {
        this.manoplas = manoplas;
        return this;
    }

    public String getManeteDeFreio() {
        return maneteDeFreio;
    }

    public Guidao setManeteDeFreio(String maneteDeFreio) {
        this.maneteDeFreio = maneteDeFreio;
        return this;
    }

    public String getAlavancaDeFreio() {
        return alavancaDeFreio;
    }

    public Guidao setAlavancaDeFreio(String alavancaDeFreio) {
        this.alavancaDeFreio = alavancaDeFreio;
        return this;
    }

    @Override
    public String toString() {
        return "Guidao{" +
                "marcaGuidao='" + marcaGuidao + '\'' +
                ", manoplas='" + manoplas + '\'' +
                ", maneteDeFreio='" + maneteDeFreio + '\'' +
                ", alavancaDeFreio='" + alavancaDeFreio + '\'' +
                '}';
    }
}
