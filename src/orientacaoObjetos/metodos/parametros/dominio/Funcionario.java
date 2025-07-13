package orientacaoObjetos.metodos.parametros.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + ", ");
        }
        mediaSalarios(salarios);
    }
    public void mediaSalarios(double[] salarios) {
        if (salarios == null) {
            return;
        }
        double mediaSalarios = 0;
        for (double salario: salarios) {
            mediaSalarios += salario;
        }
        mediaSalarios /= salarios.length;
        System.out.printf("\nMédia salarial é %.2f", mediaSalarios);
    }
}
