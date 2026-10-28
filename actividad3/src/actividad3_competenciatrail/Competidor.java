package actividad3_competenciatrail;

import java.time.LocalTime;

public class Competidor {
    private String nombreCompleto;
    private int numeroCorredor;
    private String generoCorredor;
    private Categoria categoria;
    private boolean culmino;
    private LocalTime tiempoRealizado;
    private boolean top10;

    public Competidor(String nombreCompleto, String generoCorredor, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.generoCorredor = generoCorredor;
        this.categoria = categoria;
        this.culmino = false;
        this.top10 = false;
    }

    public void asignarNumero(int numero) {
        this.numeroCorredor = numero;
    }

    public void registrarParticipacion(boolean culmino, LocalTime tiempoRealizado, boolean top10) {
        this.culmino = culmino;
        if (culmino) {
            this.tiempoRealizado = tiempoRealizado;
            this.top10 = top10;
        }
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public int getNumeroCorredor() {
        return this.numeroCorredor;
    }

    public String getGeneroCorredor() {
        return this.generoCorredor;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public boolean isCulmino() {
        return this.culmino;
    }

    public LocalTime getTiempoRealizado() {
        return this.tiempoRealizado;
    }

    public boolean isTop10() {
        return this.top10;
    }
}