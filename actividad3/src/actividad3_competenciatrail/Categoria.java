package actividad3_competenciatrail;

public class Categoria {
    private String nombreCategoria;
    private double distancia;
    private String genero;

    public Categoria(String nombreCategoria, double distancia, String genero) {
        this.nombreCategoria = nombreCategoria;
        this.distancia = distancia;
        this.genero = genero;
    }

    public String getNombreCategoria() {
        return this.nombreCategoria;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public String getGenero() {
        return this.genero;
    }
}