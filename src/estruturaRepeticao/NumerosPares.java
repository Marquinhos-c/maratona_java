package estruturaRepeticao;

public class NumerosPares {
    public static void main(String[] args) {
        // for: imprima numeros pares de 1 a 100
        for (int i = 1; i <= 100; ++i) {
            if (i % 2 == 0) { // usei o if para verifição, visando problemas futuro caso o indice ou uma variável seja alterada
                System.out.println(i);
            }
        }
        // while: imprima numeros pares de 1 a 100
        int contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador += 1;
        }
        // do-while: imprima numeros pares de 1 a 100
        contador = 1;
        do {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador += 1;
        }while (contador <= 100);
    }
}
