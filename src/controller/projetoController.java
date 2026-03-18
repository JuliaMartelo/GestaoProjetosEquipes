package controller;

import model.projeto;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class projetoController {
    private List <projeto> projetos = new ArrayList<>();

    public void cadastrarProjeto (String nome, String descricao, LocalDate dataInicio, LocalDate dataTerminoPrevista,String status){

        projeto novoProjeto = new projeto(nome, descricao, dataInicio, dataTerminoPrevista, status);

        projetos.add (novoProjeto);
        System.out.println("Projeto" + nome + "cadastrado com sucesso!");
    }
    public List <projeto> filtrarPorStatus (String statusBusca) {
        List<projeto> filtrados = new ArrayList<>();
        for (projeto p : projetos) {
            if (p.getStatus().equalsIgnoreCase(statusBusca)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
}

