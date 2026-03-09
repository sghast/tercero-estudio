import javax.swing.JOptionPane;

public class metodos {
    public static void main (String args []) {
        for (int i=0; i<2; i++) { 
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2"));
            JOptionPane.showMessageDialog(null, num1 + num2, "RESULTADO", JOptionPane.DEFAULT_OPTION);
        }
    }

/*
//NO SOLICITAN PARÁMETROS NI RETORNAN VALORES
    public static void sumaNumeros () {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2"));
        double suma = num1 + num2;
        JOptionPane.showMessageDialog(null, suma, "SUMA", JOptionPane.INFORMATION_MESSAGE);
    }

//NO SOLICITAN PARÁMETROS Y RETORNAN VALORES
    public static double sumaNumeros () {
        double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Numero 1"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2"));

        return num1 + num2;
    }

//SOLICITAN PARÁMETROS Y NO RETORNAN VALORES
    public static void sumaNumeros (double num1, double num2) {
        JOptionPane.showMessageDialog(null, num1 + num2, "RESULTADO", JOptionPane.DEFAULT_OPTION);
    }

//SOLICITAN PARÁMETROS Y RETORNAN VALORES
    public static double sumaNumeros (double num1, double num2) {
        return num1 + num2;
    }    
*/

}