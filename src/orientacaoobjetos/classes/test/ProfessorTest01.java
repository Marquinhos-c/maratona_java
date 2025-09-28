package orientacaoobjetos.classes.test;

import orientacaoobjetos.classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Xifu";
        professor.idade = 88;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + "idade: " + professor.idade + "sexo: " + professor.sexo);
    }
}
