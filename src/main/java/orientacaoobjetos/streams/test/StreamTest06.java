package orientacaoobjetos.streams.test;

import orientacaoobjetos.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        // --- GRUPO 1: MATCHERS (Retornam boolean: true ou false) ---

        // anyMatch (Algum combina?): Retorna true se houver PELO MENOS UM elemento com preço > 9.
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));
        // allMatch (Todos combinam?): Retorna true apenas se TODOS os elementos da lista tiverem preço > 0.
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        // noneMatch (Nenhum combina?): Retorna true se NENHUM elemento tiver preço < 0.
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));

        // --- GRUPO 2: FINDERS (Retornam Optional, pois podem não achar nada) ---
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                // findAny: Retorna "qualquer um" que passar no filtro.
                // Em streams sequenciais (como esse), geralmente retorna o primeiro, mas em paralelos pode ser aleatório.
                // É otimizado para performance pois não se importa com a ordem.
                .findAny()
                .ifPresent(System.out::println);


        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                // findFirst: Retorna OBRIGATORIAMENTE o primeiro elemento da fila.
                // É mais rígido que o findAny.
                .findFirst()
                .ifPresent(System.out::println);


        // --- GRUPO 3: MIN / MAX (Retornam Optional baseados numa comparação) ---
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                // min: Procura o MENOR elemento baseado no comparador de preço.
                .min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                // max: Procura o MAIOR elemento baseado no comparador de preço.
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
