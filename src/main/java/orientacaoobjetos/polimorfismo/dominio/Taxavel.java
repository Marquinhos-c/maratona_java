package orientacaoobjetos.polimorfismo.dominio;
/**
 * Define o contrato para objetos que podem ser taxados.
 * <p>
 * Qualquer classe que implemente esta interface deve fornecer uma
 * implementação para o cálculo de imposto.
 *
 * @author Marcos Costa
 */

public interface Taxavel {
    public abstract double calcularImposto(); // 'public abstract' é implícito e pode ser omitido.
}
