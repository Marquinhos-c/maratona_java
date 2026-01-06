package designpatterns.factory.dominio;
/**
 * Abstração que representa uma moeda.
 *
 * Define um contrato comum para todas as moedas do sistema.
 * O código de negócio deve depender desta interface,
 * e NÃO das implementações concretas.
 */
public interface Currency {
    /**
     * Retorna o símbolo da moeda.
     *
     * @return símbolo monetário (ex: R$, $)
     */
    String getSymbol();
}

/**
 * Implementação concreta da moeda Real (Brasil).
 *
 * Esta classe representa um detalhe de implementação
 * e deve ser conhecida apenas pela Factory.
 */
class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}
