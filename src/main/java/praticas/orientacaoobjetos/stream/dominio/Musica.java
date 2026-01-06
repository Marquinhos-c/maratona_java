package praticas.orientacaoobjetos.stream.dominio;

public class Musica {
    private String titulo;
    private String artista;
    private String genero;
    private int anoLacamento;

    public Musica(String titulo, String artista, String genero, int anoLacamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.anoLacamento = anoLacamento;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", anoLacamento=" + anoLacamento +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoLacamento() {
        return anoLacamento;
    }
}
