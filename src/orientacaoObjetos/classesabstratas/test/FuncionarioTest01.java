package orientacaoObjetos.classesabstratas.test;

import orientacaoObjetos.classesabstratas.dominio.Desenvolvedor;
import orientacaoObjetos.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // Não é possível instanciar a classe abstrata diretamente
        // new Funcionario("Ana", 2000); // ISSO GERA UM ERRO DE COMPILAÇÃO

        Gerente gerente = new Gerente("Evenlly",50000);
        Desenvolvedor dev = new Desenvolvedor("Marcos", 18000);

        gerente.imprimirDados();
        System.out.printf("Bônus: R$ %.2f%n", gerente.calcularBonus());

        dev.imprimirDados();
        System.out.printf("Bônus: R$ %.2f%n", dev.calcularBonus());
    }
}
