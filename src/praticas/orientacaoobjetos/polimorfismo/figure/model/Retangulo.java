package praticas.orientacaoobjetos.polimorfismo.figure.model;

public class Retangulo extends FiguraGeometrica{
    private double largura;
    private double altura;

    public Retangulo(String cor, String nome, double largura, double altura) {
        super(cor, nome);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
