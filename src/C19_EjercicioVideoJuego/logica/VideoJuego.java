package C19_EjercicioVideoJuego.logica;

public class VideoJuego {
    private int codigo;
    private String titulo;
    private String consola;
    private int numJugadores;
    private String categoría;

    public VideoJuego() {
    }

    public VideoJuego(int codigo, String titulo, String consola, int numJugadores, String categoría) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.numJugadores = numJugadores;
        this.categoría = categoría;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
}
