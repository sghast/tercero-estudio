import java.util.HashMap;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        HashMap<String, String> jugadasGanadoras = new HashMap<>();
        jugadasGanadoras.put("piedra", "tijera");
        jugadasGanadoras.put("papel", "piedra");
        jugadasGanadoras.put("tijera", "papel");

        boolean ganador = false;

        while (!ganador) {

            System.out.print("[Jugador 1] Escriba su opción (piedra, papel o tijera): ");
            String jugador1 = datos.nextLine().toLowerCase();

            System.out.print("[Jugador 2] Escriba su opción (piedra, papel o tijera): ");
            String jugador2 = datos.nextLine().toLowerCase();

            if (!jugadasGanadoras.containsKey(jugador1) || 
                !jugadasGanadoras.containsKey(jugador2)) {

                System.out.println("Alguna entrada es inválida, vuelve a intentarlo");
                continue;
            }

            if (jugador1.equals(jugador2)) {
                System.out.println("¡Empate!");
                ganador = false;

            } else if (jugadasGanadoras.get(jugador1).equals(jugador2)) {
                System.out.println("¡Jugador 1 gana!");
                ganador = true;

            } else {
                System.out.println("¡Jugador 2 gana!");
                ganador = true;
            }
        }

        datos.close();
    }
}