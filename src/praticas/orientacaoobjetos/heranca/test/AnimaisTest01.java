package praticas.orientacaoobjetos.heranca.test;

import praticas.orientacaoobjetos.heranca.dominio.Cachorro;
import praticas.orientacaoobjetos.heranca.dominio.Gato;
import praticas.orientacaoobjetos.heranca.dominio.Passaro;

/**
 * Classe de teste para as classes de animais.
 * Cria objetos das subclasses e chama seus métodos falar() e voar().
 */
public class AnimaisTest01 {
    public static void main(String[] args) {

        // Criando objetos das subclasses
        Cachorro cachorro = new Cachorro("Apollo");
        Gato gato = new Gato("Tom");
        Passaro passaro = new Passaro("Blu");

        // Chamando métodos sobrescritos
        cachorro.falar();
        gato.falar();
        passaro.falar();
        passaro.voar();
    }
}
