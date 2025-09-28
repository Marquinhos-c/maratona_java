package orientacaoObjetos.polimorfismo.servico;

import orientacaoObjetos.polimorfismo.reposistorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
