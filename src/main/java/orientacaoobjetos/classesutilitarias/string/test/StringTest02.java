package orientacaoobjetos.classesutilitarias.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Luffy   ";
        System.out.println(nome.charAt(4));
        System.out.println(nome.length());
        // replece muda a letra por outra
        System.out.println(nome.replace("L", "T"));
        // minúsculo
        System.out.println(nome.toLowerCase());
        // maiúsculo
        System.out.println(nome.toUpperCase());
        // Mostra string por meio do indice
        System.out.println(nome.substring(0, 2));
        // remove os espaços em branco
        System.out.println(nome.trim());
    }
}
