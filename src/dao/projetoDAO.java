package dao;

import model.conexao;
import model.projeto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class projetoDAO {

    public void inserir(projeto p) {
        String sql = "INSERT INTO projeto (nomeProjeto, descricao, dataI, dataT, status, gerente) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNomeProjeto());
            stmt.setString(2, p.getDescricao());
            stmt.setDate(3, Date.valueOf(p.getDataI()));
            stmt.setDate(4, Date.valueOf(p.getDataT()));
            stmt.setString(5, p.getStatus());
            stmt.setString(6, p.getGerente());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<projeto> listar() {
        List<projeto> lista = new ArrayList<>();
        String sql = "SELECT * FROM projeto";

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                projeto p = new projeto(
                        rs.getString("nomeProjeto"),
                        rs.getString("descricao"),
                        rs.getDate("dataI").toLocalDate(),
                        rs.getDate("dataT").toLocalDate(),
                        rs.getString("status"),
                        rs.getString("gerente")
                );

                lista.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void atualizar(projeto p) {
        String sql = "UPDATE projeto SET nomeProjeto=?, descricao=?, dataI=?, dataT=?, status=?, gerente=? WHERE nomeProjeto=?";

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNomeProjeto());
            stmt.setString(2, p.getDescricao());
            stmt.setDate(3, Date.valueOf(p.getDataI()));
            stmt.setDate(4, Date.valueOf(p.getDataT()));
            stmt.setString(5, p.getStatus());
            stmt.setString(6, p.getGerente());

            // identificador (já que não tem ID)
            stmt.setString(7, p.getNomeProjeto());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletar(String nomeProjeto) {
        String sql = "DELETE FROM projeto WHERE nomeProjeto=?";

        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeProjeto);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}