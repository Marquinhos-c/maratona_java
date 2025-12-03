package orientacaoobjetos.optional.test;

import orientacaoobjetos.optional.dominio.Manga;
import orientacaoobjetos.optional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        // Busca um mangá pelo título, recebendo um Optional<Manga> como retorno
        Optional<Manga> mangaByTitle = MangaRepositorio.findByTitle("Boku no hero");
        // ifPresent executa a ação SOMENTE se o Optional tiver um valor
        // Aqui, se o mangá existir, altera o título para "Boku no hero 2"
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);


        // Busca um mangá pelo id 2
        // orElseThrow: se o mangá NÃO existir, lança IllegalArgumentException
        // Se existir, retorna o próprio objeto Manga
        Manga mangaById = MangaRepositorio.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);


        // Tenta buscar o mangá "Drifters"
        // Como ele NÃO existe, retorna o valor criado no orElseGet
        // orElseGet executa a função APENAS quando o Optional estiver vazio
        Manga newManga = MangaRepositorio.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 15));
        System.out.println(newManga);

    }
}
