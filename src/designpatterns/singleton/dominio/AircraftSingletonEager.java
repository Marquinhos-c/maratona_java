package designpatterns.singleton.dominio;


import java.util.HashSet;
import java.util.Set;

/**
 * Singleton que representa um único avião no sistema.
 *
 * Objetivo:
 * Garantir que exista apenas UMA instância de Aircraft,
 * mantendo um estado global compartilhado (assentos disponíveis).
 *
 * Tipo:
 * Singleton com Eager Initialization (instância criada na carga da classe).
 */
public final class AircraftSingletonEager {
    // Eager initialization
    /**
     * Instância única da classe.
     *
     * - static: pertence à classe
     * - final: não pode ser alterada
     * - Criada imediatamente (Eager)
     *
     * Thread-safe por padrão, pois a JVM garante
     * a inicialização segura de campos estáticos.
     */
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    /**
     * Conjunto de assentos disponíveis.
     * Representa o estado compartilhado do sistema.
     */
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    /**
     * Construtor PRIVADO.
     *
     * Impede a criação de novas instâncias usando "new".
     * Regra obrigatória do padrão Singleton.
     */
    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    /**
     * Bloco de inicialização.
     *
     * Executado quando a instância é criada.
     * Como o Singleton possui apenas uma instância,
     * esse bloco roda apenas UMA vez.
     */
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    /**
     * Retorna a instância única do Singleton.
     *
     * Ponto de acesso global controlado.
     */
    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    /**
     * Reserva um assento, caso esteja disponível.
     *
     * @param seat assento a ser reservado
     * @return true se a reserva foi feita,
     *         false se o assento já estava ocupado
     */
    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

}
