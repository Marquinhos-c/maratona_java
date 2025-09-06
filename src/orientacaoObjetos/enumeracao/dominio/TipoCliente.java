package orientacaoObjetos.enumeracao.dominio;

/**
 * Enumeração que representa os tipos de cliente.
 * Cada tipo tem um valor numérico e um nome amigável
 * para relatórios.
 */

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String nomeRelatorio;

    // Construtor privado (implícito nos enums),
    // usado para inicializar as constantes com atributos extras.
    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    // Método estático para buscar um TipoCliente a partir do nome de relatório.
    // Caso não encontre, retorna null.
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) { // // values() retorna todas as constantes do enum
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }
    public  String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
