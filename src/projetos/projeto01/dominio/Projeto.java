package projetos.projeto01.dominio;

public class Projeto {
    private String nome;
    private Cliente cliente;
    private Funcionario[] equipe;
    private int quantidadeFuncionarios = 0;

    public Projeto(String nome, Cliente cliente, Funcionario[] equipe) {
        this.nome = nome;
        this.cliente = cliente;
        this.equipe = equipe;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (quantidadeFuncionarios < equipe.length) {
            equipe[quantidadeFuncionarios] = funcionario;
            quantidadeFuncionarios++;
            System.out.println("Funcionário " + funcionario.getNome() + " adicionado ao projeto " + nome);
        }else {
            System.out.println("Equipe cheia! Não é possível adicionar mais funcionários. ");
        }
    }
    public void exibirEquipe() {
        System.out.println("Equipe do projeto: " + nome);
        if (quantidadeFuncionarios == 0) {
            System.out.println("Nenhum funcionário adicionado à aquipe ainda.");
        }else {
            for (int i = 0; i < quantidadeFuncionarios; i++){
                Funcionario f = equipe[i];
                if (f != null) {
                    System.out.println("- " + f.getNome() + " (" + f.getCargo() + ")");
                }
            }
        }
    }
    public void exibirInformacoes() {
        System.out.println("Projeto: " + nome);
        System.out.println("Cliente: " + (cliente != null ? cliente.getNome() : "Nenhum cliente associado"));
    }

    public Funcionario[] getEquipe() {
        return equipe;
    }
    public void setEquipe(Funcionario[] equipe) {
        this.equipe = equipe;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}