import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        try {
            double calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 1"));
            double calif2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 2"));
            double calif3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 3"));

            double promedio = (calif1 + calif2 + calif3) / 3.0;

            if (promedio >= 7.0) {
                JOptionPane.showMessageDialog(null, "Aprobado. Promedio: " + promedio);
            } else {
                JOptionPane.showMessageDialog(null, "Reprobado. Promedio: " + promedio);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada invalida. Por favor introduce numeros.");
        }
    }
}
