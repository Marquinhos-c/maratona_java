package orientacaoobjetos.streams.test;

import orientacaoobjetos.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    // Faz a mesma coisa que o exercico 1 utilizando Stream
    public static void main(String[] args) {
        List<String> titles = lightNovels.stream() // 1. Abre o fluxo de dados (Pipeline)
                // 2. Operação Intermediária: Ordena os objetos LightNovel pelo título
                .sorted(Comparator.comparing(LightNovel::getTitle))
                // 3. Operação Intermediária: Ignora qualquer elemento que não satisfaça a condição (Preço <= 4)
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                // 4. Operação Intermediária (Short-Circuit): Assim que pegar 3 elementos, para o processamento.
                .limit(3)
                // 5. Operação Intermediária (Transformação):
                // AQUI MUDA O TIPO: Deixa de ser Stream<LightNovel> e vira Stream<String>.
                // Extraímos apenas o título, descartando o resto do objeto.
                .map(LightNovel::getTitle)
                // 6. Operação Terminal:
                // "Materializa" o resultado. Pega os itens que sobreviveram ao fluxo
                // e os coloca dentro de uma nova Lista Java padrão.
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
