package orientacaoobjetos.exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        // A chamada lança IllegalArgumentException.
        // Como não há 'try-catch' aqui, o programa encerra.
        divisao(1, 0);

        // Esta linha NUNCA será executada devido à exceção não tratada.
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            // Lança a exceção de Runtime. O compilador não exige o tratamento.
            throw new IllegalArgumentException("Não existe divisão por zero");
        }
        return a / b;
    }
}
