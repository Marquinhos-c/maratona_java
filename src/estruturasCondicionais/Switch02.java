package estruturasCondicionais;
// dados os valores 1 a 7, imprima se é dia útil ou final de semana
// considerando 1 como domingo
public class Switch02 {
    public static void main(String[] args) {
        byte dia = 7;

        // segunda maneira
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido, digite entre 1 e 7...");
        }
    }
}
