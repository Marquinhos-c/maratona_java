package orientacaoobjetos.exception.runtime.test;

/*
    Classe de teste para demonstrar a ocorrência e a natureza
    de uma RuntimeException, especificamente a ArrayIndexOutOfBoundsException.
    RuntimeExceptions (Unchecked Exceptions) indicam erros que geralmente
    podem ser evitados através de checagens de lógica no código.
 */
public class RuntimeExceptionTest01 {
    public static void main(String[] args) {

        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
