package projetos.projeto02.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    static {
        System.out.println("Aluno cadastrado no sistema! ");
    }

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno(String nome, int idade, double peso, double altura) {
        this(nome, idade);
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }
    public double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public void dadosAluno() {
        System.out.println("=== Dados do Aluno ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Altura: " + this.altura + " m");
    }
    public String classificacaoImc(double imc) {
        if (imc < 18.5) {
            return String.format("IMC: %.2f - Classificação: Magreza", imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            return String.format("IMC: %.2f - Classificação: Normal", imc);
        } else {
            return String.format("IMC: %.2f - Classificação: Sobrepeso", imc);
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
