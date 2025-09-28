package orientacaoobjetos.polimorfismo.test;

import orientacaoobjetos.polimorfismo.dominio.Computador;
import orientacaoobjetos.polimorfismo.dominio.Televisao;
import orientacaoobjetos.polimorfismo.dominio.Tomate;
import orientacaoobjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Aspire5", 4400);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao televisao = new Televisao("LG 50\"", 3500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
