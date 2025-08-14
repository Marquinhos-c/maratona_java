package projetos.projeto02.test;

import projetos.projeto02.dominio.Academia;
import projetos.projeto02.dominio.Aluno;
import projetos.projeto02.dominio.Professor;
import projetos.projeto02.dominio.Treino;

public class TestAcademia {
    public static void main(String[] args) {
        // Criando o objeto Academia
        Academia academia = new Academia("Caverna", "Rua Marechal, 372", "Das 6:00 á 21:00");

        // Criando objetos Aluno, Treino e Professor
        Aluno aluno1 = new Aluno("Marcos", 22, 72, 1.79);
        Treino treino = new Treino("Inferior", "Médio", 40);
        Professor professor = new Professor("José", "Musculação", 1010);

        // Associando professor ao treino
        treino.setProfessor(professor);
        // Associando treino ao aluno
        aluno1.setTreino(treino);

        // Método estático que exibe dados institucionais da academia
       Academia.dadosAcademia();

        // Exibindo a ficha completa do aluno com treino e professor
        aluno1.mostrarFichaCompleta();
    }
}
