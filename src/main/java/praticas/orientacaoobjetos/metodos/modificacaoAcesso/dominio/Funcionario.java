package praticas.orientacaoobjetos.metodos.modificacaoAcesso.dominio;
/*
    Crie uma classe Funcionario com métodos que tenham diferentes níveis de acesso (private, public).
    Depois, crie uma classe de teste e tente acessar cada método.
    Observe quais são acessíveis e quais não são.
 */
public class Funcionario {
    private String nome;
    private int matricula;

    private void imprimiDados() {
        System.out.println("Dentro do metodo privado\n");
        System.out.println(this.nome);
        System.out.println(this.matricula);
    }

    public void imprimeDados02() {
        System.out.println("---------------------------");
        System.out.println("Dentro do metodo público\n");
        System.out.println(this.nome);
        System.out.println(this.matricula);
    }

    public void acessoMetodosPrivado(){
        imprimiDados();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
