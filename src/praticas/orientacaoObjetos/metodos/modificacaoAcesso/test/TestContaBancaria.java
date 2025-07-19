package praticas.orientacaoObjetos.metodos.modificacaoAcesso.test;

import praticas.orientacaoObjetos.metodos.modificacaoAcesso.dominio.ContaBancaria;

import java.util.Scanner;

public class TestContaBancaria {
    public static void main(String[] args) {
        // Cria uma instância de ContaBancaria
        ContaBancaria conta = new ContaBancaria();

        // Cria um Scanner para entrada de dados do usuário
        Scanner input = new Scanner(System.in);

        // Variável de controle do loop principal
        boolean continuar = true;

        // Define dados fixos da conta
        System.out.println("Nome titular da conta: ");
        String nomeTitular = input.nextLine();
        conta.setTitular(nomeTitular);

        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
        conta.setNumeroConta(numeroConta);

        // Loop principal do menu de operações
        while (continuar) {
            // Exibe o menu de opções
            System.out.println("\nMENU: ");
            System.out.println("1 - saque");
            System.out.println("2 - deposito");
            System.out.println("Escolha uma opção: ");
            int opcao = input.nextInt();
            input.nextLine();

            // Trata a opção escolhida
            switch (opcao) {
                case 1:
                    // Operação de saque
                    System.out.println("Valor do saque: ");
                    double valorSaque = input.nextDouble();
                    input.nextLine();
                    conta.saque(valorSaque);
                    break;

                case 2:
                    // Operação de depósito
                    System.out.println("Valor a depositar: ");
                    double valorDeposito = input.nextDouble();
                    input.nextLine();
                    conta.depositar(valorDeposito);
                    break;

                default:
                    // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida!");
            }
            // Exibe os dados atualizados da conta
            System.out.println("\n=== Detalhes da Conta ===");
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Número conta: " + conta.getNumeroConta());
            System.out.printf("Saldo da conta: R$ %.2f%n ", conta.getSaldo());

            // Pergunta ao usuário se deseja continuar
            System.out.println("\nDeseja continuar? [S/N] ");
            String resposta = input.nextLine().trim();

            // Valida a resposta do usuário
            while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("Resposta inválida. Digite [ S ou N ]: ");
                resposta = input.nextLine().trim();
            }
            // Atualiza a variável de controle para sair do loop, se necessário
            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        System.out.println("\nOperações Finalizadas!");
        // Fecha o scanner para evitar vazamento de recursos
        input.close();
    }
}