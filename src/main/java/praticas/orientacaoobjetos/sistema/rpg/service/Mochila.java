package praticas.orientacaoobjetos.sistema.rpg.service;

import praticas.orientacaoobjetos.sistema.rpg.dominio.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Mochila<T extends Item> {

    private final List<T> items = new ArrayList<>();

    public void adicionar(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }
        items.add(item);
    }

    public Optional<T> buscarPeloNome(String nome) {

        if (nome == null) {
            return Optional.empty();
        }

        return items.stream()
                .filter(i -> i.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }

    public void imprimirItensQuebrados() {
        items.stream()
                .filter(i -> i.getQualidade() < 20)
                .map(Item::getNome)
                .forEach(System.out::println);
    }

    public void somarValorDaCarga() {
        double soma = items.stream()
                .mapToDouble(Item::getPreco)
                .sum();
        System.out.println(soma);
    }

    public void itemMaisCaro() {
        Item itemsMaisValioso = items.stream()
                .max(Comparator.comparing(Item::getPreco))
                .orElseThrow(() -> new RuntimeException("Mochila Vazia!"));
        System.out.println("Item mais valioso: "  + itemsMaisValioso.getNome());
    }
}
