package orientacaoObjetos.classesabstratas.test;

import orientacaoObjetos.classesabstratas.dominio.Desenvolvedor;
import orientacaoObjetos.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Evenlly",50000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Marcos", 18000);
        System.out.println(desenvolvedor);
    }
}
