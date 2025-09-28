package orientacaoobjetos.classes.test;

import orientacaoobjetos.classes.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante();
        Estudante estudante = new Estudante();

        estudante2.nome = "Marcos";

        System.out.println(estudante2.nome);
        System.out.println("---------------");
        System.out.println(estudante.nome);
    }
}
