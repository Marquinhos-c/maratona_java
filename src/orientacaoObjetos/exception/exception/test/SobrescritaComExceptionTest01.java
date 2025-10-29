package orientacaoobjetos.exception.exception.test;

import orientacaoobjetos.exception.exception.dominio.Funcionario;
import orientacaoobjetos.exception.exception.dominio.LoginInvalidoException;
import orientacaoobjetos.exception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
