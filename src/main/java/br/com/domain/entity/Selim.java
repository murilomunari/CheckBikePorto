package br.com.domain.entity;

public class Selim {

    private String marcaSelim;

    private String canote;

    private String mesa;

    private String abracadeira;

    public Selim() {
    }

    public Selim(String marcaSelim, String canote, String mesa, String abracadeira) {
        this.marcaSelim = marcaSelim;
        this.canote = canote;
        this.mesa = mesa;
        this.abracadeira = abracadeira;
    }


    public String getMarcaSelim() {
        return marcaSelim;
    }

    public Selim setMarcaSelim(String marcaSelim) {
        this.marcaSelim = marcaSelim;
        return this;
    }

    public String getCanote() {
        return canote;
    }

    public Selim setCanote(String canote) {
        this.canote = canote;
        return this;
    }

    public String getMesa() {
        return mesa;
    }

    public Selim setMesa(String mesa) {
        this.mesa = mesa;
        return this;
    }

    public String getAbracadeira() {
        return abracadeira;
    }

    public Selim setAbracadeira(String abracadeira) {
        this.abracadeira = abracadeira;
        return this;
    }

    @Override
    public String toString() {
        return "Selim{" +
                "marcaSelim='" + marcaSelim + '\'' +
                ", canote='" + canote + '\'' +
                ", mesa='" + mesa + '\'' +
                ", abracadeira='" + abracadeira + '\'' +
                '}';
    }
}
