package model; //Model - 'Modelo' - Onde colocamos os Objetos do programa (MVP - Model View Controler)

public class PessoaModel {



    //Criando os Atributos
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String endereço;

    //Criando o Construtor
    public PessoaModel(int id, String nome, String email, String senha, String telefone, String endereço) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public PessoaModel(){}

    //Criando Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
}