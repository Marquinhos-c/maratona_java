package orientacaoObjetos.metodos.blocosInicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    /*
    Quando você cria um objeto Anime, a ordem de execução será:

    1 - A JVM aloca memória para o objeto.
    2 - Valores padrão são atribuídos aos atributos (null, 0, etc.).
    3 - O bloco de inicialização é executado.
    4 - O construtor é executado.
     */

    // bloco de inicialização de instância (não estático)
    {
        System.out.println("Dentro do bloca de inicialização! ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    // construtor
    public Anime (String nome) {
        this.nome = nome;
        System.out.println(nome);
    }
    // construtor
    public Anime() {
        System.out.println("Dentro do construtor! ");
        for (int episodio: episodios) {
            System.out.print(episodio + " ");
        }
    }

    public void setEpisodio(int[] episodios) {
        this.episodios = episodios;
    }

    public int[] getEpisodio() {
        return episodios;
    }
}
