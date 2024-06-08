import java.sql.ResultSet;

import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        /*Usuario u = new Usuario();

        u.setIdusuario(2);
        u.setNome("Raissa");
        u.setCpf("044.266.752-35");
        u.setEmail("raissaasilva12345@gmail.com");
        u.setTelefone("(69) 99965-3521");

        new UsuarioDAO().cadastrarUsuario(u);*/
        Usuario u = new Usuario();
        ResultSet result = new UsuarioDAO().consultarUsuario();
            
        while (result.next()) {
            u.setIdusuario(result.getInt("idusuario"));
            u.setNome(result.getString("nome"));
            u.setCpf(result.getString("cpf"));
            u.setEmail(result.getString("email"));
            u.setTelefone(result.getString("telefone"));

            System.out.println("Id = " + u.getIdusuario() + ", Nome = " + u.getNome() + ", CPF = " + u.getCpf() + ", Email = " + u.getEmail() + " e telefone = " + u.getTelefone());
        }
        result.close();
    }
}
