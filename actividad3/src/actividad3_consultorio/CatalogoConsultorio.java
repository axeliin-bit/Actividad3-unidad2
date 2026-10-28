package actividad3_consultorio;

public class CatalogoConsultorio {
    private Especialista[] especialistas;
    private Paciente[] pacientes;
    private Cita[] citas;
    private int contadorEspecialistas;
    private int contadorPacientes;
    private int contadorCitas;

    public CatalogoConsultorio() {
        this.especialistas = new Especialista[50];
        this.pacientes = new Paciente[200];
        this.citas = new Cita[500];
        this.contadorEspecialistas = 0;
        this.contadorPacientes = 0;
        this.contadorCitas = 0;
    }

    public void agregarEspecialista(Especialista especialista) {
        if (this.contadorEspecialistas < this.especialistas.length) {
            this.especialistas[this.contadorEspecialistas] = especialista;
            this.contadorEspecialistas++;
        }
    }

    public void agregarPaciente(Paciente paciente) {
        if (this.contadorPacientes < this.pacientes.length) {
            this.pacientes[this.contadorPacientes] = paciente;
            this.contadorPacientes++;
        }
    }

    public void darDeAltaCita(Cita cita) {
        if (this.contadorCitas < this.citas.length) {
            this.citas[this.contadorCitas] = cita;
            this.contadorCitas++;
        }
    }

    public void cancelarCita(Cita cita) {
        boolean encontrado = false;
        for (int i = 0; i < this.contadorCitas && !encontrado; i++) {
            if (this.citas[i] == cita) {
                this.citas[i] = null;
                for (int j = i; j < this.contadorCitas - 1; j++) {
                    this.citas[j] = this.citas[j + 1];
                }
                this.citas[this.contadorCitas - 1] = null;
                this.contadorCitas--;
                encontrado = true;
            }
        }
    }
}