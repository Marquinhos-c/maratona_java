package praticas.orientacaoobjetos.heranca.dominio;

/**
 * Classe final Passaro herda de Animal.
 * Como é final, não pode ser herdada por nenhuma outra classe.
 */
public final class Passaro extends Animal{

    // Construtor da subclasse Passaro
    public Passaro(String nome) {
        super(nome);
    }

    /**
     * Sobrescreve o método falar() da superclasse.
     * Aqui o pássaro emite um som específico (canto).
     */
    @Override
    public void falar() {
        System.out.println("O pássaro canta " + this.getNome() + " Piu piu!");
    }

  public void voar() {
        System.out.println("E " + this.getNome() + " está voando!");
    }
}
