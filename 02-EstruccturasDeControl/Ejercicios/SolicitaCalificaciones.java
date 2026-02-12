import javax.swing.JOptionPane;
/*
  Universidad Tecnológica de Tula-Tepeji
  Programa educativo: Tecnologias de la Informacion e Innovacion
  2-DSM-G3
  Actividad de Evaluación 1
  Programador: Armando Emmanuel Gomez Almaraz
  Fecha: 10 de Febrero de 2026
  Ejercicio: Solicita 10 calificaciones entre 0 y 100. 
             Muestra el promedio, el número de aprobados y reprobados.
*/
public class SolicitaCalificaciones {    
    public static void main(String[] args) {

        int calificacion;
        int suma = 0;
        int aprobados = 0;
        int reprobados = 0;
        int contador = 1;

        // Ciclo para pedir 10 calificaciones
        while (contador <= 10) {

            // Validación de entrada
            do {
                calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación del alumno " + contador + " (0 a 100):"));
            } while (calificacion < 0 || calificacion > 100);

            suma += calificacion;

            // Aprobado o reprobado
            if (calificacion >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }

            contador++;
        }

        // Promedio con decimales
        float promedio = (float) suma / 10;

        JOptionPane.showMessageDialog(null, "Promedio de calificaciones: " + promedio);
        JOptionPane.showMessageDialog(null, "Alumnos aprobados: " + aprobados);
        JOptionPane.showMessageDialog(null, "Alumnos reprobados: " + reprobados);
    }
}
