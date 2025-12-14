package orientacaoobjetos.streams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // --- Comparação: Jeito antigo (Imperativo) ---
        System.out.println("Usando for para somar");
        int soma = 0;
        for (Integer integer : integers) {
            soma += integer;
        }
        System.out.println(soma);

        System.out.println("--------------\n");

        // --- Jeito novo: REDUCE (SOMA) ---
        System.out.println("Usando stream reduce para somar");
        // Exemplo 1: Com valor inicial (Identidade).
        // O '0' é o valor inicial. Se a lista estiver vazia, ele retorna 0.
        // Integer::sum é a operação (x + y).
        // Retorno: Integer (valor direto, não Optional).
        System.out.println(integers.stream().reduce(0, Integer::sum));
        System.out.println(integers.stream().reduce(0, (x, y) -> x+y));
        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);

        System.out.println("----------------\n");

        //usando stream reduce para multiplicar
        System.out.println("Usando stream reduce para multiplicar");
        System.out.println(integers.stream().reduce(1, (x, y) -> x * y));
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);

        System.out.println("----------------\n");

        //usando stream reduce para achar o maior numero
        System.out.println("Usando stream reduce para achar maior da lista");
        // Exemplo 1: Usando Method Reference do Integer para achar o máximo.
        // Cuidado com identidade 0 aqui se tiver números negativos na lista!
        System.out.println(integers.stream().reduce(0, Integer::max));
        // Exemplo 2: Usando Operador Ternário.
        // "Se x for maior que y, retorna x, senão retorna y".
        // Como não passamos valor inicial, retorna Optional (mais seguro para listas vazias).
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
    }
}
