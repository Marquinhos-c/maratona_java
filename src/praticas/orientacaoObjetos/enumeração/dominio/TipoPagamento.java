package praticas.orientacaoObjetos.enumeração.dominio;
/**
 * Representa o tipo de pagamento utilizado no pedido.
 * Cada tipo define sua própria regra de desconto.
 */
public enum TipoPagamento {
    PIX {
        @Override
        public double calcularValorFinal(double valorPedido) {
            return valorPedido - (valorPedido* 0.1);
        }
    },
    CREDITO{
        @Override
        public double calcularValorFinal(double valorPedido) {
            return valorPedido;
        }
    }, DEBITO {
        @Override
        public double calcularValorFinal(double valorPedido) {
            return valorPedido - (valorPedido * 0.05);
        }
    };

    /**
     * Método abstrato que cada constante deve implementar,
     * definindo a regra de cálculo do valor final com desconto.
     *
     * @param valorPedido valor bruto do pedido
     * @return valor final do pedido com desconto aplicado
     */
    public abstract double calcularValorFinal(double valorPedido);
}
