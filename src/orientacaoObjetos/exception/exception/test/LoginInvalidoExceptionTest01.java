package orientacaoobjetos.exception.exception.test;

import orientacaoobjetos.exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException{

        Scanner input = new Scanner(System.in);

        String usernameDB = "Goku";
        String passwordDB = "1234";

        System.out.println("Usuário: ");
        String usernameDigitado = input.nextLine();
        System.out.println("Senha: ");
        String passwordDigitado = input.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
