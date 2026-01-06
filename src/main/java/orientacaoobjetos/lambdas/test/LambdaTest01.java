package orientacaoobjetos.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {

        List<String> strings = List.of("Marquinhos", "Luffy", "Goku", "Tsubasa");
        List<Integer> integers = List.of(1,2,3,4,5);

        imprimeLista(strings,s -> System.out.println(s));
        imprimeLista(integers,i -> System.out.println(i));
    }

    private static <T> void imprimeLista(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
