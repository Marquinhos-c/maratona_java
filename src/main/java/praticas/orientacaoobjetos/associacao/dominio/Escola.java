package praticas.orientacaoobjetos.associacao.dominio;

public class Escola {
    private String nome;
    private Curso[] curso;

    public Escola(String nome) {
        this.nome = nome;
    }
    public Escola(String nome, Curso[] cursos) {
        this.nome = nome;
        this.curso = cursos;
    }

    public void imprimeDados() {
        // Escola
        System.out.println("--------------------");
        System.out.println("Nome da Escola: " + this.nome);

        // Curso
        System.out.println("\n--- Cursos ---");
        if (curso == null || curso.length == 0) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        for (Curso c : curso) {
            System.out.println("Curso: " + c.getNome());

            // Professor
            Professor prof = c.getProfessor();
            if (prof != null) {
                System.out.println("Professor responsável: " + prof.getNome());
            } else {
                System.out.println("Professor não definido.");
            }

            // Alunos
            Alunos[] alunos = c.getAlunos();
            if (alunos != null && alunos.length > 0) {
                System.out.println("\nAlunos:");
                for (Alunos a : alunos) {
                    System.out.println("- " + a.getNome());
                }
            } else {
                System.out.println("Nenhum aluno matriculado.");
            }

            System.out.println("--------------------");
        }
    }


    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso[] getCursos() {
        return curso;
    }
    public void setCursos(Curso[] cursos) {
        this.curso = cursos;
    }
}