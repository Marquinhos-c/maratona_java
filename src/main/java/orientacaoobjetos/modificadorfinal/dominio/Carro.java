package orientacaoobjetos.modificadorfinal.dominio;
/*
Resumo do final
Classe final → ninguém pode herdar dela.
Método final → pode herdar, mas não pode sobrescrever.

        Variável final
            Primitivo → valor não muda.
            Objeto → referência não muda (mas atributos podem mudar).
 */

public  class Carro {
    private String nome;

    // Constante da classe: mesma para todos os carros, não pode ser alterada
    public static final double VELOCIDADE_LIMITE = 250; //  Constante da classe

    // Comprador do carro
    // Referência final: não pode apontar para outro objeto, mas atributos internos podem mudar
    public final Comprador COMPRADOR = new Comprador(); // Comprador (referência final)

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
