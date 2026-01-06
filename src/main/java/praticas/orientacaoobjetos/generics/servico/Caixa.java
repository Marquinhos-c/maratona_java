package praticas.orientacaoobjetos.generics.servico;

public class Caixa<T> {
    private T conteudo;


    public void guardar(T objeto) {
        this.conteudo = objeto;
    }

    public T abrir() {
        return conteudo;
    }
}
