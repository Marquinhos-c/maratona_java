package praticas.orientacaoobjetos.heranca.dominio;

/**
 * Subclasse Cachorro herda de Animal.
 * Representa um cachorro específico que sobrescreve o método falar().
 */
public class Cachorro extends Animal{

    // Construtor da subclasse Cachorro
    // Usa super() para chamar o construtor da classe Animal
    public Cachorro(String nome) {
        super(nome);
    }

    /**
     * Sobrescreve o método falar() da superclasse.
     * Aqui o cachorro emite um som específico (latido).
     */
    @Override
    public void falar() {
        System.out.println("O cachorro " + this.getNome() + " late Au au!");
    }


}
