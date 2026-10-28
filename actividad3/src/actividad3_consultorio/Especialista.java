package actividad3_consultorio;

public class Especialista {
    private String nombreCompleto;
    private String especialidad;
    private String cedulaProfesional;
    private String telefono;
    private String email;

    public Especialista(String nombreCompleto, String especialidad, String cedulaProfesional, String telefono, String email) {
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
        this.cedulaProfesional = cedulaProfesional;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public String getCedulaProfesional() {
        return this.cedulaProfesional;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getEmail() {
        return this.email;
    }
}