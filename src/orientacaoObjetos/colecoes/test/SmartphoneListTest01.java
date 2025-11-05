package orientacaoobjetos.colecoes.test;

import orientacaoobjetos.colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1SDB5", "Apple");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List <Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3); // adicionando no indice 0

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("33333", "Samsung");

        System.out.println(smartphones.contains(s4)); // "contains" verifica se s4 existe na lista
        int indexSmartphone4 = smartphones.indexOf(s2); // "indexOf" indentifca o indince
        System.out.println(indexSmartphone4);

    }
}
