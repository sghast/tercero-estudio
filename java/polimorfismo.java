import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    void mostrarInfo() {
        System.out.printf("\nEmpleado: %s", nombre);
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    float bono;

    public EmpleadoTiempoCompleto(String nombre, float bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    void mostrarInfo() {
        System.out.printf("\nEmpleado TC: %s, Sueldo: $%.2f", nombre, (800 + bono));
    }
}

class EmpleadoPorHoras extends Empleado {
    float horas, pagoHora;

    public EmpleadoPorHoras(String nombre, float horas, float pagoHora) {
        super(nombre);
        this.horas = horas;
        this.pagoHora = pagoHora;
    }

    @Override
    void mostrarInfo() {
        System.out.printf("\nEmpleado PH: %s, Sueldo: $%.2f", nombre, (horas * pagoHora));
    }
}

public class polimorfismo {
    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("¿Cuántos empleados deseas ingresar?\n> ");
        int n = datos.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEmpleado #" + (i + 1) +
                             "\n1 = Tiempo completo\n2 = Por horas\n> ");
            int tipo = datos.nextInt();
            datos.nextLine();

            if (tipo == 1) {
                System.out.print("Ingrese el nombre\n> ");
                String nombre = datos.nextLine();

                System.out.print("Ingrese el bono\n> $");
                float bono = datos.nextFloat();

                empleados.add(new EmpleadoTiempoCompleto(nombre, bono));

            } else if (tipo == 2) {
                System.out.print("Ingrese el nombre\n> ");
                String nombre = datos.nextLine();

                System.out.print("Ingrese las horas\n> ");
                float horas = datos.nextFloat();

                System.out.print("Ingrese el pago por hora\n> $");
                float pagoHora = datos.nextFloat();

                empleados.add(new EmpleadoPorHoras(nombre, horas, pagoHora));

            } else {
                System.out.println("Opción inválida, intenta de nuevo.");
                i--;
            }

            datos.nextLine();
        }

        System.out.println("\n--- EMPLEADOS ---");

        int porHoras = 0, tiempoCompleto = 0;
        float totalSueldos = 0;

        for (Empleado e : empleados) {
            e.mostrarInfo();

            if (e instanceof EmpleadoTiempoCompleto) {
                tiempoCompleto++;
                totalSueldos += (800 + ((EmpleadoTiempoCompleto) e).bono);

            } else if (e instanceof EmpleadoPorHoras) {
                porHoras++;
                EmpleadoPorHoras ph = (EmpleadoPorHoras) e;
                totalSueldos += (ph.horas * ph.pagoHora);

                System.out.printf("\nGana por hora: $%.2f", ph.pagoHora);
            }
        }

        System.out.println("\n\n--- RESUMEN ---");
        System.out.println("Tiempo completo: " + tiempoCompleto);
        System.out.println("Por horas: " + porHoras);
        System.out.printf("Total sueldos: $%.2f\n", totalSueldos);

        datos.close();
    }
}