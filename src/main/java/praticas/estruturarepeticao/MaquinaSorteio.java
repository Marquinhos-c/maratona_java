package praticas.estruturarepeticao;

import java.util.Random;
import java.util.Scanner;

/*
Colocar estas duas linhas iniciais no método Main():
Random rnd = new Random(); //Inicia Aleatório
int x = rnd.nextInt(100); //Gera um número aleatório (0 – 99)
1. Faça um laço de repetição que solicite ao usuário digitar
um número;
2. O laço encerra quando o usuário acertar o número;
3. Se o número do usuário for menor que o oculto,
escrever: “MAIOR”, se o número do usuário for maior que
o oculto, escrever: “MENOR”.

 */
public class MaquinaSorteio {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int numero = sorteio.nextInt(100);
        Scanner input = new Scanner(System.in);
        boolean continua = true;
        int numeroEscolhido;

        while (continua) {
            System.out.println("Chute um número de 0 a 99: ");
             numeroEscolhido = input.nextInt();
             if (numeroEscolhido < 0 || numeroEscolhido > 99) {
                 System.out.println("Digite um número valido! ");
             } else if (numeroEscolhido > numero) {
                 System.out.println("Chute alto");
             } else if (numeroEscolhido < numero) {
                 System.out.println("Chute baixo");
             } else {
                 System.out.println("Parabéns, você acertou!");
                 continua = false;
             }
        }
        System.out.println("Jogo finalizado! ");
        input.close();
    }
}
