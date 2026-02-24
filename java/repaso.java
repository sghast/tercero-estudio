import java.util.Scanner;

public class repaso {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opcion = 0, numero = 0;

        do {
            System.out.println("1. Ingresar un número");
            System.out.println("2. Mostrar si es par o impar");
            System.out.println("0. SALIR");
            opcion = datos.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el número: ");
                numero = datos.nextInt();
            } else if (opcion == 2) {
                if (numero == 0) {
                    System.out.println("Debes ingresar un numero");
                } else if (numero%2 == 0) {
                    System.out.printf("%d es par%n", numero);
                } else {
                    System.out.printf("%d es impar%n", numero);
                }
            }
        } while (opcion != 0);
        datos.close();
    }
}