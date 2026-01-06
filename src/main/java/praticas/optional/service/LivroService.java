package praticas.optional.service;

import praticas.optional.dominio.Livro;

import java.util.List;
import java.util.Optional;

public class LivroService {

    public static Optional<Livro> buscarPorId(List<Livro> livros, Integer idBusca) {
        for (Livro livro : livros) {
            if (livro.getId() == idBusca) {
                return Optional.of(livro);
            }
        }
        return Optional.empty();
    }
}
