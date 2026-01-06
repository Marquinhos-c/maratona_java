package orientacaoobjetos.classesabstratas.dominio;
/**
 * Representa um funcionário de forma abstrata.
 *
 * Esta classe serve como base para todos os tipos de funcionários da empresa,
 * definindo atributos e comportamentos comuns, como nome e salário.
 * Ela força as subclasses a implementarem sua própria lógica de cálculo de bônus.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    /**
     * Método abstrato que calcula o valor do bônus para o funcionário.
     *
     * A lógica específica de cálculo (a porcentagem, por exemplo) deve ser
     * implementada nas subclasses concretas (Gerente, Desenvolvedor, etc.).
     *
     * @return um {@code double} com o valor do bônus calculado.
     */
    public abstract double calcularBonus();

    /**
     * Método concreto para exibir os dados do funcionário.
     * Este método é compartilhado por todas as subclasses.
     */
    public void imprimirDados() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.printf("Salário Base: R$ %.2f%n", this.salario);
    }

    // --- Getters ---
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
