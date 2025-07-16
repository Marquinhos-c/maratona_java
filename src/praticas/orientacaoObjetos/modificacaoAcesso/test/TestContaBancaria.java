package praticas.orientacaoObjetos.modificacaoAcesso.test;

import praticas.orientacaoObjetos.modificacaoAcesso.dominio.ContaBancaria;

import java.util.Scanner;

public class TestContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        conta.setTitular("Marcos Costa");
        conta.setNumeroConta(24250);

        while (continuar) {
            System.out.println("\nMENU: ");
            System.out.println("1 - saque");
            System.out.println("2 - deposito");
            System.out.println("Escolha uma opção: ");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Valor do saque: ");
                    double valorSaque = input.nextDouble();
                    input.nextLine();
                    conta.saque(valorSaque);
                    break;

                case 2:
                    System.out.println("Valor a depositar: ");
                    double valorDeposito = input.nextDouble();
                    input.nextLine();
                    conta.depositar(valorDeposito);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("\n=== Detalhes da Conta ===");
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Número conta: " + conta.getNumeroConta());
            System.out.printf("Saldo da conta: R$ %.2f%n ", conta.getSaldo());

            System.out.println("\nDeseja continuar? [S/N] ");
            String resposta = input.nextLine().trim();
            while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Resposta inválida. Digite [ S ou N ]: ");
                resposta = input.nextLine().trim();
                input.nextLine();
            }
            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        System.out.println("\nOperações Finalizadas!");
        input.close();
    }
}