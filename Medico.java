import java.util.List;

public class Medico {
    private String nombre;
    private String especialidad;
    private List<String> horariosDisponibles;

    public Medico(String nombre, String especialidad, List<String> horariosDisponibles) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horariosDisponibles = horariosDisponibles;
    }
    
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getEspecialidad() {
        return especialidad;
    }



    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }



    public List<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }



    public void setHorariosDisponibles(List<String> horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }



    @Override
    public String toString() {
        return "Dr. " + nombre + " (" + especialidad + ")";
    }

    public void registrarMedico() {
        System.out.println("Médico registrado: " + this);
    }
}
