package view;

import controller.equipeController;
import controller.usuarioController;
import model.equipe;
import model.usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class equipeView {

    Scanner scanner = new Scanner(System.in);

    equipeController controller = new equipeController();


    public void iniciarMenu() {

        int opcao;

        do{
            System.out.println("\n--- MENU EQUIPES ---");
            System.out.println("1 - Cadastrar equipe");
            System.out.println("2 - Listar equipes");
            System.out.println("0 - Voltar");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Opção cadastrar selecionada.");
                    cadastrarEquipe();

                    break;

                case 2:
                    System.out.println("Opção de listar selecionada");
                    listarEquipe();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);


    }

    public String cadastrarEquipe() {

        scanner.nextLine(); // limpar

        System.out.println("Digite o nome da equipe: ");
        String nomeEquipe = scanner.nextLine();

        System.out.println("Digite a descrição da equipe : ");
        String descricao = scanner.nextLine();

        System.out.println("Quantos membros deseja adicionar?");
        int qtd = scanner.nextInt();
        scanner.nextLine();

        List<usuario> membros = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do usuário:");
            String nomeCompleto = scanner.nextLine();

            System.out.println("Digite o CPF:");
            String cpf = scanner.nextLine();

            System.out.println("Digite o email:");
            String email = scanner.nextLine();

            System.out.println("Digite o cargo:");
            String cargo = scanner.nextLine();

            System.out.println("Digite o login:");
            String login = scanner.nextLine();

            System.out.println("Digite a senha:");
            String senha = scanner.nextLine();

            System.out.println("Digite o perfil:");
            String perfil = scanner.nextLine();



            usuario u = new usuario (nomeCompleto, cpf , email , cargo, login , senha , perfil);
            membros.add(u);
        }


        controller.cadastrarEquipe(nomeEquipe, descricao, membros);
        return("Cadastrado com sucesso!");

    }

    public String listarEquipe() {

        System.out.print("Digite a descrição da equipe: ");
        return scanner.nextLine();
    }

    public void mostrarEquipes(List<equipe> equipes) {

        System.out.println("\n==== LISTA DE EQUIPES ====");

        if (equipes.isEmpty()) {
            System.out.println("Nenhuma equipe cadastrada.");
            return;
        }

//        for(equipe e
    }
}