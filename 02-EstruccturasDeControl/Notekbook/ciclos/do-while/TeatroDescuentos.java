import javax.swing.JOptionPane;

public class TeatroDescuentos {
    public static void main(String[] args) {

        double precioBoleto;
        int edad;

        double desc1 = 0, desc2 = 0, desc3 = 0, desc4 = 0, desc5 = 0;

        precioBoleto = Double.parseDouble(
                JOptionPane.showInputDialog("Precio único del boleto:")
        );

        do {
            edad = Integer.parseInt(
                    JOptionPane.showInputDialog("Edad del cliente (0 para terminar):")
            );

            if (edad == 0) break;

            if (edad < 5) {
                JOptionPane.showMessageDialog(null, "Niños menores de 5 años no pueden entrar.");
            }
            else if (edad <= 14) {
                desc1 = desc1 + (precioBoleto * 0.35);
            }
            else if (edad <= 19) {
                desc2 = desc2 + (precioBoleto * 0.25);
            }
            else if (edad <= 45) {
                desc3 = desc3 + (precioBoleto * 0.10);
            }
            else if (edad <= 65) {
                desc4 = desc4 + (precioBoleto * 0.25);
            }
            else {
                desc5 = desc5 + (precioBoleto * 0.35);
            }

        } while (true);

        JOptionPane.showMessageDialog(null,
                "Dinero que el teatro dejó de percibir:\n\n" +
                "Categoría 1 (5-14): $" + desc1 +
                "\nCategoría 2 (15-19): $" + desc2 +
                "\nCategoría 3 (20-45): $" + desc3 +
                "\nCategoría 4 (46-65): $" + desc4 +
                "\nCategoría 5 (66+): $" + desc5);
    }
}
