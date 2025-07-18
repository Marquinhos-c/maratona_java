package praticas.orientacaoObjetos.metodos.parametros.test;

import praticas.orientacaoObjetos.metodos.parametros.dominio.CalculoImc;

import java.util.Locale;
import java.util.Scanner;
/*
- Um segundo método que receba o valor do IMC e retorne uma string com a classificação correspondente:
- Abaixo de 18.5 → "Abaixo do peso"
- Entre 18.5 e 24.9 → "Peso normal"
- Entre 25.0 e 29.9 → "Sobrepeso"
- 30.0 ou mais → "Obesidade"
 */

public class CalculoImcTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US); // aqui para aceitar números com ponto flutuante
        CalculoImc calculador = new CalculoImc();

        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        double imc = calculador.calculoImc(peso, altura);
        String classificacao = calculador.classificadorImc(imc);

        System.out.printf("IMC: %.2f - Classificação: %s%n", imc, classificacao); // printf - substitui os marcadores %.2f e %s pelo imc e classificação
    }
}
