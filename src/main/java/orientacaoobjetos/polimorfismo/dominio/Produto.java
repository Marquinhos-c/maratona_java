package orientacaoobjetos.polimorfismo.dominio;
/**
 * Representa a abstração de um produto genérico no sistema.
 * <p>
 * Esta classe é <b>abstrata</b>, servindo como base para produtos específicos
 * como Computador, Tomate, etc.
 * <p>
 * Ela também implementa a interface {@link Taxavel}, garantindo que todo produto
 * possa ter seu imposto calculado.
 *
 * @author Marcos Costa
 * @version 1.0
 */

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
}
