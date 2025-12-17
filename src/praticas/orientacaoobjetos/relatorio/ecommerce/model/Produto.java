package praticas.orientacaoobjetos.relatorio.ecommerce.model;

public class Produto {
    private Long id;
    private String nome;
    private double preco;
    private String categoria;

    public Produto(Long id, String nome, double preco, String categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }
}
