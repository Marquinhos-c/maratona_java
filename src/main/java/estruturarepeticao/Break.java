package estruturarepeticao;

public class Break {
    public static void main(String[] args) {
        // imprima os primeiros 25 números de uma contagem que era até 50
        for (int i = 0; i <= 50 ; i++) {
            if (i > 25){
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
