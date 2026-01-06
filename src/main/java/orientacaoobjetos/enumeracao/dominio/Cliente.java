package orientacaoobjetos.enumeracao.dominio;

/**
 * Classe que representa um cliente no sistema.
 * Cada cliente possui:
 * - Nome
 * - Tipo de cliente (Pessoa Física ou Jurídica)
 * - Tipo de pagamento (Débito ou Crédito)
 *
 * Essa classe demonstra como usar enumerações como atributos,
 * trazendo mais legibilidade e segurança para o código.
 */

public class Cliente {
    private String nome;
    private final TipoCliente tipoCliente;
    private final TipoPagamento tipoPagamento;

    //Construtor para inicializar o cliente.
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    // Sobrescrita do método toString para exibir informações do cliente.
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
