package orientacaoObjetos.polimorfismo.test;

import orientacaoObjetos.polimorfismo.dominio.Computador;
import orientacaoObjetos.polimorfismo.dominio.Tomate;
import orientacaoObjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Aspire5", 4400);
        Tomate tomate = new Tomate("Tomate Cereja", 10);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
