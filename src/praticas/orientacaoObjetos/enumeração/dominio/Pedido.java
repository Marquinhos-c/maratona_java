package praticas.orientacaoObjetos.enumeração.dominio;
/**
 * Representa um pedido realizado por um cliente.
 * Contém informações sobre o tipo de cliente, forma de pagamento,
 * status atual do pedido e valor total.
 */
public class Pedido {
    private final TipoCliente tipoCliente;
    private final TipoPagamento tipoPagamento;
    private StatusPedido statusPedido;
    private double valorPedido;


    /**
     * Construtor do Pedido.

     * @param tipoCliente   tipo de cliente (Pessoa Física ou Jurídica)
     * @param tipoPagamento forma de pagamento (PIX, Crédito, Débito)
     * @param statusPedido  status inicial do pedido
     * @param valorPedido   valor bruto do pedido
     */
    public Pedido(TipoCliente tipoCliente, TipoPagamento tipoPagamento, StatusPedido statusPedido, double valorPedido) {
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.statusPedido = statusPedido;
        this.valorPedido = valorPedido;
    }

    /**
     * Atualiza o status do pedido.
     *
     * @param novoStatus novo status a ser atribuído
     */
    public void atualizarStatus(StatusPedido novoStatus) {
        this.statusPedido = novoStatus;
    }

    /**
     * Calcula o valor final do pedido aplicando o desconto
     * de acordo com o tipo de pagamento escolhido.
     *
     * @return valor final com desconto
     */
    public double calcularValorFinal() {
        return tipoPagamento.calcularValorFinal(valorPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                " valorPedido=" + valorPedido +
                ", statusPedido=" + statusPedido.getDescricao() +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }
    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }
}