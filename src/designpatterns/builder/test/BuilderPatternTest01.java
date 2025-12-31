package designpatterns.builder.test;

import designpatterns.builder.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {

        Person person = Person.PersonBuilder
                .builder()
                .firstName("Marcos")
                .lastName("Costa")
                .userName("Marquinhos08")
                .email("marquinhos.08@gmail.com")
                .build();
        System.out.println(person);

    }
}
