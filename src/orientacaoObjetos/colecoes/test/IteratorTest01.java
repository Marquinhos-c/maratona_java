package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(3L, "Attack on titan", 18.90, 0));
        mangas.add(new Manga(10L, "Berserker", 20.90, 5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 21.90, 0));
        mangas.add(new Manga(9L, "Pokemon", 25.90, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 50.99, 0));

        //Iterator: Um objeto "cursor" para andar sobre uma coleção.
        //hasNext(): O "sensor" do cursor, que verifica se há um próximo item (retorna true ou false).
        //next(): O "movimento" do cursor, que avança para o próximo item e o retorna.
        //remove(): A "ferramenta" do cursor, que remove com segurança o último item retornado pelo next().
        /*
        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
         */
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
