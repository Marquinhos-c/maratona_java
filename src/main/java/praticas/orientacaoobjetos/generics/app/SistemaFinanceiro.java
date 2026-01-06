package praticas.orientacaoobjetos.generics.app;

import praticas.orientacaoobjetos.generics.dominio.Dolar;
import praticas.orientacaoobjetos.generics.dominio.Real;
import praticas.orientacaoobjetos.generics.servico.Banco;
import praticas.orientacaoobjetos.generics.dominio.Carteira;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    public static void main(String[] args) {

        List<Real> realList = new ArrayList<>();

        Carteira<Real> carteira = new Carteira<>(realList);
        carteira.adicionar(new Real(5));

        Banco.auditarCarteira(realList);

        System.out.println("------------------------");

        List<Dolar> dolarList = new ArrayList<>();

        Carteira<Dolar> carteira2 = new Carteira<>(dolarList);
        carteira2.adicionar(new Dolar(8));

        // Erro poque o meu Banco.investir só Real
        //Banco.investir(dolarList);

        // aqui funcina por esse metodo funciona para todas classe filhas de Moeda
        Banco.auditarCarteira(dolarList);
    }
}
