package praticas.orientacaoobjetos.generics.dominio;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double getValor() {
        return valor * 5;
    }
}
