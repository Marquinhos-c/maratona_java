package orientacaoobjetos.polimorfismo.test;

import orientacaoobjetos.polimorfismo.dominio.Computador;
import orientacaoobjetos.polimorfismo.dominio.Produto;
import orientacaoobjetos.polimorfismo.dominio.Tomate;

public class ProdutoTes02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 7", 3600);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());

        System.out.println("----------------");

        Produto produto2 = new Tomate("Tomate Verde", 8);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
