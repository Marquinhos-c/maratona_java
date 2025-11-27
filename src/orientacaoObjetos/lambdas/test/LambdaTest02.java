package orientacaoobjetos.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
/*
Interface,    O que ela faz?,           Entrada,  Retorno,     Palavra-chave,  Método Abstrato
Predicate,    Faz um teste (Sim/Não).,  T,        boolean,     Filtrar,        test()
Function,     Faz uma transformação.,   T,        R,           Mapear,         apply()
Consumer,     Executa uma ação final.,  T,        void (nada), Executar,       accept()
 */
public class LambdaTest02 {
    public static void main(String[] args) {

        List<String> strings = List.of("Natsu", "Allucard");

        List<Integer> integers = map(strings, (String s) -> s.length());
        List<String> map = map(strings, s -> s.toUpperCase());

        System.out.println(integers);
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
