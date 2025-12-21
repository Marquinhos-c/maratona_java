package praticas.orientacaoobjetos.sistema.rpg.dominio;

public abstract class Item {
    private String nome;
    private double preco;
    private int qualidade;

    public Item(String nome, double preco, int qualidade) {
        this.nome = nome;
        this.preco = preco;
        this.qualidade = qualidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQualidade() {
        return qualidade;
    }
}
