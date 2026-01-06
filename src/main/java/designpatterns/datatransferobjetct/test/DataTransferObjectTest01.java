package designpatterns.datatransferobjetct.test;

import designpatterns.builder.dominio.Person;
import designpatterns.datatransferobjetct.dominio.ReportDto;
import designpatterns.factory.dominio.Country;
import designpatterns.factory.dominio.Currency;
import designpatterns.factory.dominio.CurrencyFactory;
import designpatterns.singleton.dominio.Aircraft;
/**
 * Classe de teste para demonstrar o uso do padrão DTO
 * em conjunto com outros padrões de projeto.
 *
 * Padrões envolvidos:
 * - Builder (Person, ReportDto)
 * - Factory (CurrencyFactory)
 * - DTO (ReportDto)
 *
 * Objetivo:
 * Criar um objeto simples (DTO) para transportar dados
 * vindos de diferentes objetos de domínio.
 */
public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        /**
         * Objeto de domínio Aircraft.
         * Representa uma entidade do sistema.
         */
        Aircraft aircraft = new Aircraft("777");
        /**
         * Enum que representa o país.
         * Valor simples, sem lógica.
         */
        Country country = Country.BRAZIL;
        /**
         * Criação da moeda via Factory.
         *
         * A Factory decide qual implementação de Currency
         * será retornada com base no país informado.
         */
        Currency currency = CurrencyFactory.newCurrency(country);
        /**
         * Criação de um objeto Person usando Builder.
         *
         * Builder melhora a legibilidade e evita
         * construtores longos.
         */
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Marcos")
                .lastName("Costa")
                .build();

        /**
         * Criação do DTO.
         *
         * O DTO não contém regras de negócio.
         * Ele apenas coleta dados de diferentes objetos
         * e os agrupa para transporte entre camadas.
         */
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        /**
         * Impressão do DTO.
         *
         * Normalmente, esse objeto seria:
         * - Retornado por um Service
         * - Enviado por um Controller
         * - Serializado para JSON/XML
         */
        System.out.println(reportDto);
    }
}
/*
Conexão dos padrões (fechando o ciclo)

Builder → facilita criação de objetos complexos

Factory → decide qual implementação usar

Singleton → controla instância única (em outros exemplos)

DTO → transporta dados entre camadas
 */
