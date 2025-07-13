package estruturaRepeticao;

public class Introducao {
    public static void main(String[] args) {
        // contar de 1 até 10 usando estruturas de repetição
        int contador = 1;
        while (contador <= 10) { // while: executa enquanto a condição ser verdadeira
            System.out.println(contador);
            contador += 1;
        }

        System.out.println("\n");

        contador = 1;
        do { // do-while: executa uma vez mesmo se codição for falsa, ele verifica a condição no final
            System.out.println("Dentro do do-while " + contador);
            contador += 1;
        }while (contador <= 10);

        System.out.println("\n");
        // for: para i de 1 até 10 incrementando de 1 em 1.
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
    }
}
