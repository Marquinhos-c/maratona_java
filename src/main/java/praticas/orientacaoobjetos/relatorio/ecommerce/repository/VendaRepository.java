package praticas.orientacaoobjetos.relatorio.ecommerce.repository;

import praticas.orientacaoobjetos.relatorio.ecommerce.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class VendaRepository {
    private List<Venda> vendas = new ArrayList<>();

    public void adicionar(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> listarTodas() {
        return vendas;
    }
}
