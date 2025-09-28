package orientacaoobjetos.metodos.modificadoresEstaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloca de inicialização static 1 ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloca de inicialização static 2 ");
    }

    {
        System.out.println("Dentro do bloca de inicialização não static ");
    }

    // construtor
    public Anime(String nome) {
        this.nome = nome;
    }
    // construtor
    public Anime() {
        for (int episodio: episodios) {
            System.out.print(episodio + " ");
        }
    }

    public void setEpisodio(int[] episodios) {
        Anime.episodios = episodios;
    }
    public int[] getEpisodio() {
        return episodios;
    }
}
