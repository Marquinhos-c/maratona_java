package orientacaoObjetos.enumeracao.test;

import orientacaoObjetos.enumeracao.dominio.Cliente;
import orientacaoObjetos.enumeracao.dominio.TipoCliente;
import orientacaoObjetos.enumeracao.dominio.TipoPagamento;

/**
 * Classe de teste para validar o uso de enums e clientes.
 * Demonstra:
 * - Criação de clientes com diferentes tipos
 * - Uso de descontos específicos para cada tipo de pagamento
 * - Conversão entre strings e enums (valueOf e método customizado)
 */
public class ClienteTest01 {
    public static void main(String[] args) {

        // Cria dois clientes com tipos de cliente e pagamento diferentes
        Cliente cliente1 = new Cliente("Marcos", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Evenlly", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        // Exibe os clientes com informações detalhadas
        System.out.println(cliente1);
        System.out.println(cliente2);

        // Testa os descontos de cada tipo de pagamento
        System.out.println(TipoPagamento.DEBITO.descontoPagamento(100));
        System.out.println(TipoPagamento.CREDITO.descontoPagamento(100));

        // Converte uma string para enum usando valueOf
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        // Converte uma string amigável para enum usando método customizado
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
