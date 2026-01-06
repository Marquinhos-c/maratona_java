package arrays;

public class TiposDeArrays {
    public static void main(String[] args) {
        int [] numeros1 = new int[3];
        // adicionando manualmente
        int [][] numeros2 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9, 10}};
        int [] numeros3 = new int[]{3, 2, 1};

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(numeros1[i]);
        }
    }
}
