package tiposPrimitivos;

public class Introducao {
    public static void main(String[] args) {
        // int, byte, short, char, long, float, double, boolean

        // fazendo um CASTING, forçando um valor long caber no int
        int idade = (int) 18000000000L;
        long numeroGrande = 1000000000;
        float salarioFloat = 2000.5F; // aqui precisa informar que float "F ou f"
        double salarioDouble = 2500.8; // por padrão ja vem o valor double
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean falso = false;
        boolean verdadeiro = true;
        char caractere = 'm';

        // String
        String nome = "Marcos Vinicius Costa da Silva";

        System.out.println("A idade é " + idade);
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println("Meu nome é " + nome);


    }
}
