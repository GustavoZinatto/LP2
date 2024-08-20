package model; //Model - 'Modelo' - Onde colocamos os Objetos do programa (MVP - Model View Controler)

public class StatusModel {

    //Atributos
    private int id;
    private String descricao;

    public StatusModel() {
    }
    
    //Construtor
    public StatusModel(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
