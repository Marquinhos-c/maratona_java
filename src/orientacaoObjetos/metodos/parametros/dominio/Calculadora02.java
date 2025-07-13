package orientacaoObjetos.metodos.parametros.dominio;

public class Calculadora02 {
   // Array - recebendo multiplos valores
    public void somaArray(int[] numeros ) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    // Varargs - uma forma de receber multiplos valores igual array
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
