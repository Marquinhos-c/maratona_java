package praticas.orientacaoObjetos.enumeração.dominio;
/**
 * Representa os diferentes estados de um pedido.
 */
public enum StatusPedido {
    AGUARDANDO_PAGAMENTO("Aguardando Pagamento"),
    PROCESSANDO("Processando"),
    ENVIADO ("Enviado"),
    ENTREGUE("Entregue"),
    CANCELADO ("Cancelado");

    private final String descricao;

    StatusPedido (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
