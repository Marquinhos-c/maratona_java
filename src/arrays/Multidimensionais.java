package arrays;

public class Multidimensionais {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 meses
        // 31, 28, 30, 29, 31 quantidade de dia que o mês tem
        int [][] mesesQuantidadeDias = new int[2][5];
        mesesQuantidadeDias[0][0] = 1;
        mesesQuantidadeDias[0][1] = 2;
        mesesQuantidadeDias[0][2] = 3;
        mesesQuantidadeDias[0][3] = 4;
        mesesQuantidadeDias[0][4] = 5;

        mesesQuantidadeDias[1][0] = 31;
        mesesQuantidadeDias[1][1] = 30;
        mesesQuantidadeDias[1][2] = 31;
        mesesQuantidadeDias[1][3] = 29;
        mesesQuantidadeDias[1][4] = 28;

        for (int i = 0; i < mesesQuantidadeDias.length; i++) {
            System.out.println("\n");
            for (int j = 0; j < mesesQuantidadeDias[i].length; j++) {
                System.out.print(mesesQuantidadeDias[i][j] + "\t");
            }
        }
    }
}
