package praticas.orientacaoobjetos.sistema.rpg.dominio;

public class Porcao extends Item{
    private String efeito;

    public Porcao(String nome, double preco, int qualidade, String efeito) {
        super(nome, preco, qualidade);
        this.efeito = efeito;
    }

    public String getEfeito() {
        return efeito;
    }
}
