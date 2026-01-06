package orientacaoobjetos.heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcinário 2 ");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcinário");
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Salário: " + this.salario);
    }
    public void relatorioPagamento() {
        System.out.println("\nEu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
