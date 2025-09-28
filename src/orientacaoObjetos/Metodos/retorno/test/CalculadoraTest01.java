package orientacaoobjetos.metodos.retorno.test;

import orientacaoobjetos.metodos.retorno.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Adição:");
        calculadora.somaDoisNumeros();

        System.out.println("Subtração");
        calculadora.subtraiDoisNumeros();
    }
}
