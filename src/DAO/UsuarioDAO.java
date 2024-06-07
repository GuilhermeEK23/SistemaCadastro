package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Usuario;

public class UsuarioDAO {
    
    public void cadastrarUsuario(Usuario user){
        String sql = "INSERT INTO USUARIO (IDUSUARIO, NOME, CPF, EMAIL, TELEFONE) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, user.getIdusuario());
            ps.setString(2, user.getNome());
            ps.setString(3, user.getCpf());
            ps.setString(4, user.getEmail());
            ps.setString(5, user.getTelefone());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
