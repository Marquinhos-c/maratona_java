package praticas.orientacaoobjetos.exception.test;

import praticas.orientacaoobjetos.exception.dominio.UsuarioEmUsoException;

import java.util.Scanner;

public class CadastroUsuarioTest {
    public static void main(String[] args) {
        try {
            cadastrar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void cadastrar() throws UsuarioEmUsoException {
        Scanner input = new Scanner(System.in);

        String usuario = "Marquinhos";

        System.out.println("Digite o nome do usuario: ");
        String usuarioDigitado = input.nextLine();

        if (usuarioDigitado.equals(usuario)) {
            throw  new UsuarioEmUsoException("Usuario em uso");
        }
        System.out.println("Usuario valido");
    }
}
