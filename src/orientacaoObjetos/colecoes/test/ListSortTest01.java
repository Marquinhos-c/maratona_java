package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List <String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Berserker");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");

        Collections.sort(mangas); // Ordena a lista

        List <Double> valores = new ArrayList<>();
        valores.add(5.50);
        valores.add(10.41);
        valores.add(8.90);
        valores.add(6.99);
        valores.add(2.80);

        Collections.sort(valores);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("--------------");

        for (Double valor : valores) {
            System.out.println(valor);
        }

        new Manga(null, null, 0);
    }
}
