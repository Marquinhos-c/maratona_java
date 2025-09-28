package orientacaoobjetos.heranca.test;

import orientacaoobjetos.heranca.dominio.Funcionario;

public class HerancaTest02 {

    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carrega classe pai
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carrega classe filha
    // 2 - Alocado espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializados com valores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializados com valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Martins");
    }
}
