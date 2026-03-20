package view;

import controller.projetoController;
import controller.usuarioController;
import model.projeto;
import model.usuario;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class projetoView {

    Scanner scanner = new Scanner(System.in);

    projetoController controller = new projetoController();


    public void iniciarMenu() {

        int opcao;

        do{

            System.out.println("\n--- MENU PROJETOS ---");
            System.out.println("1 - Cadastrar projeto");
            System.out.println("2 - Listar projetos");
            System.out.println("0 - Voltar");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Opção cadastrar selecionada.");
                    cadastrarProjeto();

                    break;

                case 2:
                    System.out.println("Opção de listar selecionada");
                    listarProjeto();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);

    }




    public String cadastrarProjeto(){

        scanner.nextLine();

        System.out.println("Digite o nome do projeto: ");
        String nomeProjeto = scanner.nextLine();

        System.out.println("Digite a descrição do projeto: ");
        String descricao = scanner.nextLine();

        System.out.println("Digite a data de início: ");
        LocalDate dataI = LocalDate.parse(scanner.next());

        System.out.println("Digite a data de término: ");
        LocalDate dataT = LocalDate.parse(scanner.next());

        System.out.println("Digite o status do projeto: ");
        String status = scanner.nextLine();

        System.out.println("Digite o nome do gerente responsável: ");
        String gerente = scanner.nextLine();

        controller.cadastrarProjeto(nomeProjeto, descricao, dataI, dataT, status, gerente);

        return "Projeto cadastrado com sucesso!";
    }



    public void listarProjeto(){

        List<projeto> projetos = controller.listarProjeto();

        System.out.println("\n==== LISTA DE PROJETOS ====");

        if(projetos.isEmpty()){
            System.out.println("Nenhum projeto cadastrado.");
            return;
        }

        for(projeto p : projetos){
            System.out.println("Nome do Projeto: " + p.getNomeProjeto());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Data de início: " + p.getDataI());
            System.out.println("Data de término: " + p.getDataT());
            System.out.println("Status do projeto: " + p.getStatus());
            System.out.println("Gerente responsável: " + p.getGerente());
            System.out.println("---------------------------");
        }

    }

}
