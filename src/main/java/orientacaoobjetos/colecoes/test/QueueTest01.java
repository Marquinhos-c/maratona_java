package orientacaoobjetos.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    /**
     * Classe de teste para demonstrar o uso da Queue (Fila),
     * especificamente com a implementação PriorityQueue.
     *
     * Ao contrário de filas comuns (FIFO), a PriorityQueue
     * ordena os elementos com base em sua prioridade
     * (ordem natural ou um Comparator).
     */
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        // Loop padrão para consumir (esvaziar) uma fila.
        // Continua rodando enquanto a fila NÃO (!) estiver vazia (isEmpty).
        while (!fila.isEmpty()) {
            // O método poll() faz duas coisas:
            // 1. REMOVE o elemento da cabeça (head) da fila.
            // 2. RETORNA o elemento que foi removido.
            System.out.println(fila.poll());
        }
    }
}
