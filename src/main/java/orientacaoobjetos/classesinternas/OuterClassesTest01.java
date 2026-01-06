package orientacaoobjetos.classesinternas;
// classe interna
public class OuterClassesTest01 {
    private String nome = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        //OuterClassesTest01 outerClasses = new OuterClassesTest01();
        //Inner inner = outerClasses.new Inner();
        //inner.printOuterClassAttribute();

        Inner inner = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
    }
}
