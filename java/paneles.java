import javax.swing.JOptionPane;

public class paneles {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
        String ciudad = JOptionPane.showInputDialog("Ingresa tu ciudad");
        String carrera = JOptionPane.showInputDialog("Ingresa tu carrera");
        double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu estatura en metros"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso en kg"));

        double imc = peso / (estatura * estatura);

        String mensaje = "Nombre: " + nombre +
                         "\nEdad: " + edad +
                         "\nCiudad: " + ciudad +
                         "\nCarrera: " + carrera +
                         "\nEstatura: " + estatura + " m" +
                         "\nPeso: " + peso + " kg" +
                         "\nIMC: " + imc;

        JOptionPane.showMessageDialog(null, mensaje, "Datos registrados", JOptionPane.INFORMATION_MESSAGE);
    }
}