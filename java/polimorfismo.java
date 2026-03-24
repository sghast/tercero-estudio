import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    String nombre;
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    void calcularSueldo() {
        System.out.println("Empleado: " + nombre + ", Sueldo base");
    }
}

class EmpleadoTiempoCompleto extends Empleado {
    int bono;

    public EmpleadoTiempoCompleto(String nombre, int bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    void calcularSueldo() {
        System.out.println("Empleado: " + nombre + 
                           ", Sueldo con bono: " + (800 + bono));
    }
}

public class polimorfismo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.print("¿Cuántos empleados deseas ingresar? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Tipo (1 = Normal, 2 = Tiempo Completo): ");
            int tipo = sc.nextInt();

            if (tipo == 2) {
                System.out.print("Bono: ");
                int bono = sc.nextInt();
                empleados.add(new EmpleadoTiempoCompleto(nombre, bono));
            } else {
                empleados.add(new Empleado(nombre));
            }

            sc.nextLine();
        }

        System.out.println("\n--- SUELDOS ---");
        for (Empleado e : empleados) {
            e.calcularSueldo();
        }

        sc.close();
    }
}