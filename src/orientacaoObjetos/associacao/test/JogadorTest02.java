package orientacaoObjetos.associacao.test;

import orientacaoObjetos.associacao.dominio.Jogador;
import orientacaoObjetos.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Time time = new Time("Inter Miami");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
