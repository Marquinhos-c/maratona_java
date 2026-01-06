package praticas.orientacaoobjetos.relatorio.ecommerce.service;


import praticas.orientacaoobjetos.relatorio.ecommerce.model.Produto;
import praticas.orientacaoobjetos.relatorio.ecommerce.model.StatusVenda;
import praticas.orientacaoobjetos.relatorio.ecommerce.model.Venda;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RelatorioService {
    public List<String> emailsClientesEfetivados(List<Venda> vendas) {
        return vendas.stream()
                .filter(v -> v.getStatus() == StatusVenda.EFETIVADA)
                .flatMap(v -> v.getProdutos().stream()
                        .filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos"))
                        .map(p -> v.getCliente().getEmail()))
                .distinct()
                .toList();
    }

    public double faturamentoTotal(List<Venda> vendas) {
        return vendas.stream()
                .flatMap(v -> v.getProdutos().stream())
                .map(Produto::getPreco)
                .reduce(0.0, Double::sum);
    }

    public Map<String, Long> quantidadeVendidaPorProduto(List<Venda> vendas) {
        return vendas.stream()
                .flatMap(v -> v.getProdutos().stream())
                .collect(Collectors.groupingBy(
                        Produto::getNome,
                        Collectors.counting()
                ));
    }

    public DoubleSummaryStatistics estatisticasPrecoProdutos(List<Venda> vendas) {
        return vendas.stream()
                .flatMap(v -> v.getProdutos().stream())
                .collect(Collectors.summarizingDouble(Produto::getPreco));
    }
}
