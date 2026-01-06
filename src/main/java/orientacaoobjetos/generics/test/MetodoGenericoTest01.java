package orientacaoobjetos.generics.test;

import orientacaoobjetos.generics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Carro> carroList = criarArrayComUmObjeto(new Carro("Vectra"));
        System.out.println(carroList);
    }
    /*
    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> lista = new ArrayList<>();
        lista.add(t);

        System.out.println(lista);
    }
     */

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
}
