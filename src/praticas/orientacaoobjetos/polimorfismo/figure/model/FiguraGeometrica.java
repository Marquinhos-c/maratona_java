package praticas.orientacaoobjetos.polimorfismo.figure.model;

public abstract class FiguraGeometrica {
    protected String nome;
    protected String cor;

    FiguraGeometrica(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();


    public String getNome() {
        return nome;
    }
    public String getCor() {
        return cor;
    }
}
