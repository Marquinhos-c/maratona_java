package praticas.optional.dominio;

public class Livro {
    private final Integer id;
    private String titulo;

    public Livro(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
}
