package orientacaoObjetos.Metodos.parametros.test;

import orientacaoObjetos.Metodos.parametros.dominio.Calculadora;
/*
Em Java, quando você passa um tipo primitivo (como int)
para um método, o que é passado é uma cópia do valor,
não a variável original. Isso significa:
- numero1 recebe uma cópia de a
- numero2 recebe uma cópia de b
- Alterar numero1 e numero2 não altera a e b
 */
public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora alterador = new Calculadora();
        // passando copia de "a e b" para "numero1 e numero2"
        int a = 1;
        int b = 2;
        // após passar a copia a e b não são alterados
        alterador.alteraDoisNumeros(a, b);
        System.out.println("Dentro Calculadora Test");
        System.out.println("num1 " + a);
        System.out.println("num2 " + b);
    }
}
