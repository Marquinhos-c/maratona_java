package orientacaoObjetos.enumeracao.dominio;

/**
 * Enumeração que representa os tipos de pagamento disponíveis.
 * Cada constante implementa seu próprio cálculo de desconto,
 * demonstrando polimorfismo dentro de enums.
 */

public enum TipoPagamento{

    //Pagamento no débito concede 10% de desconto.
    DEBITO {
        @Override
        public double descontoPagamento(double valor) {
            return valor * 0.1;
        }
    },

    // Pagamento no crédito concede 5% de desconto.
    CREDITO {
        @Override
        public double descontoPagamento(double valor) {
            return valor * 0.05;
        }
    };

    // metodo abstrato não pode ter corpo, e ele tem que ser reescrito
    public abstract double descontoPagamento(double valor);
}