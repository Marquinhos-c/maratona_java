package praticas.orientacaoobjetos.relatorio.ecommerce.app;

import praticas.orientacaoobjetos.relatorio.ecommerce.model.*;
import praticas.orientacaoobjetos.relatorio.ecommerce.repository.ProdutoRepository;
import praticas.orientacaoobjetos.relatorio.ecommerce.repository.VendaRepository;
import praticas.orientacaoobjetos.relatorio.ecommerce.service.RelatorioService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProdutoRepository produtoRepository = new ProdutoRepository();
        VendaRepository vendaRepository = new VendaRepository();

        Cliente cliente = new Cliente(1L, "Marcos","marcos@gmail.com");
        Cliente cliente2 = new Cliente(2L, "Evenlly","evenlly@gmail.com");


        Produto notebook = new ProdutoFisico(1L, "Notebook",3500, "Eletrônicos");
        Produto mouse = new ProdutoFisico(2L, "Mouse", 150, "Eletrônicos");
        Produto teclado = new ProdutoFisico(3L, "Teclado", 200, "Eletrônicos");

        produtoRepository.adicionar(teclado);


        Venda venda = new Venda(
                1L,
                cliente,
                List.of(notebook, mouse),
                LocalDate.now(),
                StatusVenda.EFETIVADA
        );
        Venda venda1 = new Venda(
                2L,
                cliente2,
                List.of(teclado),
                LocalDate.now(),
                StatusVenda.EFETIVADA
        );
        vendaRepository.adicionar(venda1);

        RelatorioService service = new RelatorioService();

        System.out.println(service.emailsClientesEfetivados(List.of(venda, venda1)));
        System.out.println(service.faturamentoTotal(List.of(venda, venda1)));
        System.out.println(service.quantidadeVendidaPorProduto(List.of(venda, venda1)));
        System.out.println(service.estatisticasPrecoProdutos(List.of(venda, venda1)));

        produtoRepository.buscarPorId(1L);
    }
}
