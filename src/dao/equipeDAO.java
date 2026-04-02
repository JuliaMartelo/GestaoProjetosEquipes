package dao;

import model.conexao;
import model.equipe;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class equipeDAO {

    public void inserir(equipe e) {
        String sql = "INSERT INTO equipe (nomeEquipe, descricao) VALUES (?, ?)";

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, e.getNomeEquipe());
            stmt.setString(2, e.getDescricao());

            stmt.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<equipe> listar() {
        List<equipe> lista = new ArrayList<>();
        String sql = "SELECT * FROM equipe";

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                equipe e = new equipe(
                        rs.getString("nomeEquipe"),
                        rs.getString("descricao"),
                        new ArrayList<>() // membros vazio por enquanto
                );

                lista.add(e);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    public void atualizar(equipe e) {
        String sql = "UPDATE equipe SET nomeEquipe=?, descricao=? WHERE nomeEquipe=?";

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, e.getNomeEquipe());
            stmt.setString(2, e.getDescricao());

            // identificador (já que não tem ID)
            stmt.setString(3, e.getNomeEquipe());

            stmt.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void deletar(String nomeEquipe) {
        String sql = "DELETE FROM equipe WHERE nomeEquipe=?";

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeEquipe);
            stmt.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}