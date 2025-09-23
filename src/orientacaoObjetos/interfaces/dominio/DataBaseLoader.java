package orientacaoObjetos.interfaces.dominio;
// vantagens das interfaces é que uma classe pode ser implementadas
// multiplas interfaces
public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no bancos de dados");
    }
}
