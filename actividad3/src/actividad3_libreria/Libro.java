package actividad3_libreria;

public class Libro {
    private String titulo;
    private String[] autores;
    private String edicion;
    private String editorial;
    private int cantidadEjemplares;
    private int anioPublicacion; // o yearPublicacion como lo tienes en tu código

    public Libro(String titulo, String[] autores, String edicion, String editorial, int cantidadEjemplares, int anioPublicacion) {
        this.titulo = titulo;
        this.autores = autores;
        this.edicion = edicion;
        this.editorial = editorial;
        this.cantidadEjemplares = cantidadEjemplares;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }
    
    public String[] getAutores() {
        return this.autores;
    }

    public String getEdicion() {
        return this.edicion;
    }

    public String getEditorial() {
        return this.editorial;
    }
    
    public int getCantidadEjemplares() {
        return this.cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }
}