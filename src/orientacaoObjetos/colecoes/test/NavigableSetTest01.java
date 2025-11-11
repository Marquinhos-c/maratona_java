package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Manga;
import orientacaoobjetos.colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        set.add(new Smartphone("122", "Nokia"));
        set.add(new Smartphone("145", "Samsung"));
        set.add(new Smartphone("123", "Apple"));
        set.add(new Smartphone("121", "Apple"));

        for (Smartphone s : set) {
            System.out.println(s);
        }

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(3L, "Attack on titan", 2.99, 0));
        mangas.add(new Manga(10L, "Berserker", 20.90, 5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 21.90, 0));
        mangas.add(new Manga(9L, "Pokemon", 25.90, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 50.99, 0));
        mangas.add(new Manga(4L, "One pice", 49.99, 0));

        System.out.println("------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 50, 6);

        // lower <
        // floor <=
        // higher >
        // ceiling =>
        System.out.println("-------------------------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("--------------------------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // busca o menor e remove
        System.out.println(mangas.pollLast()); // busca o maior e remove
        System.out.println(mangas.size());
    }
}
