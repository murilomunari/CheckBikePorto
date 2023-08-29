package br.com.domain.entity;

public class Quadro {

    private String marcaQuadro;

    private String pedal;

    private String pedivela;

    private String caixaDeDirecao;

    private String garfo;

    public Quadro() {
    }

    public Quadro(String marcaQuadro, String pedal, String pedivela, String caixaDeDirecao, String garfo) {
        this.marcaQuadro = marcaQuadro;
        this.pedal = pedal;
        this.pedivela = pedivela;
        this.caixaDeDirecao = caixaDeDirecao;
        this.garfo = garfo;
    }

    public String getMarcaQuadro() {
        return marcaQuadro;
    }

    public Quadro setMarcaQuadro(String marcaQuadro) {
        this.marcaQuadro = marcaQuadro;
        return this;
    }

    public String getPedal() {
        return pedal;
    }

    public Quadro setPedal(String pedal) {
        this.pedal = pedal;
        return this;
    }

    public String getPedivela() {
        return pedivela;
    }

    public Quadro setPedivela(String pedivela) {
        this.pedivela = pedivela;
        return this;
    }

    public String getCaixaDeDirecao() {
        return caixaDeDirecao;
    }

    public Quadro setCaixaDeDirecao(String caixaDeDirecao) {
        this.caixaDeDirecao = caixaDeDirecao;
        return this;
    }

    public String getGarfo() {
        return garfo;
    }

    public Quadro setGarfo(String garfo) {
        this.garfo = garfo;
        return this;
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "marcaQuadro='" + marcaQuadro + '\'' +
                ", pedal='" + pedal + '\'' +
                ", pedivela='" + pedivela + '\'' +
                ", caixaDeDirecao='" + caixaDeDirecao + '\'' +
                ", garfo='" + garfo + '\'' +
                '}';
    }
}
