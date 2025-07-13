package estruturasCondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 5500;
        // (condição) ? ValorVerdadeiro : ValorFalso
        String resultado = salario > 5000 ? "Eu vou doar 500" : "Eu não vou doar";

        System.out.println(resultado);

        // EXEMPLO 2
        int idade = 17;
        String maiorIdade = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(maiorIdade);
    }
}
