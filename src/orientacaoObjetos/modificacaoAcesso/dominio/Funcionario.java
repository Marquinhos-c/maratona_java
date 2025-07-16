package orientacaoObjetos.modificacaoAcesso.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double mediaSalarios = 0;

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
        for (double salario: salarios) {
            mediaSalarios += salario;
        }
        mediaSalarios /= salarios.length;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double[] getSalarios() {
        return salarios;
    }
    public double getMediaSalarios() {
        return mediaSalarios;
    }
}
