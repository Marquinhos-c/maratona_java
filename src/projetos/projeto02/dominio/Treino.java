package projetos.projeto02.dominio;

public class Treino {
    private String nome;
    private String dificuldade;
    private double duracao;
    private Professor professor;

    public Treino(String nome, String dificuldade, double duracao) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.duracao = duracao;
    }

    public void dadosTreino() {
        System.out.println("=== Dados do Treino ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Dificuldade: " + this.dificuldade);
        System.out.println("Duração: " + this.duracao + " minutos");
        if (professor != null) {
            System.out.println("Professor: " + professor.getNome());
        } else {
            System.out.println("Professor: [não definido");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }
    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
