package orientacaoobjetos.heranca.test;

import orientacaoobjetos.heranca.dominio.Endereco;
import orientacaoobjetos.heranca.dominio.Funcionario;
import orientacaoobjetos.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args){
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("79130-000");

        Pessoa pessoa = new Pessoa("Marcos");
        pessoa.setCpf("111.111.000-00");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Willian");
        funcionario.setCpf("000.222.333-55");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);

        pessoa.imprimeDados();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        funcionario.imprimeDados();

        funcionario.relatorioPagamento();
    }
}
