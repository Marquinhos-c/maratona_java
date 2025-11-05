package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}


public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(3L, "Attack on titan", 18.90));
        mangas.add(new Manga(10L, "Berserker", 20.90));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 21.90));
        mangas.add(new Manga(9L, "Pokemon", 25.90));
        mangas.add(new Manga(2L, "Dragon ball Z", 50.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-------------------------------------------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("-------------------------------------------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
