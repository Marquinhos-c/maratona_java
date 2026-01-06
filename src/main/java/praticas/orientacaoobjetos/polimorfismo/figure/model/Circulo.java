package praticas.orientacaoobjetos.polimorfismo.figure.model;

import praticas.orientacaoobjetos.polimorfismo.figure.contract.Renderizavel;

public class Circulo extends FiguraGeometrica implements Renderizavel {
    private double raio;

    public Circulo(String cor, String nome, double raio) {
        super(cor, nome);
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um " + nome + " com raio " + raio);
    }
}
