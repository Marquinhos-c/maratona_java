package orientacaoobjetos.generics.test;

import orientacaoobjetos.generics.dominio.Carro;
import orientacaoobjetos.generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscaCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornaCarroAlugado(carro);
    }
}
