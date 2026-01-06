package praticas.orientacaoobjetos.relatorio.ecommerce.repository;


import praticas.orientacaoobjetos.relatorio.ecommerce.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtos.stream()
                .filter(produto -> produto.getId().equals(id))
                .findFirst();


    }

    public List<Produto> listarTodos() {
        return produtos;
    }
}
