package orientacaoobjetos.streams.test;

import orientacaoobjetos.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 10.00)
    ));

    public static void main(String[] args) {
        // --- CONTAGEM ---
        // Forma direta (Mais simples)
        System.out.println(lightNovels.stream().count());
        // Forma via Collectors (Útil para agrupamentos futuros)
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        // --- MÁXIMO ---
        // Forma direta
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        // Forma via Collectors (Collectors.maxBy)
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        // --- SOMA ---
        // Forma direta (usando mapToDouble para otimizar)
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        // Forma via Collectors (Collectors.summingDouble)
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        // --- ESTATÍSTICAS GERAIS (NOVIDADE IMPORTANTE) ---
        // O summarizingDouble é fantástico. Em vez de percorrer a lista 5 vezes para achar
        // soma, média, max, min e total, ele faz tudo isso em UMA ÚNICA PASSADA.
        // Ele retorna um objeto do tipo DoubleSummaryStatistics.
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        // Saída: DoubleSummaryStatistics{count=8, sum=45.930000, min=1.990000, average=5.741250, max=10.000000}


        // --- FORMATAÇÃO DE TEXTO (NOVIDADE: JOINING) ---
        // O Collectors.joining serve para juntar Strings com um delimitador.
        // É perfeito para criar listas legíveis separadas por vírgula.
        String titles = lightNovels.stream()
                .map(LightNovel::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(titles);
    }
}

