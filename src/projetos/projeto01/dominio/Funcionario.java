package projetos.projeto01.dominio;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private Tarefa[] tarefas;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public Funcionario(String nome, String cargo, double salario, Tarefa[] tarefas){
        this(nome, cargo, salario);
        this.tarefas = tarefas;
    }

    public void mostrarDadosFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        if (tarefas != null) {
            System.out.println("Tarefas: ");
            for (Tarefa tarefa : tarefas) {
                if (tarefa != null) {
                    System.out.println("- " + tarefa.getDescricao() + " (" + tarefa.getStatus() + ") ");
                }
            }
        } else {
            System.out.println("Nenhuma tarefa atribuida! ");
        }
    }
    public void trabalhar() {
        System.out.println(this.nome + " Está trabalhando!");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }
    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}
