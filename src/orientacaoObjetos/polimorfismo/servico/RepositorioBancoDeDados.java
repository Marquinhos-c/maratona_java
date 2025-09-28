package orientacaoObjetos.polimorfismo.servico;

import orientacaoObjetos.polimorfismo.reposistorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");
    }
}
