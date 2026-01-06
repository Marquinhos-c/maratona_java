package orientacaoobjetos.polimorfismo.servico;

import orientacaoobjetos.polimorfismo.reposistorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
