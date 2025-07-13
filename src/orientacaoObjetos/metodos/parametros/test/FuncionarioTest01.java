package orientacaoObjetos.metodos.parametros.test;

import orientacaoObjetos.metodos.parametros.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Marcos";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{2200.50, 3100.80, 2924.35};

        funcionario.imprimirDados();
    }
}
