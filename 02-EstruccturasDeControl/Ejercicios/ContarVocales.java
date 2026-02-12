import javax.swing.JOptionPane;
/*
  Universidad Tecnológica de Tula-Tepeji
  Programa educativo: Tecnologías de la Información e Innovación
  2-DSM-G3
  Actividad de Evaluación
  Programador: Armando Emmanuel Gomez Almaraz
  Fecha: 10 de Febrero de 2026
  Ejercicio: Solicita una palabra y cuenta cuántas vocales contiene.
*/
public class ContarVocales {

    public static void main(String[] args) {
        // Solicita una palabra al usuario y la convierte a minúsculas para facilitar la comparación
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        palabra = palabra.toLowerCase();

        int contadorVocales = 0;
        int i = 0;
        // Ciclo para recorrer cada letra de la palabra y contar las vocales
        while (i < palabra.length()) {
            char letra = palabra.charAt(i);
            // Verifica si la letra es una vocal y, de ser así, incrementa el contador de vocales<
            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
            // Incrementa el índice para pasar a la siguiente letra
            i++;
        }

        JOptionPane.showMessageDialog(null,"La palabra \"" + palabra + "\" contiene " +contadorVocales + " vocales.");
    }
}
