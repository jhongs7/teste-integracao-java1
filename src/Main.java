class Usuario {
    int id;
    String nome;

    Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}

public class Main {

    public static Usuario login(String usuario, String senha) {
        if (usuario.equals("admin") && senha.equals("1234")) {
            return new Usuario(1, "Administrador");
        }
        return null;
    }

    public static String getPerfil(Usuario usuario) {
        if (usuario == null) {
            return "Usuário não autenticado";
        }
        return "Bem-vindo, " + usuario.nome;
    }

    public static void testeIntegracao() {
        System.out.println("Iniciando teste de integração...");

        Usuario usuario = login("admin", "1234");

        if (usuario == null) {
            System.out.println("Teste falhou! Usuário não autenticado.");
        } else {
            String perfil = getPerfil(usuario);
            System.out.println(perfil);
            System.out.println("Teste passou!");
        }
    }

    public static void main(String[] args) {
        testeIntegracao();
    }
}