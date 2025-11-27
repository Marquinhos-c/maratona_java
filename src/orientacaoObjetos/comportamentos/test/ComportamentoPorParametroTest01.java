package orientacaoobjetos.comportamentos.test;

import orientacaoobjetos.comportamentos.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterGreenCars(cars));
        System.out.println(filterRedCars(cars));
        System.out.println("---------------------------");
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println("---------------------------");
        System.out.println(filterYearCars(cars, 2015));


    }

    private static List<Car> filterGreenCars(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterRedCars(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterYearCars(List<Car> cars, int year) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }
}
