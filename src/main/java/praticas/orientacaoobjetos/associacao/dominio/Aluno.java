package praticas.orientacaoobjetos.associacao.dominio;
/*
Crie as classes Aluno e Seminario. Cada aluno pode estar inscrito em apenas um seminário, mas o seminário não precisa saber quem são seus alunos.
Requisitos:
Aluno: nome, idade, seminário (objeto).
Crie um método para imprimir os dados do aluno e o nome do seminário que ele está inscrito.
 */
public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno (String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminário: " + this.seminario.getNome());
        } else {
            System.out.println("Seminário: Nenhum inscrito");
        }
    }

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

    public Seminario getSeminario() {
        return seminario;
    }
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}