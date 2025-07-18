package praticas.orientacaoObjetos.metodos.parametros.test;

import praticas.orientacaoObjetos.metodos.parametros.dominio.Fatorial;

public class FatorialTest {
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.println(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
