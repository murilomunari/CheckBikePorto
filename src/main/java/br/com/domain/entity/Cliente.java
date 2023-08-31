package br.com.domain.entity;

public class Cliente {

    private Long id;

    private String nome;

    private String CPF;

    private String CEP;

    private String complemento;

    private String telefone;

    private String email;

    private String nascimento;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String CPF, String CEP, String complemento, String telefone, String email, String nascimento) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.CEP = CEP;
        this.complemento = complemento;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
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

    public String getCEP() {
        return CEP;
    }

    public Cliente setCEP(String CEP) {
        this.CEP = CEP;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public Cliente setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Cliente setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Cliente setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getNascimento() {
        return nascimento;
    }

    public Cliente setNascimento(String nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", CEP='" + CEP + '\'' +
                ", complemento='" + complemento + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", nascimento='" + nascimento + '\'' +
                '}';
    }

    public void addBicicleta(String bicicletas) {
    }
}
