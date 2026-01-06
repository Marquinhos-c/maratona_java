package orientacaoobjetos.lambdas.test;

import orientacaoobjetos.lambdas.dominio.Anime;
import orientacaoobjetos.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Classe de teste para Method Reference com Métodos Estáticos
public class MethodReferenceTest01 {

    // 1. Criação da Lista:
    // Usamos 'new ArrayList<>(List.of(...))' porque 'List.of' cria uma lista imutável.
    // Para usar o método .sort(), precisamos de uma lista que possa ser modificada (mutável),
    // por isso embrulhamos tudo em um ArrayList.
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500))
        );

        // --- Evolução da Sintaxe ---

        // Forma 1 (Lambda Padrão):
        // Define a lógica de comparação manualmente com (a1, a2). É funcional, mas verboso.
        //Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        // Forma 2 (Method Reference com Collections):
        // Usa a classe utilitária Collections.
        // 'AnimeComparators::compareByTitle' é uma referência a um método estático.
        // O Java entende que deve passar os dois animes da lista para esse método comparar.
        //Collections.sort(animeList, AnimeComparators::compareByTitle);

        // Forma 3 (Moderno - Java 8+):
        // A própria interface List agora possui o método sort().
        // Sintaxe: Classe::metodoEstatico
        // Aqui estamos dizendo: "Ordene esta lista usando a lógica definida no método estático 'compareByEpisodes' da classe AnimeComparators".
        animeList.sort(AnimeComparators::compareByEpisodes);
        animeList.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animeList);

    }
}
