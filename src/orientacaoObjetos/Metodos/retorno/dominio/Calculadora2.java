package orientacaoObjetos.Metodos.retorno.dominio;

public class Calculadora2 {
    // retorno de um valor double
    public double divideDoisNumeros(double num1, double num2){
        // se não colocar retorno 0, vai retornar "infynit"
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // segunda maneira
    public double divideDoisNumeros2(double num1, double num2) {
        if (num1 != 0 && num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    // terceira maneira usando retorno com void
    public void divideDoisNumeros3(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return; // evitando que retorno do "infynit" e so funciona dentro do metodo void
        }
        System.out.println("Resultado da divisão: " + num1 / num2);
    }
}
