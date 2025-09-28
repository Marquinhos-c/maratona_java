package praticas.orientacaoobjetos.associacao.test;

import praticas.orientacaoobjetos.associacao.dominio.Alunos;
import praticas.orientacaoobjetos.associacao.dominio.Curso;
import praticas.orientacaoobjetos.associacao.dominio.Escola;
import praticas.orientacaoobjetos.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Joelma");
        Alunos aluno1 = new Alunos("Marcos");
        Alunos aluno2 = new Alunos("Evenlly");
        Curso curso1 = new Curso("ADS");

        Alunos[] alunos = {aluno1, aluno2};
        curso1.setAlunos(alunos);

        curso1.setProfessor(professor);

        Curso[] cursos = {curso1};
        Escola escola = new Escola("IPOG", cursos);

        escola.imprimeDados();
    }
}
