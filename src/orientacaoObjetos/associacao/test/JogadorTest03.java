package orientacaoObjetos.associacao.test;

import orientacaoObjetos.associacao.dominio.Jogador;
import orientacaoObjetos.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Dybala");
        Time time = new Time("Argentina");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("\n--- Jogador ---");
        jogador1.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
