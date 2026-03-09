import javax.swing.JOptionPane;

public class paneles {
    public static void main (String args []) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));

        JOptionPane.showMessageDialog(null, "Tu nombre es " + nombre + ", tienes " + edad + " años", 
        "datos", JOptionPane.DEFAULT_OPTION);
    }
}

// JOptionPane pasa avalores string, por lo que se hace la conversión con Integer.parseInt()