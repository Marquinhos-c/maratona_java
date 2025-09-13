package praticas.orientacaoObjetos.enumeração.test;

import praticas.orientacaoObjetos.enumeração.dominio.Pedido;
import praticas.orientacaoObjetos.enumeração.dominio.StatusPedido;
import praticas.orientacaoObjetos.enumeração.dominio.TipoCliente;
import praticas.orientacaoObjetos.enumeração.dominio.TipoPagamento;

public class PedidoTest {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(TipoCliente.PESSOA_FISICA, TipoPagamento.PIX, StatusPedido.AGUARDANDO_PAGAMENTO, 100);
        Pedido pedido2 = new Pedido(TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO, StatusPedido.AGUARDANDO_PAGAMENTO, 250);

        // Exibindo pedidos iniciais
        System.out.println(pedido1);
        System.out.println(pedido2);

        // Evoluindo status do pedido1
        pedido1.atualizarStatus(StatusPedido.PROCESSANDO);
        System.out.println("\nPedido 1 atualizado: " + pedido1);

        pedido1.atualizarStatus(StatusPedido.ENVIADO);
        System.out.println("Pedido 1 atualizado: " + pedido1);

        pedido1.atualizarStatus(StatusPedido.ENTREGUE);
        System.out.println("Pedido 1 atualizado: " + pedido1);

        double descontoPix = pedido1.getTipoPagamento().calcularValorFinal(pedido1.getValorPedido());
        double descontoCredito = pedido2.getTipoPagamento().calcularValorFinal(pedido2.getValorPedido());

        // Cálculo de valores finais com descontos
        System.out.println("\nValor do desconto PIX (R$): " + descontoPix);
        System.out.println("Valor do desconto CREDITO (R$): " + descontoCredito);
    }
}
