package praticas.orientacaoObjetos.associacao.dominio;

public class Curso {
    private String nome;
    public Alunos[] alunos;
    private Professor professor;

    public Curso(String nome) {
        this.nome = nome;
    }
    public Curso(String nome, Alunos[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }
    public Curso(String nome, Alunos[] alunos, Professor professor) {
        this.nome = nome;
        this.alunos = alunos;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
