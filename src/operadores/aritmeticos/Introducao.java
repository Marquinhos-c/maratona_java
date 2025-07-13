package operadores.aritmeticos;

public class Introducao {
    public static void main(String[] args) {
        // + , - , / , *
        int numero1 = 20;
        int numero2 = 5;

        int adicao = numero1 + numero2;
        int subtracao = numero1 - numero2;
        double divisao = numero1 / (double) numero2; // cast retirando erro
        int multipicacao = numero1 * numero2;
        // % resto da divisão
        int resto = 10 % 2;

        System.out.println(resto);
        System.out.println(adicao);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multipicacao);
    }
}
