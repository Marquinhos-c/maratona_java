package praticas.array;

import java.util.Scanner;

/*
Peça ao usuário para digitar 10 números e armazene em um array.
 Depois, conte quantos são pares e quantos são ímpares.
 */

public class Pratica {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner numero = new Scanner(System.in);
        int contadorPar = 0, contadorImpar = 0;

        System.out.println("Preciso que digite 10 números: \n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i+1) + ": ");
            numeros[i] = numero.nextInt();

            if (numeros[i] % 2 == 0) {
                contadorPar++;
            }else {
                contadorImpar++;
            }
        }
        System.out.println("Total de número pares " + contadorPar);
        System.out.println("Total de números impares " + contadorImpar);
    }
}
