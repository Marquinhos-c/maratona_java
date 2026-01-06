package designpatterns.factory.dominio;

/**
 * Factory responsável por criar instâncias de {@link Currency}.
 *
 * Centraliza a lógica de criação e evita que o código de negócio
 * dependa de classes concretas como {@link Real} ou {@link UsDollar}.
 */
public class CurrencyFactory {

    /**
     * Cria uma instância de {@link Currency} com base no país informado.
     *
     * @param country critério usado para decidir qual moeda criar
     * @return uma implementação de {@link Currency}
     * @throws IllegalArgumentException se não houver moeda para o país informado
     */
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default: throw new IllegalArgumentException("No currency found for this country");
        }
    }
}