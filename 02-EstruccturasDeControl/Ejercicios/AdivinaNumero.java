import javax.swing.JOptionPane;
// random sirve para generar un número aleatorio
import java.util.Random;
/*
  Universidad Tecnológica de Tula-Tepeji
  Programa educativo: Tecnologías de la Información e Innovación
  2-DSM-G3
  Actividad de Evaluación
  Programador: Armando Emmanuel Gomez Almaraz
  Fecha: 10 de Febrero de 2026
  Ejercicio: Genera un número aleatorio entre 1 y 50 y permite al usuario
             adivinarlo, indicando si es mayor o menor en cada intento.
*/
public class AdivinaNumero {

    public static void main(String[] args) {
        // random para generar un número aleatorio entre 1 y 50
        Random random = new Random();
        int numeroSecreto = random.nextInt(50) + 1; // Genera número entre 1 y 50
        int intento = 0;
        int contadorIntentos = 0;
        // while para permitir al usuario adivinar el número hasta que lo logre
        // la condicion es que el intento no sea igual al número secreto
        while (intento != numeroSecreto) {

            intento = Integer.parseInt(
                JOptionPane.showInputDialog("Adivina el número (1 - 50):"));

            contadorIntentos++;
            // Validación para asegurar que el número ingresado esté dentro del rango permitido
            if (intento < 1 || intento > 50) {
                JOptionPane.showMessageDialog(null,"El número debe estar entre 1 y 50.");
            }
            else if (intento < numeroSecreto) {
                JOptionPane.showMessageDialog(null,"El número secreto es mayor.");
            }
            else if (intento > numeroSecreto) {
                JOptionPane.showMessageDialog(null,"El número secreto es menor.");
            }
        }

        JOptionPane.showMessageDialog(null,"Correcto. Adivinaste en " + contadorIntentos + " intentos."
        );
    }
}
