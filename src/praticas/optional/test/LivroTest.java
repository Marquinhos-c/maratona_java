package praticas.optional.test;

import praticas.optional.dominio.Livro;
import praticas.optional.service.LivroService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LivroTest {
    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>(List.of(
                new Livro(1, "Segredo da mente milionaria"),
                new Livro(2, "Codigo ona"),
                new Livro(3, "Algoritmo")
        ));

        Optional<Livro> livroEncontrado = LivroService.buscarPorId(livros, 1);
        livroEncontrado.ifPresent(livro ->
                System.out.println("Livro encotrado: " + livro.getTitulo())
        );

        Optional<Livro> livroNaoEncontrado = LivroService.buscarPorId(livros, 99);
        String resultado = livroNaoEncontrado
                .map(Livro::getTitulo)
                .orElse("Livro não encontrado");
        System.out.println(resultado);

    }
}
