import javax.swing.JOptionPane;

public class Calcomanias {
    public static void main(String[] args) {

        int n, contador = 1, digito;
        int amarilla = 0, rosa = 0, roja = 0, verde = 0, azul = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos autos entran a la ciudad?"));

        while (contador <= n) {

            digito = Integer.parseInt(
                    JOptionPane.showInputDialog("Ultimo digito de la placa del auto #" + contador)
            );

            if (digito == 1 || digito == 2) {
                amarilla++;
            }
            else if (digito == 3 || digito == 4) {
                rosa++;
            }
            else if (digito == 5 || digito == 6) {
                roja++;
            }
            else if (digito == 7 || digito == 8) {
                verde++;
            }
            else if (digito == 9 || digito == 0) {
                azul++;
            }
            else {
                JOptionPane.showMessageDialog(null, "Digito no valido");
                continue;
            }

            contador++;
        }

        JOptionPane.showMessageDialog(null,
                "Autos con calcomania:\n" +
                "Amarilla: " + amarilla +
                "\nRosa: " + rosa +
                "\nRoja: " + roja +
                "\nVerde: " + verde +
                "\nAzul: " + azul);
    }
}
 