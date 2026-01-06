package orientacaoobjetos.metodos.parametros.test;

import orientacaoobjetos.metodos.parametros.dominio.Estudante02;

public class EstudanteTest02 {
    public static void main(String[] args) {
        //criando dois objetos da classe Estudante02.
        Estudante02 estudante01 = new Estudante02();
        Estudante02 estudante02 = new Estudante02();
        //atribuindo valores aos atributos (nome, idade, sexo) dos dois objetos.
        estudante01.nome = "Marcos";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Evenlly";
        estudante02.idade = 18;
        estudante02.sexo = 'F';
        //chamando o método imprime() de cada objeto.
        estudante01.imprime();
        estudante02.imprime();
    }
}
