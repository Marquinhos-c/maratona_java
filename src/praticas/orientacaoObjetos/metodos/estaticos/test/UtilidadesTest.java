package praticas.orientacaoObjetos.metodos.estaticos.test;

import praticas.orientacaoObjetos.metodos.estaticos.dominio.Utilidades;

public class UtilidadesTest {
    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades();

        utilidades.mostrarMensagem();

        int id = Utilidades.gerarId();
        System.out.println("ID :" + id);
    }
}
