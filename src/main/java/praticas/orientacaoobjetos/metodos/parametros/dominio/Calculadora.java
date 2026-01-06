package praticas.orientacaoobjetos.metodos.parametros.dominio;

public class Calculadora {

    public int soma(int a, int b) {
        int resultado = a + b;
        System.out.println("Resultado da soma: " + resultado);
        return resultado;
    }

    public int subtracao(int a, int b) {
        int resultado = a - b;
        System.out.println("Resultado da subtração: " + resultado);
        return resultado;
    }

    public int multiplicacao(int a, int b) {
        int resultado = a * b;
        System.out.println("Resultado da multiplicação: " + resultado);
        return resultado;
    }

    public double divisao(int a, int b) {
        double resultado = (double) a / b;
        System.out.println("Resultado da divisão: " + resultado);
        return resultado;
    }
}
