package praticas.orientacaoObjetos.metodos.parametros.test;

import praticas.orientacaoObjetos.metodos.parametros.dominio.Calculadora;
import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();

        // Menu de operações
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Digite sua opção (1-4): ");
        int opcao = input.nextInt();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");

        // Escolha da operação com tratamento
        switch (opcao) {
            case 1:
                calculadora.soma(numero1, numero2);
                break;
            case 2:
                calculadora.subtracao(numero1, numero2);
                break;
            case 3:
                calculadora.multiplicacao(numero1, numero2);
                break;
            case 4:
                if (numero1 == 0 || numero2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    calculadora.divisao(numero1, numero2);
                }
                break;
            default:
                System.out.println("Opção inválida. Escolha entre 1 e 4.");
        }

        input.close();
    }
}

