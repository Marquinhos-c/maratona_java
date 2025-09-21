package orientacaoObjetos.classesabstratas.dominio;
/**
 * Representa um funcionário do tipo Gerente.
 * Herda de {@link Funcionario} e implementa sua própria regra de bônus.
 */
public class Gerente extends Funcionario{

    private static final double PERCENTUAL_BONUS = 0.15; // 15%

    public Gerente(String nome, double salario) {
        // Chama o construtor da classe pai (Funcionario)
        super(nome, salario);
    }

    /**
     * Calcula o bônus para um Gerente, que corresponde a 15% do seu salário.
     * @return o valor do bônus.
     */
    @Override
    public double calcularBonus() {
        return this.getSalario() * PERCENTUAL_BONUS;
    }


}
