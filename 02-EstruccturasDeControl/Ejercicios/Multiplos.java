import javax.swing.JOptionPane;
/*
  Universidad Tecnológica de Tula-Tepeji
  Programa educativo: Tecnologías de la Información e Innovación
  2-DSM-G3
  Actividad de Evaluación
  Programador: Armando Emmanuel Gomez Almaraz
  Fecha: 10 de Febrero de 2026
  Ejercicio: Solicita un número entero n y muestra todos sus múltiplos entre 1 y 100.
*/
public class Multiplos {

    public static void main(String[] args) {
        // Declaración de variables para el número, el múltiplo actual y el resultado a mostrar
        int n;
        int multiplo = 1;
        String resultado = "";

        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));
        // Ciclo para encontrar y acumular los múltiplos de n entre 1 y 100
        while (multiplo <= 100) {
            if (multiplo % n == 0) {
                resultado += multiplo + " ";
            }
            multiplo++;
        }
        JOptionPane.showMessageDialog(null,"Múltiplos de " + n + " entre 1 y 100:\n" + resultado);
    }
}
