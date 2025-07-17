package orientacaoObjetos.metodos.sobreCarga.test;

import orientacaoObjetos.metodos.sobreCarga.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //anime.init("Naruto", "tv", 12);
        anime.init("Naruto", "tv", 12, "Ação");

        anime.imprime();
    }
}
