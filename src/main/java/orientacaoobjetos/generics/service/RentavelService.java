package orientacaoobjetos.generics.service;

import java.util.List;

/**
 * Classe Genérica para serviços de aluguel.
 * * @param <T> O "Type Parameter". É um espaço reservado (placeholder).
 * Quando instanciarmos essa classe, substituiremos 'T' por um tipo real
 * (como Carro ou Barco). Onde houver 'T', o compilador lerá como esse tipo real.
 */
public class RentavelService<T> {

    // A lista não guarda 'Object', ela guarda exatamente o tipo T.
    // Se T for Carro, isso vira List<Carro>.
    private List<T> objetosDisponiveis;

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    /**
     * Método que recupera e remove o primeiro item da lista.
     * * @return Retorna um objeto do tipo T.
     * Não precisa fazer Cast (conversão), pois o Java já sabe o tipo exato.
     */
    public T buscaObjetoDisponivel() {
        System.out.println("Buscando objeto disponivel");
        // remove(0) tira o primeiro elemento da lista
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        return t;
    }

    /**
     * Método para devolver um item alugado.
     * * @param t O objeto a ser devolvido.
     * O compilador garante que você só pode passar objetos do tipo T aqui.
     */
    public void retornaObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
