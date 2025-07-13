package estruturasCondicionais;

import java.util.Scanner;

/*
se salario for entre 0 e 34.712 imposto 9.70%
se salario for entre 34.713 e 68.507 imposto 37.35%
a partir de 68.508 imposto 49.50%
 */
public class ImpostoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = input.nextDouble();
        double descontoImposto;
        double salarioFinal;

        if (salario >= 0 && salario <= 34712){
            descontoImposto = salario * (9.70 / 100);
            salarioFinal = salario - descontoImposto;
            System.out.println("Valor do Imposto Descontado: "+descontoImposto);
            System.out.println("Valor final do seu salário é "+salarioFinal);
        } else if (salario >= 34713 && salario <= 68507) {
            descontoImposto = salario * (37.35 / 100);
            salarioFinal = salario - descontoImposto;
            System.out.println("Valor do Imposto Descontado: "+descontoImposto);
            System.out.println("Valor final do seu salário é "+salarioFinal);
        }else {
            descontoImposto = salario * (49.50 / 100);
            salarioFinal = salario - descontoImposto;
            System.out.println("Valor do Imposto Descontado: "+descontoImposto);
            System.out.println("Valor final do seu salário é "+salarioFinal);
        }
        input.close();
    }
}
