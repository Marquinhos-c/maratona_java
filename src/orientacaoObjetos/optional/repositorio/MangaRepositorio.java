package orientacaoobjetos.optional.repositorio;

import orientacaoobjetos.optional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {

    // Lista fixa contendo dois mangás (simula um pequeno "banco de dados")
    private static List<Manga> mangas = List.of(
            new Manga(1,"Boku no hero", 50),
            new Manga(2,"Overlord", 25));


    // Método público para buscar um Manga pelo ID
    // Retorna um Optional<Manga>, pois pode ou não encontrar o mangá
    public static Optional<Manga> findById(Integer id) {
        // Chama o método findBy passando uma condição (lambda)
        // A condição verifica se o id do manga é igual ao id recebido
        return findBy(manga -> manga.getId().equals(id));
    }

    // Método público para buscar um Manga pelo título
    // Retorna um Optional<Manga>
    public static Optional<Manga> findByTitle(String title) {
        // Condição verifica se o título do manga é igual ao título recebido
        return findBy(manga -> manga.getTitle().equals(title));
    }

    // Método genérico de busca
    // Recebe uma condição (Predicate) e percorre a lista tentando encontrar um item
    private static Optional<Manga> findBy(Predicate<Manga> predicate) {

        for (Manga manga : mangas) {
            // Se o mangá atual atender à condição (id ou título igual)
            if (predicate.test(manga)) {
                // Retorna imediatamente o mangá encontrado dentro de Optional
                return Optional.of(manga);
            }
        }
        // Se percorrer toda a lista e não encontrar nada, retorna Optional vazio
        return Optional.empty();
    }
}
