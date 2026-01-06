package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Consumidor;
import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe de teste para demonstrar um relacionamento "Um-para-Muitos" usando Map.
 *
 * O padrão é usar um Map onde a Chave (Key) é o objeto "Um" (Consumidor)
 * e o Valor (Value) é uma Coleção (List) dos objetos "Muitos" (Manga).
 *
 * Ex: 1 Consumidor -> Múltiplos Mangás (histórico de compras)
 */

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("Marcos Costa");

        Manga manga1 = new Manga(10L, "Berserker", 20.90, 5);
        Manga manga2 = new Manga(5L, "Hellsing Ultimate", 21.90, 0);
        Manga manga3 = new Manga(9L, "Pokemon", 25.90, 2);
        Manga manga4 = new Manga(2L, "Dragon ball Z", 50.99, 0);
        Manga manga5 = new Manga(4L, "One pice", 49.99, 0);

        // --- 2. Criação das Listas (os "Muitos") ---

        // Cria uma lista de mangás para o primeiro consumidor.
        // List.of() cria uma lista imutável (não pode ser alterada após a criação).
        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga5, manga1);

        // --- 3. Criação do Map (a relação "Um-para-Muitos") ---

        // O Mapa associará um Consumidor (Chave) a uma Lista de Mangás (Valor).
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        // --- 4. Iteração com Loop Aninhado ---

        // Loop Externo: Itera sobre as entradas do Map (Consumidor -> Lista)
        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            // Imprime o nome do Consumidor (a Chave)
            System.out.println("=== " + entry.getKey().getNome()+ " ===");
            // Loop Interno: Itera sobre a Lista de Mangás obtida acima
            for (Manga manga : entry.getValue()) {
                //imprime o nome de cada mangá individual da lista
                System.out.println("- " + manga.getNome());
            }
        }
    }
}
