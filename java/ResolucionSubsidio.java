import java.util.Scanner;

class SolicitanteSubsidio {
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.viveEnEcuador = viveEnEcuador;
    }

    public SolicitanteSubsidio(String nombreCompleto, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.ingresosMensuales = ingresosMensuales;
        this.cantidadVehiculos = cantidadVehiculos;
        this.viveEnEcuador = viveEnEcuador;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470)
            this.ingresosMensuales = ingresosMensuales;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos > 0)
            this.cantidadVehiculos = cantidadVehiculos;
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    public boolean subsidioAprobado() {
        return (ingresosMensuales <= 1200 && cantidadVehiculos <= 1 && viveEnEcuador);
    }

    public String generarResultado() {
        if (subsidioAprobado()) {
            return "APROBADO";
        } else {
            String mensaje = "";
            if (ingresosMensuales > 1200)
                mensaje += "\t- Los ingresos mensuales superan los $1200\n";
            if (cantidadVehiculos > 1)
                mensaje += "\t- Registra más de un vehículo\n";
            if (!viveEnEcuador)
                mensaje += "\t- No registra residencia ECUATORIANA\n";

            return "RECHAZADO, motivos:\n" + mensaje;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto +
               "\nCédula: " + cedula +
               "\nIngresos mensuales: $" + ingresosMensuales +
               "\nCantidad de vehículos: " + cantidadVehiculos +
               "\nVive en Ecuador: " + (viveEnEcuador ? "Sí" : "No");
    }

    public static void mostrarReglasSubsidio() {
        System.out.println("--- REQUISITOS PARA APROBACIÓN DE SUBSIDIO ---\n" +
                "1. Tener ingresos mensuales menores o iguales a $1,200\n" +
                "2. No poseer más de un vehículo registrado\n" +
                "3. Tener residencia en Ecuador\n");
    }

    public double calcularGalonesNecesarios(double km) {
        return km/40.0;
    }

    public double calcularGalonesNecesarios(double km, double rendimiento) {
        return km/rendimiento;
    }
}

public class ResolucionSubsidio {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombreCompleto = datos.nextLine();

        System.out.print("Cédula: ");
        String cedula = datos.nextLine();

        System.out.print("Ingresos mensuales: $");
        double ingresosMensuales = datos.nextDouble();
        datos.nextLine(); // limpiar buffer

        System.out.print("Cantidad de vehículos: ");
        int cantidadVehiculos = datos.nextInt();
        datos.nextLine();

        System.out.print("¿Vive en Ecuador? (1 = Sí, 2 = No)\n> ");
        int vive = datos.nextInt();

        boolean viveEnEcuador = (vive == 1);

        datos.close();

        SolicitanteSubsidio solicitante =
                new SolicitanteSubsidio(nombreCompleto, cedula, ingresosMensuales, cantidadVehiculos, viveEnEcuador);

        System.out.println("\n=== DATOS DEL SOLICITANTE ===");
        System.out.println(solicitante);

        System.out.println("\n=== RESULTADO DE SUBSIDIO ===");
        System.out.println("Solicitante: " + nombreCompleto);
        System.out.println("Estado: " + solicitante.generarResultado());
    }
}