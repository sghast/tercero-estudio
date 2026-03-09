import javax.swing.JOptionPane;

public class cambioDePosicionVariables {
    public static void main (String args []) {
        String variableA = JOptionPane.showInputDialog("VARIABLE A");
        String variableB = JOptionPane.showInputDialog("VARIABLE B");

        JOptionPane.showMessageDialog(null, "A: " + variableA + "\nB: " + variableB, 
        "VARIABLES ORIGINALES", JOptionPane.DEFAULT_OPTION);
        
        cambioVariable(variableA, variableB);
    }

    public static void cambioVariable (String variableA, String variableB) {
        String cambio;
        cambio = variableA;
        variableA = variableB;
        variableB = cambio;

        JOptionPane.showMessageDialog(null, "A: " + variableA + "\nB: " + variableB, 
        "NUEVAS VARIABLES (CAMBIO)", JOptionPane.DEFAULT_OPTION);
    }
}