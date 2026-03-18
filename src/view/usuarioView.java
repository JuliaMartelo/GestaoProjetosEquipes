package view;

import controller.usuarioController;
import model.usuario;
import java.util.List;
import java.util.Scanner;

public class usuarioView {

    Scanner scanner = new Scanner(System.in);

    usuarioController controller = new usuarioController();

    public void iniciarMenu(){

        int opcao;

        do{
            System.out.println("\n===== MENU USUÁRIO =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - Voltar");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Opção cadastrar selecionada.");
                    cadastrarUsuario();

                    break;

                case 2:
                    System.out.println("Opção de listar selecionada");
                    listarUsuario();
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);
    }

    public void cadastrarUsuario(){
        scanner.nextLine(); // limpar

        System.out.println("Digite o seu nome: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite o seu email : ");
        String email = scanner.nextLine();

        System.out.println("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite o seu cargo:");
        String cargo = scanner.nextLine();

        System.out.println("Escolha seu nome de usuário: ");
        String login = scanner.nextLine();

        System.out.println("Escolha sua senha: ");
        String senha = scanner.nextLine();

        System.out.println("Digite o perfil:");
        String perfil = scanner.nextLine();

        controller.cadastrarUsuario(nomeCompleto, email, cpf, cargo, login, senha, perfil);
    }


    public void listarUsuario(){

        List<usuario> usuarios = controller.listarUsuario();

        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        for(usuario u : usuarios){

            System.out.println("\n===== USUÁRIO =====");
            System.out.println("Nome: " + u.getNomeCompleto());
            System.out.println("Email: " + u.getEmail());
            System.out.println("CPF: " + u.getCpf());
            System.out.println("Cargo: " + u.getCargo());
            System.out.println("Login: " + u.getLogin());
            System.out.println("Perfil: " + u.getPerfil());
            System.out.println("----------------------");

        }

    }

}