package orientacaoobjetos.streams.test;

import orientacaoobjetos.streams.dominio.Category;
import orientacaoobjetos.streams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;


public class StreamTest14 {

    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 10.00, Category.ROMANCE)
    ));


    public static void main(String[] args) {
        // --- EXEMPLO 1: Contando por Categoria ---
        // Aqui usamos o groupingBy com DOIS argumentos.
        // 1º Arg (Chave): LightNovel::getCategory (Quem define o grupo?)
        // 2º Arg (Valor): Collectors.counting() (O que fazer com os itens do grupo?)
        // Resultado: Em vez de uma Lista de livros, teremos o NÚMERO de livros.
        // Tipo do Map: Map<Category, Long>
        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);


        // --- EXEMPLO 2: Maior Preço por Categoria (Com Optional) ---
        // 2º Arg: Collectors.maxBy(...) -> Acha o livro mais caro daquela categoria.
        // Problema: O maxBy retorna um Optional (porque a lista poderia estar vazia).
        // Tipo do Map: Map<Category, Optional<LightNovel>> (Meio feio de usar)
        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);


        // --- EXEMPLO 3: Maior Preço (Limpando o Optional) ---
        // A NOVIDADE: Collectors.collectingAndThen
        // Ele serve para fazer uma "finalização" no resultado.
        // Como funciona:
        // 1. Faz o maxBy (Acha o livro mais caro embrulhado no Optional).
        // 2. Executa o Optional::get (Tira o livro de dentro do Optional).
        // Resultado: Map<Category, LightNovel> (Muito mais limpo!)
        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                                Optional::get)));// 2ª Ação (And Then...)
        System.out.println(collect3);
    }
}
