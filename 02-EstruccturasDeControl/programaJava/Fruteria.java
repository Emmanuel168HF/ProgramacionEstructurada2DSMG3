import javax.swing.JOptionPane;
/*
    Universidad Tecnologica de Tula-Tepeji
    Programa educativo: Tecnologias de la Informacion e innovacion
    TSU. Desarrollo de Software Multiplataforma
    Programador: Armandoo Emmanuel Gomez Almaraz
    "Fecha de creacion: 22/01/2026"
    Descripcion: Programa que calcula el total a pagar en una fruteria
                segun el numero de kilos comprados y el precio por kilo
                aplicando descuentos segun la cantidad comprada
*/
public class Fruteria {
    public static void main(String[] args) {
        // Declaración de variables
        double numkilos, precio, subtotal, descuento, total;
        String porcentaje, salida;
        
        // Entrada
        numkilos = Double.parseDouble(JOptionPane.showInputDialog("Introducir el num. kilos"));
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));
        
        // operación
        subtotal = numkilos * precio;
        
        if (numkilos >= 0.0 && numkilos <= 2.0) {
            total = subtotal;
            porcentaje = "0%";
            descuento = 0.0;
        } 
        else if (numkilos >= 2.01 && numkilos <= 5.0) {
            descuento = subtotal * 0.10;
            total = subtotal - descuento;
            porcentaje = "10%";
        } 
        else if (numkilos >= 5.01 && numkilos <= 10.0) {
            descuento = subtotal * 0.15;
            total = subtotal - descuento;
            porcentaje = "15%";
        } 
        else {
            descuento = subtotal * 0.20;
            total = subtotal - descuento;
            porcentaje = "20%";
        }

        // Parte de la segunda hoja
        if (numkilos < 0) {
            JOptionPane.showMessageDialog(null, "no pueden ser negativos");
        } else {
            salida = "subtotal: " + subtotal + "\nDescuento: " + descuento + "\nPorcentaje: " + porcentaje + "\nTotal: " + total;
            JOptionPane.showMessageDialog(null, salida);
        }
    }
}
//en un juego de prenguntas als que se responde si o no gana quien responta correctamente las 3 preguntas.
//Si responde mal a cualquiera de ellas ya no se prengunta la siguente y termina el juego
//si o no