package orientacaoObjetos.enumeracao.dominio;

public enum TipoPagamento{
    DEBITO {
        @Override
        public double descontoPagamento(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double descontoPagamento(double valor) {
            return valor * 0.05;
        }
    };

    // metodo abstrato não pode ter corpo, e ele tem que ser reescrito
    public abstract double descontoPagamento(double valor);
}