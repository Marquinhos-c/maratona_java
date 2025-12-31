package designpatterns.datatransferobjetct.dominio;

import designpatterns.factory.dominio.Country;
import designpatterns.factory.dominio.Currency;
/**
 * Data Transfer Object (DTO).
 *
 * Objetivo:
 * Transportar dados entre camadas do sistema
 * (ex: Service → Controller, Service → API, etc.)
 *
 * Características do DTO:
 * - Não contém regra de negócio
 * - Apenas dados
 * - Estrutura simples
 */
public class ReportDto {
    /**
     * Nome do avião.
     */
    private String aircraftName;
    /**
     * País relacionado ao relatório.
     */
    private Country country;
    /**
     * Moeda associada ao país.
     */
    private Currency currency;
    /**
     * Nome da pessoa relacionada ao relatório.
     */
    private String personName;


    /**
     * Builder para criação do ReportDto.
     *
     * Motivo do uso do Builder:
     * - Muitos atributos
     * - Evita construtores gigantes
     * - Código mais legível e fluente
     * - Facilita atributos opcionais
     */
    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personName;

        /**
         * Construtor privado do Builder.
         *
         * Impede criação direta do Builder fora do método builder().
         */
        private ReportDtoBuilder() {
        }

        /**
         * Método de entrada do Builder.
         *
         * @return nova instância do Builder
         */
        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        /**
         * Define o nome do avião.
         */
        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }
        /**
         * Define o país do relatório.
         */
        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }
        /**
         * Define a moeda do relatório.
         */
        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }
        /**
         * Define o nome da pessoa relacionada.
         */
        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        /**
         * Cria a instância final do ReportDto.
         *
         * @return ReportDto totalmente construído
         */
        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.currency = this.currency;
            reportDto.personName = this.personName;
            reportDto.country = this.country;
            reportDto.aircraftName = this.aircraftName;
            return reportDto;
        }
    }

    /**
     * Representação textual do DTO.
     *
     * Útil para logs e testes.
     */
    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }
}
