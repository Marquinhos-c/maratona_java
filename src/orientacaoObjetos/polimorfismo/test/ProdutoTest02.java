package orientacaoobjetos.polimorfismo.test;

import orientacaoobjetos.polimorfismo.dominio.Computador;
import orientacaoobjetos.polimorfismo.dominio.Produto;
import orientacaoobjetos.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        // A variável de referência é do tipo genérico 'Produto'
        // O objeto em memória é do tipo específico 'Computador'
        Produto produto1 = new Computador("Ideapad 3", 3600);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        // Polimorfismo: Executa o @Override da classe Computador
        System.out.println(produto1.calcularImposto());

        System.out.println("----------------");

        Produto produto2 = new Tomate("Tomate Verde", 8, "25/11/2025");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
