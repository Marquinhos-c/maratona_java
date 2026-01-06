package orientacaoobjetos.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        // Exemplo manual do que acontece nos bastidores com o primeiro item
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String> letters2 = words.stream()
                // 1. TIPO ATUAL: Stream<String> ("Gomu", "No"...)

                // 2. O map executa o split.
                // O split retorna um Array de String (String[]).
                // TIPO AGORA: Stream<String[]> (Uma esteira carregando caixas de arrays: [G,o,m,u], [N,o]...)
                .map(w -> w.split(""))
                // 3. O flatMap entra em ação.
                // Ele pega cada Array (String[]) e usa o Arrays::stream para transformar em letras soltas.
                // Depois, ele "achata" tudo numa única sequência.
                // TIPO AGORA: Stream<String> ("G", "o", "m", "u", "N", "o"...)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letters2);
    }
}
