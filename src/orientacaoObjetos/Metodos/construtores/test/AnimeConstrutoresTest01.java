package orientacaoObjetos.metodos.construtores.test;

import orientacaoObjetos.metodos.construtores.dominio.AnimeConstrutores;
/**
 * Classe de teste que demonstra o uso dos construtores da classe AnimeConstrutores.
 * Aqui são criados dois objetos de Anime: um com o construtor completo e outro com o construtor vazio + setters.
 */
public class AnimeConstrutoresTest01 {
    public static void main(String[] args) {

        // Criação de um objeto usando o construtor com todos os parâmetros
        // Isso preenche os dados do anime logo na criação do objeto
        AnimeConstrutores anime = new AnimeConstrutores("Naruto", "tv", 12, "Ação");

        // Chamada do método imprime para mostrar os dados no console
        anime.imprime();

        System.out.println("------");

        // Criação de outro objeto usando o construtor padrão (sem parâmetros)
        AnimeConstrutores anime2 = new AnimeConstrutores();

        // Agora os dados são preenchidos usando os métodos set (setters)
        anime2.setNome("One Piece");
        anime2.setTipo("Aventura");
        anime2.setEpisodios(1000);
        anime2.setGenero("Shounen");

        // Imprime os dados do segundo anime
        anime2.imprime();
    }
}
