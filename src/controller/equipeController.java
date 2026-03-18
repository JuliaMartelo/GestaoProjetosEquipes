package controller;
import model.equipe;
import model.usuario;
import java.util.ArrayList;
import java.util.List;

public class equipeController {
    private List <equipe> equipes = new ArrayList<>();
    public void cadastrarEquipe ( String nomeEquipe, String descricao, List <usuario> membros){
        equipe novaEquipe = new equipe(nomeEquipe, descricao, membros);
        equipes.add(novaEquipe);
        System.out.println("Equipe " + nomeEquipe + " criada com " + membros.size() + " membros!");
    }
    public List<equipe> listarEquipes (){
        return equipes;
    }
    public void adicionarMembros (equipe e, usuario u) {
        e.getMembros().add(u);
        System.out.println("Usuário " + u.getNomeCompleto() + " adicionado à equipe " + e.getNomeEquipe());
    }
}