import view.usuarioView;
import view.projetoView;
import view.equipeView;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
//        usuarioView view = new usuarioView();
//
//
//        view.iniciarMenu();
//        view.cadastrarUsuario();
//        view.listarUsuario();


        Scanner scanner = new Scanner(System.in);

        usuarioView usuarioView = new usuarioView();
        projetoView projetoView = new projetoView();
        equipeView equipeView = new equipeView();

        int opcao;

        do {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Menu Usuários");
            System.out.println("2 - Menu Projetos");
            System.out.println("3 - Menu Equipes");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){

                case 1:
                    usuarioView.iniciarMenu();
                    break;

                case 2:
                    projetoView.iniciarMenu();
                    break;

                case 3:
                    equipeView.iniciarMenu();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }while(opcao != 0);
    }
}