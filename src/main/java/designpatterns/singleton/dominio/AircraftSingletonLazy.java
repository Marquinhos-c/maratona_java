package designpatterns.singleton.dominio;


import java.util.HashSet;
import java.util.Set;
/**
 * Singleton implementado com Lazy Initialization.
 *
 * Objetivo:
 * Criar a instância SOMENTE quando ela for realmente necessária,
 * economizando recursos.
 *
 * Técnica usada:
 * Double-Checked Locking (thread-safe e performática).
 */
public  class AircraftSingletonLazy {

    /**
     * Instância única do Singleton.
     *
     * Não é criada imediatamente.
     * Começa como null e só é inicializada
     * na primeira chamada do getINSTANCE().
     */
    private static AircraftSingletonLazy INSTANCE;
    /**
     * Conjunto de assentos disponíveis.
     * Representa o estado compartilhado do sistema.
     */
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    /**
     * Construtor PRIVADO.
     *
     * Impede a criação direta da classe com "new".
     * Regra obrigatória do padrão Singleton.
     */
    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    /**
     * Bloco de inicialização.
     *
     * Executado quando a instância é criada.
     * Como o Singleton cria apenas uma instância,
     * esse bloco roda apenas UMA vez.
     */
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    /**
     * Retorna a instância única do Singleton.
     *
     * Implementa Double-Checked Locking:
     * 1️⃣ Verifica se INSTANCE é null (sem custo de sincronização)
     * 2️⃣ Sincroniza apenas na primeira criação
     * 3️⃣ Verifica novamente antes de instanciar
     *
     * Isso garante:
     * - Thread-safety
     * - Boa performance
     */
    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            // Sincroniza apenas quando necessário
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

}
