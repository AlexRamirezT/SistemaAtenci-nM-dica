import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Menu {
    private Scanner scanner;
    private Paciente paciente;
    private Medico medico;
    private CitaMedica citaMedica;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Sistema de Atención Médica");
        System.out.println("1. Registrar un paciente");
        System.out.println("2. Registrar un médico");
        System.out.println("3. Solicitar una cita médica");
        System.out.println("4. Ver historial médico de un paciente");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.print("Ingrese una opción (1-5): ");
    }

    public void seleccionarOpcion() {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarPaciente();
                    break;
                case 2:
                    registrarMedico();
                    break;
                case 3:
                    solicitarCita();
                    break;
                case 4:
                    verHistorialMedico();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el sistema!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        }
    }

    private void registrarPaciente() {
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la dirección del paciente: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el teléfono del paciente: ");
        String telefono = scanner.nextLine();

        paciente = new Paciente(nombre, edad, direccion, telefono);
        paciente.registrarPaciente();
    }

    private void registrarMedico() {
        System.out.print("Ingrese el nombre del médico: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la especialidad del médico: ");
        String especialidad = scanner.nextLine();

        System.out.println("Ingrese los horarios disponibles del médico (separados por coma): ");
        String horariosInput = scanner.nextLine();
        String[] horariosArray = horariosInput.split(",");
        medico = new Medico(nombre, especialidad, List.of(horariosArray));
        medico.registrarMedico();
    }

    private void solicitarCita() {
        if (paciente == null || medico == null) {
            System.out.println("Debe registrar primero un paciente y un médico.");
            return;
        }

        System.out.print("Ingrese la fecha de la cita (yyyy-MM-dd): ");
        String fechaString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaString, formatter);

        citaMedica = new CitaMedica(fecha, paciente, medico);
        citaMedica.agendarCita();
    }

    private void verHistorialMedico() {
        if (paciente != null) {
            paciente.consultarPaciente();
        } else {
            System.out.println("No se ha registrado ningún paciente.");
        }
    }
}
