package orientacaoObjetos.classes.test;

import orientacaoObjetos.classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Importa classe | variável de referência | objeto
        Estudante estudante = new Estudante();
        estudante.nome = "Marcos";
        estudante.idade = 22;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
