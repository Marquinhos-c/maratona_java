package praticas.orientacaoobjetos.polimorfismo.figure.application;

import praticas.orientacaoobjetos.polimorfismo.figure.contract.Renderizavel;
import praticas.orientacaoobjetos.polimorfismo.figure.model.Circulo;
import praticas.orientacaoobjetos.polimorfismo.figure.model.FiguraGeometrica;
import praticas.orientacaoobjetos.polimorfismo.figure.model.Retangulo;

public class SistemaFiguras {
    public static void main(String[] args) {

        FiguraGeometrica figura1 = new Circulo("Azul","Circulo", 15);
        FiguraGeometrica figura2 = new Retangulo("Verde", "Retângulo", 6, 4);

        FiguraGeometrica[] figuras = new FiguraGeometrica[] {figura1, figura2};

        for (FiguraGeometrica figura : figuras) {
            System.out.println("-------------------");
            System.out.println("Nome da figura: " + figura.getNome());
            System.out.println("Cor da figura: " + figura.getCor());
            System.out.printf("Area: %.2f%n ", figura.calcularArea());
            System.out.printf("Perimetro: %.2f%n ", figura.calcularPerimetro());

            if (figura instanceof Renderizavel) {
                ((Renderizavel) figura).desenhar();
            }
        }
    }
}
