package orientacaoObjetos.interfaces.dominio;

public interface DataLoader {
    // todos os metodos de interface são publicos e abstrato
    // não pode ter corpo e tem que ser reescrito caso a interface seja implementada
    public abstract void load();

    // por isso java criou default possibilitando dar funcionabilidade
    // a os metodos e não gerando mais erro caso o metodo não reescrito
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
