package orientacaoobjetos.metodos.modificacaoacesso.dominio;

public class Pessoa {

    // Atributos privados: encapsulamento que protege os dados.
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // Setter público para o atributo nome.
    // Permite modificar o nome de forma controlada.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter público para o atributo idade.
    // Inclui uma verificação de valor para manter integridade dos dados.
    public void setIdade(int idade) {
        if (idade < 0 ) {
            System.out.println("Idade inválida! ");
            return;
        }
        this.idade = idade;
    }

    // Getter público para recuperar o nome.
    public String getNome() {
        return this.nome;
    }

    // Getter público para recuperar a idade.
    public int getIdade(){
        return this.idade;
    }
}
