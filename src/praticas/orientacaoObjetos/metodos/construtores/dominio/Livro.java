package praticas.orientacaoObjetos.metodos.construtores.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
        this.preco = 0.0;
    }
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 0.0;
    }
    public Livro (String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("titulo: " + titulo + "  | autor: " + autor + " | preço: " + preco);
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
