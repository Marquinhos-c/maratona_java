package designpatterns.factory.test;

import designpatterns.factory.dominio.Country;
import designpatterns.factory.dominio.Currency;
import designpatterns.factory.dominio.CurrencyFactory;

/**
 * Classe de teste que demonstra o uso do Factory Pattern.
 *
 * O código de negócio:
 * - NÃO conhece as classes concretas (Real, UsDollar)
 * - Depende apenas da abstração {@link Currency}
 * - Delega a criação dos objetos para a {@link CurrencyFactory}
 */
public class CurrencyFactoryTest01 {
    public static void main(String[] args) {

        // Solicita à Factory uma moeda baseada no país informado
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        Currency currency2 = CurrencyFactory.newCurrency(Country.USA);

        // O código de negócio utiliza apenas o contrato (Currency)
        System.out.println(currency.getSymbol());
        System.out.println(currency2.getSymbol());
    }

    /*
    Factory Pattern — resumo

    O Factory Pattern é um padrão de projeto usado para centralizar e esconder a lógica de criação de objetos.
    Ele permite que o código de negócio não dependa de classes concretas, trabalhando apenas com abstrações (interfaces ou classes abstratas).

    A Factory decide qual implementação concreta criar com base em um critério recebido (como um enum, tipo, configuração ou parâmetro), e retorna sempre a abstração.
    Com isso, o sistema fica menos acoplado, mais organizado e mais fácil de evoluir.
     */
}
