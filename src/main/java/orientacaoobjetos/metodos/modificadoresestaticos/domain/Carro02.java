package orientacaoobjetos.metodos.modificadoresestaticos.domain;

public class Carro02 {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    // Construtor da classe Carro02.
    public Carro02(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Método de instância que imprime as informações do carro.
    // Exibe o nome, a velocidade máxima individual e a velocidade limite global.
    public void imprime() {
        System.out.println("-------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade maxima: "+ this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro02.velocidadeLimite);
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

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro02.velocidadeLimite = velocidadeLimite;
    }
}
