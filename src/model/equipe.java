package model;

public class equipe {
    private String nomeEquipe;
    private String descricao;
    private String membros;


    //Modo construtor

    public equipe(String nomeEquipe, String descricao, String membros){
        this.nomeEquipe = nomeEquipe;
        this.descricao = descricao;
        this.membros = membros;
    }

    //Getters e Setters

    public String getNomeEquipe(){
        return this.nomeEquipe;
    }

    public void setNomeEquipe(String nomeEquipe){
        this.nomeEquipe = nomeEquipe;
    }


    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }


    public String getMembros(){
        return this.membros = membros;
    }

    public void setMembros(String membros){
        this.membros = membros;
    }
}
