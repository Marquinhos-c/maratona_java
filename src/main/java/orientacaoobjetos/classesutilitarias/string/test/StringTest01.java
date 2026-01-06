package orientacaoobjetos.classesutilitarias.string.test;

public class StringTest01 {
    public static void main(String[] args) {

        // String são imutaveis
        String nome = "Marcos"; // String constant poll
        String nome2 = "Marcos";
        System.out.println(nome == nome2); // verdadeiro pois são armazenados juntos no poll de string

        // Falso pois nome3 agora esta armazenado em outro espaço na memoria
        String nome3 = new String("Marcos");
        System.out.println(nome3 == nome2);
        System.out.println(nome2 == nome3.intern()); // verdadeiro, pois os valores internos são iguais

        // concatenação
        nome = nome.concat(" Costa");
        System.out.println(nome);
    }
}
