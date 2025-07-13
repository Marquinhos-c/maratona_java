package arrays;

import java.util.Scanner;

public class Unidimensional {
    public static void main(String[] args) {
        // RETORNO DE VALORES AO SER ACESSADO E NÃO ESTIVER NADA ARMAZENADO
        // byte, short, int, long, float, e double = 0
        // char = '\u0000'
        // boolean = false
        // String = null
        int [] idades = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < idades.length ; i++) {
            System.out.println("Digite a idade: ");
            idades[i] = input.nextInt();
        }
        System.out.println("IDADES: ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
    }
}
