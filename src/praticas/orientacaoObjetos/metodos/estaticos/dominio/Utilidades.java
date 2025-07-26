package praticas.orientacaoObjetos.metodos.estaticos.dominio;

import java.util.Random;

/*
        Crie uma classe Utilidades com:
        Um método static chamado gerarId() que retorna um número aleatório
        Um método de instância chamado mostrarMensagem() que imprime uma mensagem qualquer
        Na classe de teste, chame corretamente os dois métodos e observe a diferença entre os dois tipos.
 */
public class Utilidades {

    public static int gerarId() {
        Random numero = new Random();
        int id = numero.nextInt(999) + 100;

        return id;
    }

    public void mostrarMensagem() {
        System.out.println("\nCódigo de verificação. ");
    }
}

