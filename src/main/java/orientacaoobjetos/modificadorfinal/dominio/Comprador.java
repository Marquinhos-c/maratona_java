package orientacaoobjetos.modificadorfinal.dominio;

public class Comprador {
    private String nome;

    // Sobrescreve toString para exibir o objeto de forma legível
    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }
    // Retorna o nome do carro
    public String getNome() {
        return nome;
    }
    // Define o nome do carro
    public void setNome(String nome) {
        this.nome = nome;
    }
}
