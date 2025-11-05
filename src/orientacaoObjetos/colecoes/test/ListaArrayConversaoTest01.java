package orientacaoobjetos.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {

        // List
        List <Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Conversão List para Array
        Integer[] listToArray = numeros.toArray(new Integer[numeros.size()]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("-----------------------");

        // Array
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        // Conversão Array para List
        List<Integer> arrayToList = Arrays.asList(numerosArray); // "asList" mante um link com array original, se eu modificar a lista modifica o array também
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("-----------------------");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray)); // Ao modicar agora não altera o Array
        numerosList.add(15);
        System.out.println(numerosList);

    }
}
