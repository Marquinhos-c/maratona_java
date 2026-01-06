package orientacaoobjetos.comportamentos.test;

import orientacaoobjetos.comportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/**
 * Classe de teste para demonstrar o padrão de Comportamento por Parâmetro
 * utilizando Generics e Expressões Lambda.
 */
public class ComportamentoPorParametroTest03 {
    // Lista estática de carros para servir de base para os testes
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {

        // 1. Filtrando carros VERDES
        // Passamos a lista e uma Lambda que define a condição: cor deve ser igual a "green"
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));

        List<Car> redCars = filter(cars, car -> car.getColor().equals("red"));

        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);

        System.out.println("\n-----------------------------------------------------\n");

        // 4. Prova de conceito do GENERICS
        // O mesmo método 'filter' funciona para uma lista de Inteiros, não apenas Carros.
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        // Filtrando apenas números PARES
        System.out.println(filter(nums, num -> num % 2 == 0));
    }
    /**
     * Filtra uma lista genérica com base em uma condição fornecida via parâmetro.
     *
     * @param list      A lista contendo os elementos a serem verificados.
     * @param predicate A interface funcional que define a regra de filtro (retorna true ou false).
     * @param <T>       O tipo genérico dos elementos na lista (ex: Car, Integer, String).
     * @return Uma nova lista contendo apenas os elementos que passaram no teste do predicate.
     */
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        // Cria uma nova lista para armazenar os resultados filtrados
        List<T> filteredList = new ArrayList<>();

        // Itera sobre cada elemento da lista original
        for (T e : list) {
            // Executa o teste definido na expressão Lambda passada no 'main'
            if (predicate.test(e)) {
                filteredList.add(e); // Se o teste for true, adiciona na nova lista
            }
        }
        return filteredList;
    }
}