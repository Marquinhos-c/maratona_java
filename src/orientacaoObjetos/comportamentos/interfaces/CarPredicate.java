package orientacaoobjetos.comportamentos.interfaces;

import orientacaoobjetos.comportamentos.dominio.Car;
// para usar lambdas precisa de um interface funcional como essa
// ou seja, que tenha somente um metodo que seja abastrato
@FunctionalInterface
public interface CarPredicate {

    boolean test(Car car); // crontrato da lambda que retorna true ou false
    //(parametro) -> <expressão>
    //(Car car) -> car.getColor().equals("green");
}
