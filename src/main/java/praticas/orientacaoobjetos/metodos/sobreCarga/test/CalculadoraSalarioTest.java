package praticas.orientacaoobjetos.metodos.sobreCarga.test;

import praticas.orientacaoobjetos.metodos.sobreCarga.dominio.CalculadoraSalario;

public class CalculadoraSalarioTest {
    public static void main(String[] args) {
        CalculadoraSalario calculadora = new CalculadoraSalario();

        System.out.println("Salário base: " + calculadora.calcularSalario(3000));
        System.out.println("Salário com bônus: " + calculadora.calcularSalario(3000, 300.0));
        System.out.println("Salário com 3 falta: " + calculadora.calcularSalario(3000, 3));
    }
}
