package orientacaoobjetos.modificadorfinal.test;

import orientacaoobjetos.modificadorfinal.dominio.Carro;
import orientacaoobjetos.modificadorfinal.dominio.Ferrari;

/**
 * Classe de teste para Carro.
 * Demonstra:
 * - Acesso à constante static final
 * - Modificação de atributos internos de um objeto final
 */

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        // Mostra a constante da classe (não precisa de objeto)
        System.out.println(Carro.VELOCIDADE_LIMITE);

        // Mostra o comprador antes de definir nome
        System.out.println(carro.COMPRADOR);// Comprador{nome='null'}

        // Modifica o atributo interno do objeto final
        carro.COMPRADOR.setNome("Marquinhos");

        // Mostra o comprador após alteração
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
