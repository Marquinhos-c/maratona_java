package praticas.orientacaoobjetos.exception.dominio;

public class UsuarioEmUsoException extends Exception{
    public UsuarioEmUsoException() {
        super("Usuário ja esta em uso");
    }

    public UsuarioEmUsoException(String message) {
        super(message);
    }
}
