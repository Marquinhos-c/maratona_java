package praticas.orientacaoObjetos.associacao.test;

import praticas.orientacaoObjetos.associacao.dominio.Aluno;
import praticas.orientacaoObjetos.associacao.dominio.Seminario;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marcos", 22);
        Aluno aluno2 = new Aluno("Evenlly", 18);
        Seminario seminario = new Seminario("Português");

        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        System.out.println("--- Dados do Aluno ---");
        aluno1.imprimeDados();
        System.out.println("\n--- Dados do Aluno ---");
        aluno2.imprimeDados();
    }
}
