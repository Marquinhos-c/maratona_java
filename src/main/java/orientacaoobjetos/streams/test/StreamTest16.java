package orientacaoobjetos.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

//-----CUIDADOS ANTES DE USAR DE FORMA PARALELA----
// - Benchmark
// - Unboxing | boxing
// - (limit, findFirst) ruim (findAny) bom
// - Custo total da computação N, P
// - Quantidade de Dados
// - Tipos de Coleções
// - Tamanho do Stream (Tamanho definido)
// - Processamento merge


public class StreamTest16 {

    public static void main(String[] args) {
        // Mostra quantos núcleos (cores) sua CPU tem. O Java usará esse número de Threads.
        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;

        sumFor(num); // Referência (Mais rápido)
        sumStreamInterate(num); // O mais lento (Cuidado!)
        sumLongStreamInterate(num); // Rápido (Primitivos)
        sumParallelStreamInterate(num); // Paralelo (Pode ter overhead)
    }

    private static void sumFor(long num) {
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();

        for (int i = 1; i <= num; i++) {
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }

    private static void sumStreamInterate(long num) {
        System.out.println("Sum StreamInterate");
        long init = System.currentTimeMillis();

        // PROBLEMA: O iterate gera objetos Long (Boxing).
        // Além disso, o Java não consegue dividir facilmente esse stream para paralelo futuramente.
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }

    private static void sumLongStreamInterate(long num) {
        System.out.println("Sum LongStreamInterate");
        long init = System.currentTimeMillis();

        // MELHORIA: LongStream trabalha com 'long' primitivo (sem Boxing).
        // O rangeClosed já sabe o tamanho definido do array, otimizando a memória.
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }


    private static void sumParallelStreamInterate(long num) {
        System.out.println("Sum ParallelStreamInterate");
        long init = System.currentTimeMillis();

        // PARALELO: O .parallel() ativa o ForkJoinPool.
        // Se a tarefa for muito simples (como somar), o tempo de gerenciar as threads
        // pode ser maior que o tempo de execução, tornando-o mais lento que o For simples.
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }
}


