package praticas.orientacaoObjetos.metodos.test;

import praticas.orientacaoObjetos.metodos.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno mediaAluno = new Aluno();

        mediaAluno.nome = "Marcos";
        mediaAluno.nota1 = 9.5;
        mediaAluno.nota2 = 9.8;
        mediaAluno.nota3 = 10;

        double media = mediaAluno.calcularMedia();
        System.out.printf(mediaAluno.nome + " ficou com média %.1f ",  media);
    }
}
