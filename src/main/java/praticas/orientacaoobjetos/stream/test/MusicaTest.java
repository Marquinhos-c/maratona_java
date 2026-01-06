package praticas.orientacaoobjetos.stream.test;

import praticas.orientacaoobjetos.stream.dominio.Musica;

import java.util.ArrayList;
import java.util.List;

public class MusicaTest {
    private static List<Musica> musicas = new ArrayList<>(List.of(
            new Musica("Morada", "Marcos", "Gospel", 2003),
            new Musica("Sem volta", "Mica", "Rock", 1998),
            new Musica("10000 anos", "Furia", "Rock", 1999),
            new Musica("Vivo esta", "Ferdinando", "Gospel", 2015),
            new Musica("Ousar do amor", "Não sei", "Gospel", 2019)

    ));

    public static void main(String[] args) {
        List<Musica> rock = musicas.stream()
                .filter(m -> m.getGenero().equalsIgnoreCase("Rock"))
                .toList();
        System.out.println(rock);

        List<String> musicasAntingas = musicas.stream()
                .filter(m -> m.getAnoLacamento() < 2000)
                .map(Musica::getTitulo)
                .toList();
        System.out.println(musicasAntingas);
    }
}
