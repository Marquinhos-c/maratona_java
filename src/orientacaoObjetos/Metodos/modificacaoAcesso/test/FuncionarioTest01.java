package orientacaoObjetos.metodos.modificacaoAcesso.test;

import orientacaoObjetos.metodos.modificacaoAcesso.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Marcos");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{2200.50, 3100.80, 2924.35});

        funcionario.imprimirDados();
        System.out.printf("\nMédia: %.2f", funcionario.getMediaSalarios());
    }
}
