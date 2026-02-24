import java.util.Scanner;

public class clasesyobjetos {
    public static void main (String[] args) {
        Scanner datos = new Scanner(System.in);
        class Persona {
            String nombre;
            int edad;

            void saludo() {
                System.out.printf("Hola %s, sé que tienes %d años%n", nombre, edad);
            }
        }

        Persona p1 = new Persona();
        p1.nombre = datos.nextLine();
        p1.edad = datos.nextInt();
        p1.saludo();
        datos.close();
    }
}