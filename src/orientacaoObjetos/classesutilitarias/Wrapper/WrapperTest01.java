package orientacaoobjetos.classesutilitarias.Wrapper;

public class WrapperTest01 {
    public static void main(String[] args) {

        // tipo primitivo
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'P' ;
        boolean BooleanP = false;

        // Wrapper
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'w' ;
        Boolean BooleanW = false;

        // O inverso de autoboxing: o Java converte um objeto Wrapper → primitivo automaticamente.
        int i = intW; // unboxing
        System.out.println(i);

        // Quando o Java converte automaticamente um valor primitivo → Wrapper.
        Integer intW2 = Integer.parseInt("1");
        System.out.println(intW2);

        //Converte a string "true" ou "false" em valor booleano
        //"true" (ignora maiúsculas/minúsculas) → true
        //Qualquer outro texto → false
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        // Verifica se o caractere é um número
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        // Verifica se é letra
        System.out.println(Character.isLetter('d'));
        // Verifica se é letra ou número
        System.out.println(Character.isLetterOrDigit('!'));
        // Verifica se é maiúsculo
        System.out.println(Character.isUpperCase('A'));
        // Verifica se é minúsculo
        System.out.println(Character.isLowerCase('a'));
        // Converte para maiúsculo
        System.out.println(Character.toUpperCase('a'));
        // Converte para minúsculo
        System.out.println(Character.toLowerCase('A'));
    }
}
