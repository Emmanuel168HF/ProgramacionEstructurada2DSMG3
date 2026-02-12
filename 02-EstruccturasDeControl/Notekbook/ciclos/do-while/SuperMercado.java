import javax.swing.JOptionPane;

public class SuperMercado {
    public static void main(String[] args) {

        double precio, subtotal, total = 0;
        int cantidad;
        String resp;

        do {
            // Pedir precio
            precio = Double.parseDouble(
                    JOptionPane.showInputDialog("Precio del artículo:")
            );

            // Pedir cantidad
            cantidad = Integer.parseInt(
                    JOptionPane.showInputDialog("Cantidad de artículos:")
            );

            // Calcular gasto del artículo
            subtotal = precio * cantidad;

            // Acumular al total
            total = total + subtotal;

            JOptionPane.showMessageDialog(null,
                    "Gasto en este artículo: $" + subtotal +
                    "\nTotal acumulado: $" + total);

            // Preguntar si sigue comprando
            resp = JOptionPane.showInputDialog("¿Agregar otro artículo? (si/no)");

        } while (resp.equals("si"));  // Se repite solo si escribe "si"

        JOptionPane.showMessageDialog(null, "Total de la compra: $" + total);
    }
}
