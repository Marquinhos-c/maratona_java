package praticas.orientacaoobjetos.metodos.modificacaoAcesso.test;

import praticas.orientacaoobjetos.metodos.modificacaoAcesso.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario dados = new Funcionario();

        dados.setNome("Marcos");
        dados.setMatricula(1010);

        dados.acessoMetodosPrivado();
        dados.imprimeDados02();
    }
}
