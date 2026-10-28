package actividad3_consultorio;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainConsultorio {
    public static void main(String[] args) {
        CatalogoConsultorio catalogo = new CatalogoConsultorio();
        Paciente paciente = new Paciente("Juan Perez", "5551234567", LocalDate.of(1990, 5, 15), "Calle Falsa 123");
        Especialista especialista = new Especialista("Dra. Lopez", "Cardiologia", "CED12345", "5559876543", "lopez@med.com");

        catalogo.agregarPaciente(paciente);
        catalogo.agregarEspecialista(especialista);

        Cita cita = new Cita(LocalDate.now(), LocalTime.of(10, 30), especialista, paciente);
        catalogo.darDeAltaCita(cita);
        catalogo.cancelarCita(cita);
    }
}