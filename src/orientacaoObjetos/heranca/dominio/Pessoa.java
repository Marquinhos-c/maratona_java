package orientacaoObjetos.heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Dentro do construtor de pessoa");
    }
    public Pessoa(String nome, String cpf, Endereco endereco) {
        this(nome);
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        if (this.endereco != null) {
            System.out.println("Endereço: " + this.endereco.getRua() + "  " + this.endereco.getCep());
        } else {
            System.out.println("Endereço: não informado!");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
