package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Consumidor;
import orientacaoobjetos.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe de teste para demonstrar o uso de Map (com HashMap)
 * utilizando objetos customizados (Consumidor, Manga) como Chave e Valor.
 */
public class MapTes02 {
    public static void main(String[] args) {
        // Cria dois consumidores
        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("Marcos Costa");

        // Cria vários objetos Manga
        Manga manga1 = new Manga(10L, "Berserker", 20.90, 5);
        Manga manga2 = new Manga(5L, "Hellsing Ultimate", 21.90, 0);
        Manga manga3 = new Manga(9L, "Pokemon", 25.90, 2);
        Manga manga4 = new Manga(2L, "Dragon ball Z", 50.99, 0);
        Manga manga5 = new Manga(4L, "One pice", 49.99, 0);

        // --- 2. Criação e Preenchimento do Map ---

        // Cria um Mapa onde a CHAVE é um Consumidor e o VALOR é um Manga.
        // Isso nos permite associar um consumidor a um mangá específico.
        //
        // IMPORTANTE: Para que a classe 'Consumidor' funcione corretamente como CHAVE
        // em um HashMap, ela DEVE implementar os métodos equals() e hashCode()!
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga5);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
