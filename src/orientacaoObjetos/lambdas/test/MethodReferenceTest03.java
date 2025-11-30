package orientacaoobjetos.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Classe de teste focado em "Referência a método de instância de um objeto arbitrário"
public class MethodReferenceTest03 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));

        // CASO 1: Reference to an instance method of an arbitrary object of a particular type
        // Sintaxe: Classe::metodoDeInstancia
        // O Comparator espera (s1, s2). O 'compareTo' é um método de String.
        // O Java entende: "Pegue o primeiro objeto (s1) e chame o método compareTo passando o segundo (s2)".
        // Lambda equivalente: (s1, s2) -> s1.compareTo(s2)
        list.sort(String::compareTo);
        System.out.println(list);

        // CASO 2: Reference to a static method (Revisão)
        // Function<Entrada, Saida>. Recebe String, retorna Integer.
        // O 'parseInt' é estático na classe Integer.
        // Lambda equivalente: s -> Integer.parseInt(s)
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("50");
        System.out.println(num);

        // A mágica: Como o método 'contains' não é estático, o Java infere que o PRIMEIRO argumento do BiPredicate
        // será o dono do método (o objeto invocador), e o SEGUNDO argumento será o parâmetro.
        // Lambda equivalente: (lista, nome) -> lista.contains(nome)
        BiPredicate<List<String>, String> checkName = List::contains;

        // Executando: list.contains("Rimuru")
        System.out.println(checkName.test(list, "Rimuru"));
    }
}
