package controller;
import model.usuario;
import view.usuarioView;

import java.util.ArrayList;
import java.util.List;

public class usuarioController {

    private List<usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(String nomeCompleto, String email, String cpf, String cargo, String login, String senha,String perfil){

        usuario Usuario = new usuario(nomeCompleto, email, cpf, cargo, login, senha, perfil);

        usuarios.add(Usuario);

        System.out.println("Usuário salvo com sucesso!");
    }

    public List <usuario>listarUsuario(){

        return usuarios;
    }

}
