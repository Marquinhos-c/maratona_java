package orientacaoobjetos.generics.test;

abstract class Animal {
    public abstract void consultar();
}
class Cachorro extends Animal {
    @Override
    public void consultar() {
        System.out.println("Consultando doguinho...");
    }
}
class Gato extends Animal {
    @Override
    public void consultar() {
        System.out.println("Consultando Gato...");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);

        Animal[] animal = {new Cachorro(), new Gato()};
        printConsulta(animal);

    }
    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consultar();
        }
    }
}
