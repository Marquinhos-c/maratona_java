package orientacaoobjetos.generics.test;

import orientacaoobjetos.colecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        // Listas sem uso de Generics
        /*
        O Problema: Quando você não usa o <>, o Java assume que essa lista é de Object. Como tudo em Java herda de Object,
         você pode misturar qualquer coisa lá dentro: uma String ("Goku"), um número Long (5L) e um objeto personalizado (Consumidor).
        A Consequência: Para ler os dados, você é obrigado a verificar o tipo (instanceof) e fazer o Cast manual (conversão explicita),
         como em (Consumidor) o.
        O Risco: Se você esquecer de verificar o tipo e tentar fazer um cast errado, o programa quebrará durante a execução com uma
         exceção chamada ClassCastException.
         */
        List lista = new ArrayList();
        lista.add("Goku");
        lista.add(5L);
        lista.add(new Consumidor("Marcos"));

        for (Object o : lista) {
            if (o instanceof String) {
                System.out.println(o);
            }
            if (o instanceof Consumidor) {
                Consumidor c = (Consumidor) o;
                System.out.println(c);
            }
            if (o instanceof Long) {
                System.out.println(o);
            }
        }
        System.out.println("--------------------");

        // Listas com uso de Generics
        /*
        A Solução: O <String> avisa ao compilador: "Esta lista aceita APENAS Strings".
        Segurança em Tempo de Compilação: Se você tentar fazer anime.add(new Consumidor("Naruto"));,
        o código nem sequer compila. O Java te avisa do erro antes mesmo de você rodar o programa.
        Código Mais Limpo: Note que no for, você não precisa usar Object nem fazer cast. O Java já sabe que s é uma String.
         */
        List<String> anime = new ArrayList<>();
        anime.add("Goku");
        anime.add("Lufy");

        for (String s : anime) {
            System.out.println(s);
        }
    }
}
