package arrays;

public class ForEach {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};
        int maior = numeros[0];
        // num: percorre o array numeros pelo indice
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println(maior);
    }
}
