package projetos.projeto01.dominio;

public class Cliente {
    private String nome;
    private String empresa;
    private Projeto[] projetos;

    public Cliente(String nome, String empresa) {
        this.nome = nome;
        this.empresa = empresa;
    }
    public Cliente(String nome, String empresa, Projeto[] projetos) {
        this(nome, empresa);
        this.projetos = projetos;
    }

    public void mostrarProjetos() {
        System.out.println("Projetos do cliente " + nome + ": ");
        if (projetos == null || projetos.length == 0) {
            System.out.println("Nenhum projeto encontrado ");
        }else {
            for (Projeto projeto : projetos) {
                if (projeto != null) {
                    System.out.println("- " + projeto.getNome());
                }
            }
        }
    }
    public void mostrarDadosCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("Empresa: " + empresa);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Projeto[] getProjetos() {
        return projetos;
    }
    public void setProjetos(Projeto[] projetos) {
        this.projetos = projetos;
    }
}
