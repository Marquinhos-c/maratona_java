package orientacaoobjetos.lambdas.test;

import orientacaoobjetos.lambdas.dominio.Anime;
import orientacaoobjetos.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {

        // 1. Instanciando o objeto Comparador:
        // Como o método 'compareByEpisodesNonStatic' NÃO é estático na classe AnimeComparators,
        // precisamos criar um objeto (instância) dessa classe primeiro para poder acessá-lo.
        AnimeComparators animeComparators = new AnimeComparators();

        // 2. Criação da Lista (Mutável):
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 43),
                new Anime("One piece", 900),
                new Anime("Naruto", 500))
        );

        // 3. Method Reference para um Objeto Específico:
        // Sintaxe: objeto::metodoDeInstancia
        // Diferença chave: No teste anterior usávamos 'NomeDaClasse::metodo'.
        // Aqui usamos 'variavelDoObjeto::metodo'.
        // O Java entende: "Use o método 'compareByEpisodesNonStatic' que pertence ao objeto 'animeComparators' que criamos na linha 16".

        // Equivalente em Lambda: (a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1, a2)
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
