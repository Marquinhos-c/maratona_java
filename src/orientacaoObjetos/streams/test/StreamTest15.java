package orientacaoobjetos.streams.test;

import orientacaoobjetos.streams.dominio.Category;
import orientacaoobjetos.streams.dominio.LightNovel;
import orientacaoobjetos.streams.dominio.Promotion;

import java.util.*;

// Import estático: Deixa o código mais limpo (não precisa ficar escrevendo Collectors.groupingBy...)
import static java.util.stream.Collectors.*;


public class StreamTest15 {

    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 10.00, Category.ROMANCE)
    ));


    public static void main(String[] args) {
        // --- EXEMPLO 1: Estatísticas por Grupo ---
        // Aqui geramos um relatório completo (soma, média, max, min) para CADA categoria.
        // Retorno: Map<Category, DoubleSummaryStatistics>
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        // --- EXEMPLO 2: Convertendo Dados dentro do Grupo (Mapping) ---
        // Objetivo: Quero saber quais TIPO DE PROMOÇÃO existem em cada categoria.
        // O `mapping` funciona assim:
        // 1. Pega o LightNovel.
        // 2. Aplica a função getPromotion (converte LightNovel -> Enum Promotion).
        // 3. Guarda o resultado num Set (toSet()), que elimina duplicatas automaticamente.
        // Retorno: Map<Category, Set<Promotion>>
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        // --- EXEMPLO 3: Controlando a Coleção Específica (toCollection) ---
        // O toSet() padrão geralmente cria um HashSet (que não garante ordem).
        // Se você precisar manter a ORDEM de inserção ou usar uma implementação específica, use toCollection.
        // Aqui forçamos o uso de LinkedHashSet.
        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    // Método auxiliar que define a lógica da promoção
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
