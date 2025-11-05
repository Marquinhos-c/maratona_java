package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(3L, "Attack on titan", 18.90));
        mangas.add(new Manga(10L, "Berserker", 20.90));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 21.90));
        mangas.add(new Manga(9L, "Pokemon", 25.90));
        mangas.add(new Manga(2L, "Dragon ball Z", 50.99));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Dragon ball Z", 50.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));

    }
}
