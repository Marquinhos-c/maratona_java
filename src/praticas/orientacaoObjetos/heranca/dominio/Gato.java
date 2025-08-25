package praticas.orientacaoObjetos.heranca.dominio;

/**
 * Subclasse Gato herda de Animal.
 * Representa um gato específico que sobrescreve o método falar().
 */
public class Gato extends Animal{

    // Construtor da subclasse Gato
    // Usa super() para inicializar o atributo nome da classe Animal
    public Gato(String nome) {
        super(nome);
    }

    /**
     * Sobrescreve o método falar() da superclasse.
     * Aqui o gato emite um som específico (miado).
     */
    @Override
    public void falar() {
        System.out.println("O gato " + this.getNome() + " mia Miau!");
    }
}
