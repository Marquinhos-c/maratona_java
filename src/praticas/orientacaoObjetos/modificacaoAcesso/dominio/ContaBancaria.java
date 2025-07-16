package praticas.orientacaoObjetos.modificacaoAcesso.dominio;
/**
 * Classe que representa uma conta bancária simples.
 * Permite realizar operações de depósito e saque,
 * além de consultar dados da conta.
 */
public class ContaBancaria {
    // Atributos privados, protegidos por encapsulamento
    private String titular;
    private int numeroConta;
    private double saldo;
    /*
        Realiza um depósito na conta.
        Só permite depósitos com valores positivos.
     */
    public void depositar(double valor) {
        if (valor <= 0){
            System.out.println("Valor inválido para depósito.");
        }else {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        }
    }
    /*
        Realiza um saque na conta.
        Só permite saques com saldo suficiente e valores positivos.
     */
    public void saque(double valor) {
        if (valor > saldo || valor <= 0) {
            System.out.println("Saldo insuficiente para saque.");
        }else {
            saldo -= valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
