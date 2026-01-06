package orientacaoobjetos.classesinternas;
// classe interna local
public class OuterClassesTest02 {
    private String name = "Goku";

    void print() {
        // o atributo se torna final não pode ser auterado
        String lastName = "Kakaroto";

        class LocalClass{
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }


    public static void main(String[] args) {
        //OuterClassesTest02 outerClasses = new OuterClassesTest02();
        //outerClasses.print();
        new OuterClassesTest02().print();
    }
}
