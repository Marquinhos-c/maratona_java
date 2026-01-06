package orientacaoobjetos.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// gerando stream
public class StreamTest09 {
    public static void main(String[] args) {
        // --- 1. GERANDO NÚMEROS (IntStream) ---

        // rangeClosed (Intervalo Fechado): Vai de 1 até 50 (INCLUI o 50).
        // Útil quando você precisa exatamente do número final.
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // range (Intervalo Aberto): Vai de 1 até 49 (EXCLUI o 50).
        // Útil para trabalhar com index de Arrays (que começam em 0 e vão até tamanho-1).
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // --- 2. STREAM DE VALORES SOLTOS (Stream.of) ---

        // Você não precisa criar uma List<> só para passar no Stream.
        // O Stream.of cria a esteira direto com os valores que você passar nos parênteses.
        // O tipo aqui será Stream<String>.
        Stream.of("Eleve", "O ", "Cosmo", "no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println("\n");

        // --- 3. STREAM DE ARRAYS (Arrays.stream) ---
        int[] num = {1,2,3,4,5};

        // O Java é inteligente: ele vê que é um array de int (primitivo)
        // e já devolve um IntStream (com funções matemáticas), e não um Stream<Integer>.
        Arrays.stream(num) // retorna um intStream
                .average() // calcula média
                .ifPresent(System.out::println);
        System.out.println("\n");


        // --- 4. STREAM DE ARQUIVOS (Files.lines) ---

        // Isso aqui é MUITO poderoso.
        // O Files.lines cria um Stream onde CADA LINHA do arquivo é um elemento (String).
        // Vantagem: Ele lê "sob demanda" (Lazy). Você pode ler um arquivo de 10GB sem estourar a memória RAM,
        // pois ele só carrega a linha na memória quando ela passa na esteira.
        // O try-with-resources (dentro do parênteses do try) garante que o arquivo será fechado ao final.
        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {

            lines.filter(l -> l.contains("Java")).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
