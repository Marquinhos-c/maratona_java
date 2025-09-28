package orientacaoobjetos.metodos.construtores.test;

import orientacaoobjetos.metodos.construtores.dominio.AnimeConstrutores;
/**
 * Classe de teste que demonstra o uso dos construtores da classe AnimeConstrutores.
 * Aqui são criados dois objetos de Anime: um com o construtor completo e outro com o construtor vazio + setters.
 */
public class AnimeConstrutoresTest01 {
    public static void main(String[] args) {

        // Criação de um objeto usando o construtor com todos os parâmetros
        // Isso preenche os dados do anime logo na criação do objeto
        AnimeConstrutores anime = new AnimeConstrutores("Naruto", "tv", 12, "Ação", "Production");

        // Chamada do método imprime para mostrar os dados no console
        anime.imprime();

    }
}
