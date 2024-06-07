import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();

        u.setIdusuario(1);
        u.setNome("Guilherme");
        u.setCpf("039.943.192-69");
        u.setEmail("guilhermeelizeu23@gmail.com");
        u.setTelefone("(69) 99224-1605");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
