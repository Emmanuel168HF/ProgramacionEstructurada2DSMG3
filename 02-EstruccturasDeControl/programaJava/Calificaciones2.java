import javax.swing.JOptionPane;

public class Calificaciones2 {
    public static void main(String[] args) {
        // Se ingresan calificaciones y se inicialisan en 0
        float calif1 ;
        float calif2 ;
        float calif3 ;
        // Se incresan los valores a las variables usando JOptionPane
        calif1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la calificacion 1"));
        calif2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la calificacion 2"));
        calif3 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la calificacion 3"));
        // Se valida que las calificaciones esten entre 0 y 10
        if ((calif1 >= 0 && calif1 <= 10) && (calif2 >= 0 && calif2 <= 10) && (calif3 >= 0 && calif3 <= 10)) {
            double promedio = (calif1 + calif2 + calif3) / 3.0;

            if (promedio >= 7.0) {
                JOptionPane.showMessageDialog(null, "Aprobado. Promedio: " + promedio);
            } else {
                JOptionPane.showMessageDialog(null, "Reprobado. Promedio: " + promedio);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Calificaciones invalidas. Deben estar entre 0 y 10.");
        }


    }
}
