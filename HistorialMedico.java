import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<String> diagnosticos;
    private List<String> tratamientos;

    public HistorialMedico() {
        this.diagnosticos = new ArrayList<>();
        this.tratamientos = new ArrayList<>();
    }

    public void agregarDiagnostico(String diagnostico) {
        diagnosticos.add(diagnostico);
    }

    public void agregarTratamiento(String tratamiento) {
        tratamientos.add(tratamiento);
    }

    public void mostrarHistorial() {
        System.out.println("Historial médico:");
        System.out.println("Diagnósticos: " + diagnosticos);
        System.out.println("Tratamientos: " + tratamientos);
    }
}
