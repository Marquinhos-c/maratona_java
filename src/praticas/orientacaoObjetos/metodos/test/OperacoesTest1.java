package praticas.orientacaoObjetos.metodos.test;

import praticas.orientacaoObjetos.metodos.dominio.Operacoes;

public class OperacoesTest1 {
    public static void main(String[] args) {
        Operacoes contar = new Operacoes();
         int a = 1;
         int b = 10;
         System.out.println("Vai começar a contagem...");
         System.out.println(Operacoes.contador(a, b));
    }
}
