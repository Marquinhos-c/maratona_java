package orientacaoobjetos.polimorfismo.test;

import orientacaoobjetos.polimorfismo.reposistorio.Repositorio;
import orientacaoobjetos.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
