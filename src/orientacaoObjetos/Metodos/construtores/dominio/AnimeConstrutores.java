package orientacaoObjetos.metodos.construtores.dominio;
/*
    Classe que representa um Anime com nome, tipo, número de episódios e gênero.
    Demonstra o uso de construtores, encapsulamento (get/set) e método de impressão.
 */
public class AnimeConstrutores {
    // Atributos privados garantem o encapsulamento
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    // Construtor com parâmetros - permite criar um objeto Anime já com todos os dados definidos.
    public AnimeConstrutores(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public AnimeConstrutores(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero); // reaproveita o outro construtor
        this.estudio = estudio;              // Atribui o valor do parâmetro adicional
    }

    // Método que imprime os dados do anime no console.
    // Usa o this para acessar os atributos atuais do objeto.
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    // Getters e setters

    // Define o valor do gênero.
    public void setGenero(String genero) {
        this.genero = genero;
    }
    // Retorna o gênero atual do anime.
    public String getGenero() {
        return this.genero;
    }
    // Define o valor do nome.
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Retorna o nome do anime.
    public String getNome() {
        return this.nome;
    }
    // Define o valor do tipo.
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    // retorna o tipo do anime.
    public String getTipo(){
        return this.tipo;
    }
    // Define o valor do Episódios.
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    // retona o número de episódios
    public int getEpisodios() {
        return this.episodios;
    }
}
