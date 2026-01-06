package orientacaoobjetos.metodos.parametros.dominio;
/*
Em Java, quando você passa um tipo primitivo (como int)
para um método, o que é passado é uma cópia do valor,
não a variável original. Isso significa:
- numero1 recebe uma cópia de a
- numero2 recebe uma cópia de b
- Alterar numero1 e numero2 não altera a e b
 */
public class Calculadora {
    public void alteraDoisNumeros(int numero1, int numero2) {
        // recebe a copia de a e b mais não altera
        numero1 = 99;
        numero2 = 48;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("num1 "+numero1);
        System.out.println("num2 "+ numero2);
    }
}
