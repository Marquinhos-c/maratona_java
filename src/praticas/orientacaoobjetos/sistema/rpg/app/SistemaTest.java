package praticas.orientacaoobjetos.sistema.rpg.app;

import praticas.orientacaoobjetos.sistema.rpg.dominio.Arma;
import praticas.orientacaoobjetos.sistema.rpg.dominio.Item;
import praticas.orientacaoobjetos.sistema.rpg.dominio.Porcao;
import praticas.orientacaoobjetos.sistema.rpg.service.Mochila;


public class SistemaTest {
    public static void main(String[] args) {

        Mochila<Item> items = new Mochila<>();

        items.adicionar(new Arma("Scar", 2000, 50, "Fogo"));
        items.adicionar(new Arma("MP 40", 1900, 19, "Forgo"));

        items.adicionar(new Porcao("Revive", 400, 15, "Cura"));
        items.adicionar(new Porcao("Enfraquecer", 300, 80, "Mana"));

        items.buscarPeloNome("Scar");

        items.imprimirItensQuebrados();

        items.somarValorDaCarga();

        items.itemMaisCaro();


    }
}
