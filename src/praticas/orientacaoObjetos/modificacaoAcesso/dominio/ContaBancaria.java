package praticas.orientacaoObjetos.modificacaoAcesso.dominio;

public class ContaBancaria {
    private String titular;
    private long numeroConta;
    private double saldo;

    public void depositar(double valor) {
        if (valor <= 0){
            System.out.println("Valor inválido para depósito.");
        }else {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        }
    }
    public void saque(double valor) {
        if (valor > saldo) {
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

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
