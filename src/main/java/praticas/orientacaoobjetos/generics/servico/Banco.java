package praticas.orientacaoobjetos.generics.servico;

import praticas.orientacaoobjetos.generics.dominio.Moeda;
import praticas.orientacaoobjetos.generics.dominio.Real;

import java.util.List;

public class Banco {

    public static void auditarCarteira(List<? extends Moeda> moedas) {
        for (Moeda moeda : moedas) {
            System.out.println("Valor: " + moeda.getValor());
        }
    }

    public static void investir(List<? super Real> moedas) {
        moedas.add(new Real(100.00));
        moedas.add(new Real(50.00));
        moedas.add(new Real(10.00));
    }
}
