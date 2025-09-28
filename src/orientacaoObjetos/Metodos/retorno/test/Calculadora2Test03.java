package orientacaoobjetos.metodos.retorno.test;

import orientacaoobjetos.metodos.retorno.dominio.Calculadora2;

public class Calculadora2Test03 {
    public static void main(String[] args) {
        Calculadora2 calculadora = new Calculadora2();

        double resultado1 = calculadora.divideDoisNumeros(20, 2);
        System.out.println("Resultado da divisão: " + resultado1);
        System.out.println("------------------------------");

        double resultado2 = calculadora.divideDoisNumeros2(20, 2);
        System.out.println("Resultado da divisão: " + resultado2);
        System.out.println("------------------------------");

        calculadora.divideDoisNumeros3(20, 2);
    }
}
