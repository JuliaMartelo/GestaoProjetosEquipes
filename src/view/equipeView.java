package view;

import model.equipe;
import java.util.List;
import java.util.Scanner;

public class equipeView {

    Scanner scanner = new Scanner(System.in);

    public int iniciarMenu() {

        System.out.println("\n--- MENU EQUIPES ---");
        System.out.println("1 - Cadastrar equipe");
        System.out.println("2 - Listar equipes");
        System.out.println("0 - Voltar");

        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String pedirNomeEquipe() {

        scanner.nextLine();
        System.out.print("Digite o nome da equipe: ");
        return scanner.nextLine();

    }

    public String pedirDescricaoEquipe() {

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