package view;

import model.projeto;
import java.util.List;
import java.util.Scanner;

public class projetoView {

    Scanner scanner = new Scanner(System.in);

    public int iniciarMenu(){

        System.out.println("\n--- MENU PROJETOS ---");
        System.out.println("1 - Cadastrar projeto");
        System.out.println("2 - Listar projetos");
        System.out.println("0 - Voltar");

        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String pedirNomeProjeto(){

        scanner.nextLine();
        System.out.print("Digite o nome do projeto: ");
        return scanner.nextLine();

    }

    public String pedirDescricao(){

        System.out.print("Digite a descrição do projeto: ");
        return scanner.nextLine();
    }

    public void mostrarProjetos(List<projeto> projetos){

        System.out.println("\n==== LISTA DE PROJETOS ====");

        if(projetos.isEmpty()){
            System.out.println("Nenhum projeto cadastrado.");
            return;
        }

        for(projeto p : projetos){
            System.out.println("Nome do Projeto: " + p.getNomeProjeto());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("---------------------------");
        }

    }

}
