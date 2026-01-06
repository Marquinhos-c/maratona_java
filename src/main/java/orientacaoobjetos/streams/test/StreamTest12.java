package orientacaoobjetos.streams.test;

import orientacaoobjetos.streams.dominio.Category;
import orientacaoobjetos.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Agrupamento por categoria
public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
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

        // Forma manual
        Map<Category, List<LightNovel>> categoryLightNovelsMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA:
                    drama.add(lightNovel);
                    break;
                case FANTASY:
                    fantasy.add(lightNovel);
                    break;
                case ROMANCE:
                    romance.add(lightNovel);
                    break;
            }
        }
        categoryLightNovelsMap.put(Category.DRAMA, drama);
        categoryLightNovelsMap.put(Category.FANTASY, fantasy);
        categoryLightNovelsMap.put(Category.ROMANCE, romance);
        System.out.println(categoryLightNovelsMap);


        System.out.println("--------- AGRUPAMENTO COM STREAMS ---------");

        // NOVIDADE: groupingBy
        // 1. O Stream passa item por item.
        // 2. O groupingBy usa o "LightNovel::getCategory" como CLASSIFICADOR.
        // 3. Se a categoria não existe no Map, ele cria.
        // 4. Se já existe, ele adiciona o LightNovel na lista daquela categoria.

        // Retorno: Map<Category, List<LightNovel>>
        Map<Category, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
