package estruturasCondicionais;

import java.util.Scanner;

// idade menor que 15 categoria infantil
// idade for maior ou igual 15 e menor que 18 categoria juvenil
// idade for maior ou igual 18 Categoria adulto
public class IfsElses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a idade do atleta: ");
        int idade = input.nextInt();
        String categoria;

        // verificando qual é a categoria do atleta
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria ="Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
