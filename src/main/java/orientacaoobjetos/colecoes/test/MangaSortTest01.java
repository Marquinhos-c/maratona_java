package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
        * Classe 'juiz' que implementa a interface Comparator.
        * Seu objetivo é definir uma lógica de comparação customizada para objetos Manga.
        * Neste caso, a lógica é comparar dois Mangas pelo seu ID.
        */
class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

/**
 * Classe de teste para demonstrar a ordenação de Listas de objetos customizados (Manga).
 * Aborda os dois principais conceitos de ordenação:
 * 1. Ordenação Natural (usando Comparable), implementada na própria classe Manga.
 * 2. Ordenação Customizada (usando Comparator), implementada em uma classe separada.
 */
public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(3L, "Attack on titan", 18.90));
        mangas.add(new Manga(10L, "Berserker", 20.90));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 21.90));
        mangas.add(new Manga(9L, "Pokemon", 25.90));
        mangas.add(new Manga(2L, "Dragon ball Z", 50.99));

        // Loop 1: Imprime os mangas na ordem em que foram adicionados (inserção)
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // --- ORDENAÇÃO NATURAL (Comparable) ---
        // Este método utiliza a "ordem natural" do objeto Manga.
        // IMPORTANTE: Isso só funciona se a classe 'Manga' implementar 'Comparable<Manga>'
        // e definir um método 'compareTo()'. (Ex: ordenando por nome/título).
        Collections.sort(mangas);
        System.out.println("-------------------------------------------------");

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        // --- ORDENAÇÃO CUSTOMIZADA (Comparator) ---
        // Aqui, forçamos uma regra de ordenação diferente usando nosso 'MangaByIdComparator'.

        // Opção 1 (Legado): Collections.sort(mangas, new MangaByIdComparator());
        // Opção 2 (Moderna, Java 8+): método .sort() da própria lista. (Preferido)
        mangas.sort(new MangaByIdComparator());
        System.out.println("-------------------------------------------------");

        // Loop 3: Imprime os mangas ordenados pelo ID (definido no Comparator)
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
