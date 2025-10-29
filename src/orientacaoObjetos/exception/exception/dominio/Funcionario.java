package orientacaoobjetos.exception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    // na sobreecrita de metodo não é obrigatório colocar as mesma exceções
    // caso coloque tem que tratar ao não do tipo Runtime que não precisa
    // e não pode colocar exceções genericas
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionario");
    }
}
