package orientacaoobjetos.optional.test;

import java.util.List;
import java.util.Optional;

// Classe introdutória sobre criação e uso básico de Optional
public class OptionalTest01 {
    public static void main(String[] args) {

        // --- PARTE 1: Criando Optionals ---

        // 1. Optional.of(valor):
        // Cria um Optional contendo um valor.
        // PERIGO: Se você passar 'null' aqui, ele lança um NullPointerException imediato.
        // Use apenas quando tiver certeza absoluta que o valor existe.
        Optional<String> optional1 = Optional.of("Marquinhos lindãao");

        // 2. Optional.ofNullable(valor):
        // O mais usado. Se o valor for 'null', ele cria um Optional vazio (Optional.empty).
        // Se o valor existir, ele cria um Optional com o valor. É seguro.
        Optional<String> optional2 = Optional.ofNullable(null);

        // 3. Optional.empty():
        // Cria explicitamente uma caixa vazia.
        Optional<String> optional3 = Optional.empty();

        // Imprimindo os objetos wrapper (as caixas), não os valores brutos.
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println("--------------------------");

        // --- PARTE 2: Recuperando valores ---

        // Buscando um nome usando o método utilitário abaixo
        Optional<String> nameOptional = findName("Marcos");

        // .orElse(valorPadrao):
        // Tenta pegar o valor de dentro da caixa. Se estiver vazio, retorna "EMPTY" (ou o que você definir).
        // Isso elimina a necessidade de fazer: if (variavel != null) ...
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);

        // .ifPresent(Consumer):
        // Só executa a expressão lambda SE houver um valor dentro do Optional.
        // Se estiver vazio, ele ignora silenciosamente (não dá erro).
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));

    }

    // Método simulando uma busca no banco de dados ou lista.
    // Retornar Optional<String> deixa claro para quem chama o método: "Talvez eu não encontre nada"
    private static Optional<String> findName(String name) {

        List<String> list = List.of("Marcos", "Evenlly");
        int i = list.indexOf(name);

        if (i != -1) {
            // Se achou, embrulha o valor em um Optional.of
            return Optional.of(list.get(i));
        }
        // Se não achou, retorna uma caixa vazia. NUNCA retorne 'null' num método que promete retornar Optional.
        return Optional.empty();
    }
}
