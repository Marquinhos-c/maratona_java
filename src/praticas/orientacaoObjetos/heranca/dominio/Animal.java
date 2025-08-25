package praticas.orientacaoObjetos.heranca.dominio;

/**
 * Classe base (superclasse) Animal.
 * Contém o atributo nome e um método genérico falar().
 */
public class Animal {
    private String nome;

    // Construtor da classe Animal
    public Animal(String nome) {
        this.nome = nome;
    }

    /**
     * Método genérico para emitir som.
     * Pode ser sobrescrito (override) nas subclasses.
     */
    public void falar() {
        System.out.println("O animal está fazendo um som");
    }

    // Getter e Setter do atributo nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
