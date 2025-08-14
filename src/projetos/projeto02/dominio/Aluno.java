package projetos.projeto02.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private Treino treino;

    // Construtor 1
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    // Construtor 2 (sobrecarga)
    public Aluno(String nome, int idade, double peso, double altura) {
        this(nome, idade);
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Exibe no console a ficha completa do aluno, incluindo dados pessoais,
     * físicos e o treino associado (se houver).
     */
    public void mostrarFichaCompleta() {
        System.out.println("=== Ficha do Aluno ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + (peso > 0 ? peso : "[ não informado! ]"));
        System.out.println("Altura: " + (altura > 0 ? altura : "[ não informado! ]"));

        if (treino != null) {
            System.out.println("\nTreino: ");
            System.out.println("Nome : " + treino.getNome());
            System.out.println("Duração: " + treino.getDuracao());
            System.out.println("Dificuldade: " + treino.getDificuldade());

            if (treino.getProfessor() != null) {
                System.out.println("Professor: " + treino.getProfessor().getNome());
            } else {
                System.out.println("Professor: [não definido]");
            }
        } else {
            System.out.println("\nTreino: [nenhum treino cadastrado]");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Treino getTreino() {
        return treino;
    }
    public void setTreino(Treino treino) {
        this.treino = treino;
    }
}
