package estruturascondicionais;

import java.util.Scanner;
// Imprima o dia da semana, considerando 1 como domingo
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual dia da semana entre 1 e 7? ");
        byte diaDaSemana = input.nextByte();

        // VALORES QUE PODE USAR NO SWITCH: char, int, byte, short, enum, String
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Error, Digite a ordem dos dias da semana correto entre 1 e 7...");
                break;
        }
        input.close();
    }
}
