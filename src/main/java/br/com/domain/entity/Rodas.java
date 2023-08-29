package br.com.domain.entity;

public class Rodas {

    private String marcaRoda;

    private String freio;

    private String cambioTraseiro;

    private String cambioDianteiro;

    private String cassete;

    private String Corrente;

    private String suspensaoDiateira;

    public Rodas() {
    }

    public Rodas(String marcaRoda, String freio, String cambioTraseiro, String cambioDianteiro, String cassete, String corrente, String suspensaoDiateira) {
        this.marcaRoda = marcaRoda;
        this.freio = freio;
        this.cambioTraseiro = cambioTraseiro;
        this.cambioDianteiro = cambioDianteiro;
        this.cassete = cassete;
        Corrente = corrente;
        this.suspensaoDiateira = suspensaoDiateira;
    }


    public String getMarcaRoda() {
        return marcaRoda;
    }

    public Rodas setMarcaRoda(String marcaRoda) {
        this.marcaRoda = marcaRoda;
        return this;
    }

    public String getFreio() {
        return freio;
    }

    public Rodas setFreio(String freio) {
        this.freio = freio;
        return this;
    }

    public String getCambioTraseiro() {
        return cambioTraseiro;
    }

    public Rodas setCambioTraseiro(String cambioTraseiro) {
        this.cambioTraseiro = cambioTraseiro;
        return this;
    }

    public String getCambioDianteiro() {
        return cambioDianteiro;
    }

    public Rodas setCambioDianteiro(String cambioDianteiro) {
        this.cambioDianteiro = cambioDianteiro;
        return this;
    }

    public String getCassete() {
        return cassete;
    }

    public Rodas setCassete(String cassete) {
        this.cassete = cassete;
        return this;
    }

    public String getCorrente() {
        return Corrente;
    }

    public Rodas setCorrente(String corrente) {
        Corrente = corrente;
        return this;
    }

    public String getSuspensaoDiateira() {
        return suspensaoDiateira;
    }

    public Rodas setSuspensaoDiateira(String suspensaoDiateira) {
        this.suspensaoDiateira = suspensaoDiateira;
        return this;
    }

    @Override
    public String toString() {
        return "Rodas{" +
                "marcaRoda='" + marcaRoda + '\'' +
                ", freio='" + freio + '\'' +
                ", cambioTraseiro='" + cambioTraseiro + '\'' +
                ", cambioDianteiro='" + cambioDianteiro + '\'' +
                ", cassete='" + cassete + '\'' +
                ", Corrente='" + Corrente + '\'' +
                ", suspensaoDiateira='" + suspensaoDiateira + '\'' +
                '}';
    }
}
