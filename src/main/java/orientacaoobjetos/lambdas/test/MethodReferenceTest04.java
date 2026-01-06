package orientacaoobjetos.lambdas.test;

import orientacaoobjetos.lambdas.dominio.Anime;
import orientacaoobjetos.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Classe de teste para Method Reference com Construtores (Constructor Reference)
public class MethodReferenceTest04 {
    public static void main(String[] args) {

        // --- PARTE 1: Construtor sem argumentos (Supplier) ---

        // Supplier<T>: Fornecedor. Não recebe argumentos e retorna um objeto do tipo T.
        // AnimeComparators::new -> Referência ao construtor padrão 'new AnimeComparators()'.
        // Nota: Aqui o objeto AINDA NÃO foi criado. Criamos apenas a "receita" de como criar.
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;

        // .get() -> É aqui que o método do Supplier é executado e o objeto nasce na memória.
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500))
        );
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        System.out.println("---------------------------------------------------------------------------");

        // --- PARTE 2: Construtor com argumentos (BiFunction) ---

        // BiFunction<T, U, R>: Recebe T e U, retorna R.
        // T = String (Título), U = Integer (Episódios), R = Anime (Objeto criado).

        // Forma 1 (Lambda Padrão):
        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);

        // Forma 2 (Constructor Reference):
        // Sintaxe: Classe::new
        // O Java olha para a assinatura do BiFunction (String, Integer) e procura um construtor na classe Anime
        // que receba exatamente (String, Integer).
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        // Criando os objetos efetivamente chamando .apply()
        System.out.println(animeBiFunction.apply("Naruto", 800));
        System.out.println(animeBiFunction2.apply("One piece", 1000));
    }
}
