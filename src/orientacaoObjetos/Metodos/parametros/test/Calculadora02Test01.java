package orientacaoObjetos.Metodos.parametros.test;

import orientacaoObjetos.Metodos.parametros.dominio.Calculadora02;

public class Calculadora02Test01 {
    public static void main(String... args) {
        Calculadora02 calculadora = new Calculadora02();
        int[] valores = {1, 2, 3, 4, 5};

        // chamando o metodo somaArray e passando os valores do array
        calculadora.somaArray(valores);

        // chamando o metodo somaVarArgs e passando valores direto
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
