package praticas.orientacaoobjetos.metodos.estaticos.test;

import praticas.orientacaoobjetos.metodos.estaticos.dominio.Utilidades;

public class UtilidadesTest {
    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades();

        utilidades.mostrarMensagem();

        int id = Utilidades.gerarId();
        System.out.println("ID :" + id);
    }
}
