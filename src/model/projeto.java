package model;

import java.time.LocalDate;

public class projeto {
    private String nomeProjeto;
    private String descricao;
    private LocalDate dataI;
    private LocalDate dataT;
    private String status;
    private String gerente;


    //Modo construtor

    public projeto(String nomeProjeto, String descricao, LocalDate dataI, LocalDate dataT, String status, String gerente){
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataI = dataI;
        this.dataT = dataT;
        this.status = status;
        this.gerente = gerente;
    }

    //Getters e Setters
    public String getNomeProjeto(){
        return this.nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto){
        this.nomeProjeto = nomeProjeto;
    }


    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }


    public LocalDate getDataI(){
        return this.dataI;
    }

    public void setDataI(LocalDate dataI){
        this.dataI = dataI;
    }


    public LocalDate getDataT(){
        return this.dataT;
    }

    public void setDataT(LocalDate dataT){
        this.dataT = dataT;
    }


    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getGerente(){
        return this.gerente;
    }

    public void setGerente(String gerente){
        this.gerente = gerente;
    }

}
