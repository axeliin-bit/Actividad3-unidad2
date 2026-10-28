package actividad3_consultorio;

import java.time.LocalDate;

public class Paciente {
    private String nombreCompleto;
    private String telefono;
    private LocalDate fechaNacimiento;
    private String direccion;

    public Paciente(String nombreCompleto, String telefono, LocalDate fechaNacimiento, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public String getDireccion() {
        return this.direccion;
    }
}