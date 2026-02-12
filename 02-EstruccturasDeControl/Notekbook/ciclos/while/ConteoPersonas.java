import javax.swing.JOptionPane;

public class ConteoPersonas {
    public static void main(String[] args) {

        int n, contador = 1;
        int hombres = 0, mujeres = 0;
        String sexo;

        n = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas hay en el grupo?"));

        while (contador <= n) {

            sexo = JOptionPane.showInputDialog(
                    "Persona #" + contador + "\nEscriba H para hombre o M para mujer:"
            );

            if (sexo.equals("H") || sexo.equals("h")) {
                hombres++;
            } else if (sexo.equals("M") || sexo.equals("m")) {
                mujeres++;
            } else {
                JOptionPane.showMessageDialog(null, "Dato no valido");
                continue; // no avanza hasta que sea correcto
            }

            contador++;
        }

        JOptionPane.showMessageDialog(null,
                "Total de hombres: " + hombres +
                "\nTotal de mujeres: " + mujeres);
    }
}
