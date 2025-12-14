package orientacaoobjetos.streams.test;

import orientacaoobjetos.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

// classe teste uso do reduce soma de todos os preços maior que 3
public class StreamTest08 {
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
        // --- Forma 1: Stream de Objetos (Wrapper) ---
        lightNovels.stream()
                // Aqui o retorno é Stream<Double>.
                // Cada preço é um OBJETO Double. Isso gasta mais memória (Boxing).
                .map(LightNovel::getPrice)
                .filter(price -> price >= 3)
                // O reduce retorna um Optional<Double>, pois a lista pode estar vazia.
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        // --- Forma 2: Stream Primitivo (Otimizado) ---
        double sum = lightNovels.stream()
                // NOVIDADE: mapToDouble
                // Converte o Stream de objetos para um DoubleStream (Específico para tipos primitivos double).
                // Evita o "Boxing/Unboxing" (desembrulhar objetos), sendo muito mais rápido.
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                // NOVIDADE: .sum()
                // Como agora estamos num DoubleStream, o Java sabe que são números.
                // Ele libera o método .sum() direto, sem precisar de reduce.
                // Retorna double (primitivo) direto. Se a lista for vazia, retorna 0.0.
                .sum();
        System.out.println(sum);
    }
}
