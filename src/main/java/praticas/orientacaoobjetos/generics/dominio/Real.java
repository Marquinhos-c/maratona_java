package praticas.orientacaoobjetos.generics.dominio;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }

    @Override
    public double getValor() {
        return valor;
    }
}
