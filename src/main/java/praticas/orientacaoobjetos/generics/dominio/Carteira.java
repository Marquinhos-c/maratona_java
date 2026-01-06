package praticas.orientacaoobjetos.generics.dominio;

import java.util.List;

public class Carteira<T>{
    private List<T> lista;

    public Carteira(List<T> lista) {
        this.lista = lista;
    }

    public void adicionar(T moeda) {
        lista.add(moeda);
    }

}
