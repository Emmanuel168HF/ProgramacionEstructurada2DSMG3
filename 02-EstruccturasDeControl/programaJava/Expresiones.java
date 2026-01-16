

import javax.swing.JOptionPane;

public class Expresiones {
    public static void main(String[] args) {
        int suma;
        int resta;
        int multi, div, mod, area;
        double resultado = 0.0, potencia;
        boolean valor = true, valor2 = false;
        float f1 = 8.9f, f2 = (float)10.3;
        double d1 = 12;

        //definir constante
        final double PI = 3.1416;
        String salida = "";
        //expresion aritmetica
        suma = 3 + 5;
        resta = 10 - 12;
        multi = 34 * 23;
        div =  10 / 2;
        mod = 10 % 2;
        potencia = Math.pow(4,2);


        salida = "la suma es:" + suma + "\nLa resta es:" + resta + "\nLa multiplicacion es:" + multi
                + "\nLa division es:" + div + "\nLa modulo es:" + mod +"\nLa potencia es:" + potencia;

        JOptionPane.showMessageDialog(null,salida);






        ;
    }
}