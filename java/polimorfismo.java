import java.util.ArrayList;
import java.util.Scanner;

class Vehiculo {
    String marca;

    public Vehiculo (String marca) {
        this.marca = marca;
    }

    void mostrarInfo () {
        System.out.printf("Vehículo de marca: %s", marca);
    }
}

class Auto extends Vehiculo {
    int puertas;

    public Auto (String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }

    @Override
    void mostrarInfo () {
        System.out.printf("Auto %s, Puertas: %d\n", marca, puertas);
    }
}

class Moto extends Vehiculo {
    int cilindraje;

    public Moto (String marca, int cilindraje) {
        super(marca);
        this.cilindraje = cilindraje;
    }

    @Override
    void mostrarInfo () {
        System.out.printf("Moto %s, Cilindraje: %dcc\n", marca, cilindraje);
    }
}

public class polimorfismo {
    public static void main (String args []) {
        Scanner datos = new Scanner (System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        System.out.print("Cuántos vehículos desea ingresar?\n> ");
        int n = datos.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Tipo del vehículo #" + (i+1) + "? (1 = Auto, 2 = Moto)\n> ");
            int tipo = datos.nextInt();
            datos.nextLine();

            if (tipo == 1) {
                System.out.print("Marca: ");
                String marca = datos.nextLine();
                System.out.print("Número de puertas: ");
                int puertas = datos.nextInt();
                vehiculos.add(new Auto(marca, puertas));
            } else {
                System.out.print("Marca: ");
                String marca = datos.nextLine();
                System.out.print("Cilindraje: ");
                int cilindraje = datos.nextInt();
                vehiculos.add(new Moto(marca, cilindraje));
            }
        }

        datos.close();

        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }
}