package orientacaoObjetos.Metodos.retorno.test;

import orientacaoObjetos.Metodos.retorno.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Adição:");
        calculadora.somaDoisNumeros();

        System.out.println("Subtração");
        calculadora.subtraiDoisNumeros();
    }
}
