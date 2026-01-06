package arrays;

public class ForEachDias {
    public static void main(String[] args) {
        int [][] dias = new int[2][3];
        dias[0][0] = 29;
        dias[0][1] = 30;
        dias[0][2] = 28;

        dias[1][0] = 29;
        dias[1][1] = 31;
        dias[1][2] = 30;
        System.out.println("FOR 1");
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        /*
          esse for tem que declarar que é uma "variável de array",
          no caso o "arrayBase" recebe todos números do array "dias" no "indice 0" e depois "indice 1"
          depois num percorre todo arrayBase e mostra de 1 por um
         */
        System.out.println("FOR 2");
        for (int [] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
