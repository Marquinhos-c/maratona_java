package orientacaoobjetos.polimorfismo.servico;
import orientacaoobjetos.polimorfismo.dominio.Produto;
import orientacaoobjetos.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    /**
     * Calcula e exibe um relatório de imposto para um determinado produto.
     * <p>
     * Este método é o principal exemplo de polimorfismo. Ele aceita qualquer
     * objeto que seja um {@link Produto} e invoca o método {@code calcularImposto}
     * correto em tempo de execução.
     * <p>
     * Também demonstra o uso de {@code instanceof} para tratar de
     * comportamentos específicos de uma subclasse.
     *
     * @param produto O produto (pode ser um Tomate, Televisao, etc.) cujo imposto será calculado.
     */
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");

        // Polimorfismo em ação: O método correto (de Tomate ou Televisao) é chamado aqui.
        double imposto = produto.calcularImposto();

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        // Verificação específica para acessar um método que SÓ EXISTE em Tomate.
        if(produto instanceof Tomate) {
            // É necessário fazer um "cast" para o tipo específico.
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }
}
