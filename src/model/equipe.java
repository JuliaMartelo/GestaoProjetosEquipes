package model;

import java.util.List;

public class equipe {
    private String nomeEquipe;
    private String descricao;
    private List<usuario> membros;


    //Modo construtor

    public equipe(String nomeEquipe, String descricao, List<usuario> membros){
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

    public List<usuario> getMembros(){
        return this.membros;
    }

    public void setMembros(List<usuario> membros){
        this.membros = membros;
    }


}
