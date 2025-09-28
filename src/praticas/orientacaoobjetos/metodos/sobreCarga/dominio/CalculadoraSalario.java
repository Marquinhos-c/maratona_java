package praticas.orientacaoobjetos.metodos.sobreCarga.dominio;
// sobrecarga de metodos
public class CalculadoraSalario {

    public double calcularSalario (double salarioBase) {
        return salarioBase;
    }
    public double calcularSalario (double salarioBase, double bonus) {
        return salarioBase + bonus;
    }

    public double calcularSalario (double salarioBase, int diasFaltados) {
        double descontoPorFalta = 0.02;
        double percentualTotalDesconto = descontoPorFalta * diasFaltados;
        double valorDesconto = salarioBase * percentualTotalDesconto;
        return salarioBase - valorDesconto;
    }
}
