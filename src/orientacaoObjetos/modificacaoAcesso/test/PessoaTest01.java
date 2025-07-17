package orientacaoObjetos.modificacaoAcesso.test;

import orientacaoObjetos.modificacaoAcesso.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // modificar o atributo de forma direta não funciona, pois ele e privado
 //       pessoa.nome = "Goku";
 //       pessoa.idade = 18;

        // Usa métodos públicos (setters) para modificar os dados da pessoa.
        pessoa.setNome("Goku");
        pessoa.setIdade(18);

 //       pessoa.imprime();

        // Usa métodos públicos (getters) para acessar os dados da pessoa
        System.out.println("Nome: " + pessoa.getNome()); // imprime "Goku"
        System.out.println("Idade:" + pessoa.getIdade()); // imprime "18"
    }
}
