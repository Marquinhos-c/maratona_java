package praticas.orientacaoobjetos.relatorio.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

public class Venda {
    private Long id;
    private Cliente cliente;
    private List<Produto> produtos;
    private LocalDate data;
    private StatusVenda status;

    public Venda(Long id, Cliente cliente, List<Produto> produtoList,LocalDate data, StatusVenda status) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtoList;
        this.data = data;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public StatusVenda getStatus() {
        return status;
    }
}
