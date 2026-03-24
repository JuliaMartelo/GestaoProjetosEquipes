package controller;

import model.projeto;
import model.usuario;
import view.projetoView;


import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class projetoController {
    private List <projeto> projetos = new ArrayList<>();

    public void cadastrarProjeto (String nome, String descricao, LocalDate dataInicio, LocalDate dataT,String status, String gerente){

        projeto novoProjeto = new projeto(nome, descricao, dataInicio, dataT, status, gerente);

        projetos.add (novoProjeto);
        System.out.println("Projeto" + nome + "cadastrado com sucesso!");
    }




    public List<projeto> listarProjeto() {
        return projetos;

    }
}

