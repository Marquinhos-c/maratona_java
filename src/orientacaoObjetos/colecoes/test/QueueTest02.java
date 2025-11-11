package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed()); // orden definada por preço reverso
        mangas.add(new Manga(3L, "Attack on titan", 2.99, 0));
        mangas.add(new Manga(10L, "Berserker", 20.90, 5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 21.90, 0));
        mangas.add(new Manga(9L, "Pokemon", 25.90, 2));
        mangas.add(new Manga(2L, "Dragon ball Z", 50.99, 0));
        mangas.add(new Manga(4L, "One pice", 49.99, 0));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }


    }
}
