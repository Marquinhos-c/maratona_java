package orientacaoobjetos.classesabstratas.dominio;

public class Desenvolvedor extends Funcionario{

    private static final double PERCENTUAL_BONUS = 0.1;

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.getSalario() * PERCENTUAL_BONUS;
    }
}
