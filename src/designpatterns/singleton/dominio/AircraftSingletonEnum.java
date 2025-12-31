package designpatterns.singleton.dominio;

import java.util.HashSet;
import java.util.Set;

/**
 * Singleton implementado utilizando enum.
 *
 * Vantagens dessa abordagem:
 * - Garante UMA única instância automaticamente
 * - Thread-safe por definição da JVM
 * - Protege contra Reflection e Serialization
 *
 * Este Singleton representa um avião único no sistema,
 * responsável por controlar os assentos disponíveis.
 */
public enum AircraftSingletonEnum {

    /**
     * Instância única do Singleton.
     * A JVM garante que essa constante exista apenas uma vez.
     */
    INSTANCE;
    /**
     * Conjunto de assentos disponíveis.
     * Representa o estado compartilhado do sistema.
     */
    private final Set<String> availableSeats;

    /**
     * Construtor do enum.
     *
     * É chamado UMA única vez quando a constante INSTANCE é criada.
     * Mesmo sendo um construtor, a JVM impede chamadas externas.
     */
    AircraftSingletonEnum() {
        this.availableSeats = new HashSet<>();
        // Inicialização dos assentos disponíveis
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");
    }

    /**
     * Reserva um assento, caso esteja disponível.
     *
     * @param seat assento a ser reservado
     * @return true se a reserva foi realizada,
     *         false se o assento já estava ocupado
     */
    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
