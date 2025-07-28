package orientacaoObjetos.associacao.test;

import orientacaoObjetos.associacao.dominio.Escola;
import orientacaoObjetos.associacao.dominio.Professor;

public class EscolaTest1 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Marquinhos");
        Professor professor2 = new Professor("Alan");

        Professor[] professores = {professor1, professor2};
        
        Escola escola = new Escola("Estadual", professores);

        escola.imprime();
    }
}
