package orientacaoobjetos.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Uso do flatMap
public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Micael", "João", "Vinicius");
        List<String> developers = List.of("Marcos", "Evenlly", "Messi");
        List<String> students = List.of("Alan", "Guilherme", "Pablo", "Gabriel");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        // forma utilizando for
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        System.out.println("\n------------------------\n");

        // O tipo do Stream aqui começa como Stream<List<String>> (Uma esteira de listas)
        devdojo.stream()
                // O flatMap faz duas coisas:
                // 1. MAP: Transforma cada item (que é uma Lista) em um Stream (Collection::stream).
                // 2. FLAT: "Achata" todos esses Streams internos em um único Stream contínuo.
                // Agora o tipo mudou para Stream<String> (Uma esteira de Nomes soltos)
                .flatMap(Collection::stream)// Ele serve para lidar com estruturas aninhadas (lista dentro de lista)
                .forEach(System.out::println);
    }
}
