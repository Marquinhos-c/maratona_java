package orientacaoobjetos.generics.test;

import orientacaoobjetos.generics.dominio.Barco;
import orientacaoobjetos.generics.dominio.Carro;
import orientacaoobjetos.generics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        // 1. Preparação dos dados (Listas mutáveis)
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        // ==========================================================================================
        // CENÁRIO 1: ALUGUEL DE CARROS
        // Aqui definimos: T = Carro.
        // O Java cria uma instância do serviço que só entende "Carro".
        // ==========================================================================================
        RentavelService<Carro> rentavelServiceCarro = new RentavelService<>(carrosDisponiveis);

        // Observe: O retorno já é um 'Carro'. Não precisa fazer cast: (Carro) obj.
        Carro carro = rentavelServiceCarro.buscaObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        // Segurança: Se tentar passar um 'barco' aqui, o código NÃO COMPILA.
        rentavelServiceCarro.retornaObjetoAlugado(carro);

        System.out.println("-----------------------------");

        RentavelService<Barco> rentavelServiceBarco = new RentavelService<>(barcosDisponiveis);

        // ==========================================================================================
        // CENÁRIO 2: ALUGUEL DE BARCOS
        // Reutilizamos a MESMA classe de serviço.
        // Aqui definimos: T = Barco.
        // ==========================================================================================
        Barco barco = rentavelServiceBarco.buscaObjetoDisponivel();
        System.out.println("Usando barco por um mês...");
        rentavelServiceBarco.retornaObjetoAlugado(barco);
    }
}
