import javax.swing.JOptionPane;

public class CompaniaSeguros {
    public static void main(String[] args) {

        int n, contador = 1;
        double sueldoBase, venta1, venta2, venta3;
        double totalVentas, comision, sueldoTotal;

        n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos vendedores hay?"));

        while (contador <= n) {

            JOptionPane.showMessageDialog(null, "Vendedor #" + contador);

            sueldoBase = Double.parseDouble(
                    JOptionPane.showInputDialog("Sueldo base:")
            );

            venta1 = Double.parseDouble(JOptionPane.showInputDialog("Venta 1:"));
            venta2 = Double.parseDouble(JOptionPane.showInputDialog("Venta 2:"));
            venta3 = Double.parseDouble(JOptionPane.showInputDialog("Venta 3:"));

            totalVentas = venta1 + venta2 + venta3;

            comision = totalVentas * 0.10;

            sueldoTotal = sueldoBase + comision;

            JOptionPane.showMessageDialog(null,
                    "Comisiones: $" + comision +
                    "\nSueldo total: $" + sueldoTotal);

            contador++;
        }
    }
}
