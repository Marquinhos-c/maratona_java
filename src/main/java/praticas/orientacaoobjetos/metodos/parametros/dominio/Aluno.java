package praticas.orientacaoobjetos.metodos.parametros.dominio;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
}
