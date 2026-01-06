package praticas.orientacaoobjetos.generics.app;

import praticas.orientacaoobjetos.generics.dominio.Brinquedo;
import praticas.orientacaoobjetos.generics.dominio.Sapato;
import praticas.orientacaoobjetos.generics.servico.Caixa;

public class CaixaTest {
    public static void main(String[] args) {

        Brinquedo brinquedo = new Brinquedo("Carrinho");
        Sapato sapato = new Sapato("Preto");

        Caixa<Brinquedo> brinquedoCaixa = new Caixa<>();
        brinquedoCaixa.guardar(brinquedo);

        Caixa<Sapato> sapatoCaixa = new Caixa<>();
        sapatoCaixa.guardar(sapato);

        System.out.println(brinquedoCaixa.abrir().getNome());
        System.out.println(sapatoCaixa.abrir().getCor());
    }
}
