import view.usuarioView;

public class Main {
    public static void main(String[] args){
        usuarioView view = new usuarioView();

        view.iniciarMenu();
        view.cadastrarUsuario();
        view.listarUsuario();
    }
}