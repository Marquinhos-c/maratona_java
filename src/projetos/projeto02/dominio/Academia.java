package projetos.projeto02.dominio;

public class Academia {
    private static String nome;
    private static String endereco;
    private static String horarioFuncionamento;

    public Academia(String nome, String endereco, String horarioFuncionamento) {
        Academia.nome = nome;
        Academia.endereco = endereco;
        Academia.horarioFuncionamento = horarioFuncionamento;
    }

    // Método estático para informações institucionais
    public static void dadosAcademia() {
        System.out.println("===== Informações da Academia =====");
        System.out.println("Nome: " + nome );
        System.out.println("Missão: Promover saúde e bem-estar através da atividade física.");
        System.out.println("Serviços: Musculação, CrossFit, Yoga, Personal Trainer");
        System.out.println("Endereço: " + endereco);
        System.out.println("Contato: (11) 99999-9999");
        System.out.println("Horarios: " + horarioFuncionamento);
        System.out.println("===================================");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }
    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }
}
