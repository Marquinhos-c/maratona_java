package praticas.orientacaoobjetos.metodos.construtores.test;

import praticas.orientacaoobjetos.metodos.construtores.dominio.Livro;

public class LivroTest {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setTitulo("Livre ");
        livro1.setAutor("Guilherme ");
        livro1.setPreco(250);


        Livro livro2 = new Livro("Pequeno Principe ", "Marcos Costa ");
        Livro livro3 = new Livro("Colapso ", "Evenllyn ", 200);

        livro1.exibirDetalhes();
        System.out.println("---------------------------------------------------");
        livro2.exibirDetalhes();
        System.out.println("---------------------------------------------------");
        livro3.exibirDetalhes();
    }
}
