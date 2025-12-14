package orientacaoobjetos.streams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

// Stream infinito
public class StreamTest10 {
    public static void main(String[] args) {

        // --- 1. STREAM ITERATE (Sequencial) ---
        // O iterate precisa de uma "Semente" (Seed) inicial e uma função para calcular o próximo passo.
        // seed: 1 (começa no 1)
        // unuaryOperator: n -> n + 2 (pega o anterior e soma 2)
        // Resultado: 1, 3, 5, 7...
        Stream.iterate(1, n -> n + 2)
                .limit(10) // OBRIGATÓRIO em streams infinitos para parar o processo
                .forEach(System.out::println);

        System.out.println("---------");

        // --- 2. DESAFIO FIBONACCI (Iterate com Arrays) ---
        // A lógica de Fibonacci precisa de DOIS números anteriores para gerar o próximo.
        // Como o iterate só lembra do IMEDIATAMENTE anterior, usamos um array de 2 posições para "guardar o estado".
        // Array inicial: {0, 1}
        // Lógica: novoArray = { valorAntigo[1], valorAntigo[0] + valorAntigo[1] }
        Stream.iterate(new int[]{0, 1,}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.print(Arrays.toString(a)));
                // Imprime os pares: [0, 1][1, 1][1, 2][2, 3]...


        System.out.println("\n-----------");
        // --- 3. FIBONACCI LIMPO (Extraindo o valor) ---
        Stream.iterate(new int[]{0, 1,}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println("\n-----------");

        // --- 4. STREAM GENERATE (Aleatório / Constante) ---
        // Diferente do iterate, o GENERATE não se importa com o valor anterior.
        // Ele apenas "gera" algo novo toda vez que é chamado.
        // É ideal para números aleatórios, UUIDs, ou valores constantes.
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 10000))
                .limit(100)
                .forEach(System.out::println);
    }
}
