package orientacaoObjetos.heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

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
