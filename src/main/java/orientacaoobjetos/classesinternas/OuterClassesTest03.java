package orientacaoobjetos.classesinternas;

public class OuterClassesTest03 {
    private String name = "Marcos";

    static class Nested {
        private String lastName = "Costa";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        new Nested().print();
    }
}
