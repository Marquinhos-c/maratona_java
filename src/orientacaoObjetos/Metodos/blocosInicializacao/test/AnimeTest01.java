package orientacaoobjetos.metodos.blocosInicializacao.test;

import orientacaoobjetos.metodos.blocosInicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime1 = new Anime("Naruto");

        for (int episodio : anime.getEpisodio()) {
            System.out.print(episodio + " ");
        }
    }
}
