package orientacaoObjetos.metodos.retorno.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    // o metodo void, é por que não tem retorno
    public void subtraiDoisNumeros() {
        System.out.println(2025-2003);
    }

    // passagem de parâmetros
    public void multiplicaDoisValores(int num1, int num2) {//parametros
        System.out.println("Multiplicação " + num1 * num2);
    }
}