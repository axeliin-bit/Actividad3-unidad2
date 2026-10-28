package actividad3_consultorio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private LocalDate fecha;
    private LocalTime hora;
    private Especialista especialistaAtiende;
    private Paciente pacienteAtendido;

    public Cita(LocalDate fecha, LocalTime hora, Especialista especialistaAtiende, Paciente pacienteAtendido) {
        this.fecha = fecha;
        this.hora = hora;
        this.especialistaAtiende = especialistaAtiende;
        this.pacienteAtendido = pacienteAtendido;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public LocalTime getHora() {
        return this.hora;
    }

    public Especialista getEspecialistaAtiende() {
        return this.especialistaAtiende;
    }

    public Paciente getPacienteAtendido() {
        return this.pacienteAtendido;
    }
}