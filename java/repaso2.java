import java.util.Scanner;

public class repaso2 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = datos.nextLine();

        int opcion = 0, numero = 0;
        do {
            System.out.println("1. Ingresar número");
            System.out.println("2. Verificar si es par o impar");
            System.out.println("3. Salir");
            opcion = datos.nextInt();
            
            if (opcion == 1) {
                System.out.print(">>> ");
                numero = datos.nextInt();
            } else if (opcion == 2) {
                if (numero == 0) {
                    System.out.println("Debes ingresar un número");
                } else if (numero%2 == 0) {
                    System.out.printf("%d es par%n", numero);
                } else {
                    System.out.printf("%d es impar%n", numero);
                }
            }
        } while (opcion != 3);

        System.out.printf("Gracias, %s, por usar el sistema", nombre);
        datos.close();
    }
}