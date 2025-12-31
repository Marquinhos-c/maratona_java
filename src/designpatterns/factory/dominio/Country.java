package designpatterns.factory.dominio;

/**
 * Enum que representa o critério de decisão
 * para a criação das moedas.
 *
 * Ele é usado pela Factory para decidir
 * qual implementação de {@link Currency} criar.
 */
public enum Country {
    BRAZIL, USA
}
