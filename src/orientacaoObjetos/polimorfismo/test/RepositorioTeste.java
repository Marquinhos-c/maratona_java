package orientacaoObjetos.polimorfismo.test;

import orientacaoObjetos.polimorfismo.reposistorio.Repositorio;
import orientacaoObjetos.polimorfismo.servico.RepositorioArquivo;
import orientacaoObjetos.polimorfismo.servico.RepositorioBancoDeDados;
import orientacaoObjetos.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
