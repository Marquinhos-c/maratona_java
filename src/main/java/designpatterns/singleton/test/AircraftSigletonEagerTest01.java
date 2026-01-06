package designpatterns.singleton.test;

import designpatterns.singleton.dominio.AircraftSingletonEager;
/**
 * Classe de teste para validar o comportamento do Singleton.
 *
 * Objetivo:
 * Verificar se a instância é única
 * e se o estado é compartilhado entre chamadas.
 */
public class AircraftSigletonEagerTest01 {
    public static void main(String[] args) {
        // Primeira tentativa de reservar o assento 1A
        bookSeat("1A");
        // Segunda tentativa de reservar o mesmo assento
        bookSeat("1A");

    }

    /**
     * Simula a tentativa de reserva de um assento.
     *
     * @param seat assento desejado
     */
    private static void bookSeat(String seat) {
        // Mostra que sempre é a mesma instância (mesmo endereço de memória)
        System.out.println(AircraftSingletonEager.getINSTANCE());
        // Obtém a instância única do Singleton
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        // Tenta reservar o assento e imprime o resultado
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}

/*
Mini-resumo (pra fixar)

Singleton → uma única instância

Eager → criada na carga da classe

Construtor privado → impede new

Estado compartilhado → motivo real do padrão

Teste → prova que o estado é mantido
 */

