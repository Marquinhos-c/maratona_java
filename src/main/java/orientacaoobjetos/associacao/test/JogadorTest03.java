package orientacaoobjetos.associacao.test;

import orientacaoobjetos.associacao.dominio.Jogador;
import orientacaoobjetos.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Dybala");
        Time time = new Time("Argentina");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();

        System.out.println("\n--- Time ---");
        time.imprime();
    }
}
