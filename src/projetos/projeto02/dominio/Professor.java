package projetos.projeto02.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private int registro;

    public Professor(String nome, String especialidade, int registro) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.registro = registro;
    }

    public void dadosProfessor() {
        System.out.println("=== Dados do Professor ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Registro: "+ this.registro);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getRegistro() {
        return registro;
    }
    public void setRegistro(int registro) {
        this.registro = registro;
    }
}
