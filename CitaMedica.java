import java.time.LocalDate;

public class CitaMedica {
    private LocalDate fecha;
    private Paciente paciente;
    private Medico medico;

    public CitaMedica(LocalDate fecha, Paciente paciente, Medico medico) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }
  
    public LocalDate getFecha() {
        return fecha;
    }



    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }



    public Paciente getPaciente() {
        return paciente;
    }



    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }



    public Medico getMedico() {
        return medico;
    }



    public void setMedico(Medico medico) {
        this.medico = medico;
    }



    public void agendarCita() {
        System.out.println("Cita agendada con " + medico + " para el paciente " + paciente + " en la fecha " + fecha);
    }

    public void verCita() {
        System.out.println("Cita médica: " + fecha);
        System.out.println("Paciente: " + paciente);
        System.out.println("Médico: " + medico);
    }
}
