import javax.swing.JOptionPane;
/*
  Universidad Tecnológica de Tula-Tepeji
  Programa educativo: Tecnologías de la Información e Innovación
  2-DSM-G3
  Actividad de Evaluación
  Programador: Armando Emmanuel Gomez Almaraz
  Fecha: 10 de Febrero de 2026
  Ejercicio: Simula un cajero automático con saldo inicial de $1000.
             Permite consultar saldo, depositar, retirar y salir.
*/
public class CajeroAutomatico {

    public static void main(String[] args) {

        // Se declara el saldo inicial del cajero
        double saldo = 1000;

        // Variable para almacenar la opción del menú
        int opcion = 0;

        // Ciclo principal del cajero, se ejecuta hasta que el usuario elija salir
        while (opcion != 4) {

            // Se muestra el menú de opciones
            opcion = Integer.parseInt(
                JOptionPane.showInputDialog("CAJERO AUTOMÁTICO\n\n" +
                    "1. Consultar saldo\n" +
                    "2. Depositar\n" +
                    "3. Retirar\n" +
                    "4. Salir\n\n" +
                    "Seleccione una opción:"));

            // Se evalúa la opción seleccionada
            switch (opcion) {

                case 1:
                    // Opción para consultar el saldo actual
                    JOptionPane.showMessageDialog(null,"Su saldo actual es: $" + saldo);
                    break;

                case 2:
                    // Opción para depositar dinero
                    double deposito;

                    // Validación para que el depósito sea mayor a 0
                    do {
                        deposito = Double.parseDouble(
                            JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    } while (deposito <= 0);

                    saldo += deposito;

                    JOptionPane.showMessageDialog(null,"Depósito realizado con éxito.\nNuevo saldo: $" + saldo);
                    break;

                case 3:
                    // Opción para retirar dinero
                    double retiro;

                    // Validación para que el retiro sea mayor a 0 y no exceda el saldo
                    do {
                        retiro = Double.parseDouble(
                            JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                    } while (retiro <= 0 || retiro > saldo);

                    saldo -= retiro;

                    JOptionPane.showMessageDialog(null,"Retiro realizado con éxito.\nNuevo saldo: $" + saldo);
                    break;

                case 4:
                    // Opción para salir del programa
                    JOptionPane.showMessageDialog(null,"Gracias por utilizar el cajero automático.");
                    break;

                default:
                    // Mensaje para opciones inválidas
                    JOptionPane.showMessageDialog(null,"Opción no válida. Intente nuevamente.");
            }
        }
    }
}
