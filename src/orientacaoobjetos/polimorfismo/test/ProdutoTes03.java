package orientacaoobjetos.polimorfismo.test;

import orientacaoobjetos.polimorfismo.dominio.Computador;
import orientacaoobjetos.polimorfismo.dominio.Produto;
import orientacaoobjetos.polimorfismo.dominio.Tomate;
import orientacaoobjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTes03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 7", 3600);

        Tomate tomate = new Tomate("Tomate Americano", 10);
        tomate.setDataValidade("24/10/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(produto1);
    }
}
