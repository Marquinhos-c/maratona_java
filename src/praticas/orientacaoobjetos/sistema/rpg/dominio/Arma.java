package praticas.orientacaoobjetos.sistema.rpg.dominio;

public class Arma extends Item{
    private String tipoDano;

    public Arma(String nome, double preco, int qualidade, String tipoDano) {
        super(nome, preco, qualidade);
        this.tipoDano = tipoDano;
    }

    public String getTipoDano() {
        return tipoDano;
    }
}
