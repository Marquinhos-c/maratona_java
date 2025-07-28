package orientacaoObjetos.associacao.test;

import orientacaoObjetos.associacao.dominio.Aluno;
import orientacaoObjetos.associacao.dominio.Local;
import orientacaoObjetos.associacao.dominio.Professor;
import orientacaoObjetos.associacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno1 = new Aluno("Luffy", 17);
        Aluno aluno2 = new Aluno("Marcos", 22);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno1, aluno2};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprimeDados();
    }
}
