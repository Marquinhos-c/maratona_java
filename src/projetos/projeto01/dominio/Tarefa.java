package projetos.projeto01.dominio;

public class Tarefa {
    private String descricao;
    private String status;
    private Funcionario responsavel;

    public Tarefa(String descricacao, String status, Funcionario responsavel) {
        this.descricao = descricacao;
        this.status = status;
        this.responsavel = responsavel;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status da tarefa \"" + descricao + "\" atualizado para: " + status);
    }
    public void exibirDetalhes(){
        System.out.println("Tarefa: " + descricao);
        System.out.println("Status: " + status);
        if (responsavel != null){
            System.out.println("Responsável: " + responsavel.getNome() + " (" + responsavel.getCargo() + ")");
        }else {
            System.out.println("Responsável: Nenhum responsável atribuido.");
        }
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }
}
