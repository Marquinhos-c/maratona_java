package orientacaoObjetos.metodos.modificadoresEstaticos.domain;
/*
    nome → é um atributo de instância (cada carro tem o seu).
    velocidadeMaxima → também é um atributo de instância.
    velocidadeLimite → é um atributo static, ou seja, é compartilhado entre todos os objetos da classe Carro
 */
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    // Construtor da classe Carro.
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Método de instância que imprime as informações do carro.
    // Exibe o nome, a velocidade máxima individual e a velocidade limite global.
    public void imprime() {
        System.out.println("-------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade maxima: "+ this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
