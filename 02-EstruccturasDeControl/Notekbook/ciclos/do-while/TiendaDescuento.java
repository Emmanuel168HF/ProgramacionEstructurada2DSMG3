import javax.swing.JOptionPane;

public class TiendaDescuento {
    public static void main(String[] args) {

        double importe, descuento, total;
        String entrada, color;

        do {
            // Pedir importe
            entrada = JOptionPane.showInputDialog("Ingrese importe (0 para cerrar tienda):");
            if (entrada == null) break;

            try {
                importe = Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Número inválido.");
                continue;
            }

            if (importe == 0) break;

            
            if (importe < 0) {
                JOptionPane.showMessageDialog(null, "El importe no puede ser negativo.");
                continue;
            }

            // Pedir color
            color = JOptionPane.showInputDialog("Color de la bolita (roja / amarilla / blanca):");
            if (color == null) break;

            color = color.trim().toLowerCase();

            switch (color) {
                case "roja":
                    descuento = importe * 0.40;
                    break;
                case "amarilla":
                    descuento = importe * 0.25;
                    break;
                case "blanca":
                    descuento = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Color no válido. Sin descuento.");
                    descuento = 0;
            }

            total = importe - descuento;

            JOptionPane.showMessageDialog(null,
                    "Subtotal: $" + importe +
                    "\nDescuento: $" + descuento +
                    "\nTotal a pagar: $" + total);

        } while (true);  // 🔁 Se repite hasta que el usuario ponga 0 o cancele

        JOptionPane.showMessageDialog(null, "La tienda ha cerrado 🛒");
    }
}
