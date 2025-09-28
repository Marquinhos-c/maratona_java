package orientacaoobjetos.sobreescrita.dominio;
/**
 * Classe Anime representa um anime com nome.
 *
 * Ela demonstra o uso de:
 * - Encapsulamento (atributo private + getters/setters)
 * - Construtor personalizado
 * - Sobrescrita do método toString() (override)
 */

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }


    /* Sobrescreve o método toString() da classe Object.
        * Esse método é chamado automaticamente quando usamos:
        * System.out.println(objeto) ou objeto.toString()
        * @return String representando o anime no formato: "Anime: <nome>"
    */
    @Override
    public String toString() {
        return "Anime: " + this.nome;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
