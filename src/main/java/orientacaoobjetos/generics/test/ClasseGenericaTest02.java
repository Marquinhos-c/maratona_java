package orientacaoobjetos.generics.test;

import orientacaoobjetos.generics.dominio.Barco;
import orientacaoobjetos.generics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscaBarcoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentavelService.retornaBarcoAlugado(barco);
    }
}
