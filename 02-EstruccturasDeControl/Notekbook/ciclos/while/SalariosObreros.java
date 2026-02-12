import javax.swing.JOptionPane;

public class SalariosObreros {
    public static void main(String[] args) {

        int n, contador = 1;
        double horas, salario;

        n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos obreros hay?"));

        while (contador <= n) {

            horas = Double.parseDouble(
                    JOptionPane.showInputDialog("Horas trabajadas del obrero #" + contador)
            );

            if (horas <= 40) {
                salario = horas * 20;
            } else {
                salario = (40 * 20) + ((horas - 40) * 25);
            }

            JOptionPane.showMessageDialog(null,
                    "Salario semanal del obrero #" + contador + ": $" + salario);

            contador++;
        }
    }
}
