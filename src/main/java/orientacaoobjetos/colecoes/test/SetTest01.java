package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        // Set -> não aceita valores duplicado
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(3L, "Attack on titan", 18.90, 0));
        mangas.add(new Manga(10L, "Berserker", 20.90, 5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 21.90, 0));
        mangas.add(new Manga(9L, "Pokemon", 25.90, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 50.99, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 50.99, 0)); // Classe Manga esta comparando Id e Nome

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
