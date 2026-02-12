import javax.swing.JOptionPane;
public class ProgramasConWhile {
    public static void main(String[] args) {
          //Decarar las variables
          final double PORCENTAJE = 0.10;
          double sueldoB = 0.0, v1 =0.0, v2 =0.0, v3 =0.0, comision =0.0, total = 0.0, totalS =0.0; 
          int numTraba = 0;
          String salida = "";
          String menu = "" , opcion="";
        boolean sentinel = true;


        menu = " ========= MENU CICLO WHILE ========\n" +
                "1)Opcion 1\n" +
                "2)Opcion 2\n" +
                "3)Opcion 3\n" +
                "4)salir \n" +
                "elijir Opcion: ";
        do{
        // Mostrar menu
        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion.toUpperCase()) {
            case "1":
            case "A":
                numTraba = Integer.parseInt(JOptionPane.showInputDialog("Numero de trabajadores"));
                if (numTraba >0) {
                    
                    sueldoB = Double.parseDouble(JOptionPane.showInputDialog("sueldo base"));
                    if (sueldoB>0.0) {
                        int i = 1;
                        salida = "=====NOMINA=====";
                        while (i<=numTraba) {
                        v1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 1"));
                        v2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 2"));
                        v3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta 3"));
                        if (v1<=0.0 || v2<=0.0 || v3<=0.0) {
                            JOptionPane.showMessageDialog(null, "una o mas ventas no son validas");
                            continue;

                            
                        }else {
                            comision = (v1 + v2 + v3) * PORCENTAJE;
                            total = sueldoB + comision;
                            salida+= "\nvendedor" + i +
                                      "\nsueldo base:" + sueldoB +
                                      "\ncomision:" + comision + 
                                      "\ntotal:" + total;
                                      totalS += total;


                 

                        }
                        i++;
                        
                    }
                    salida+= "\nTotal de deduciones: $" + totalS;
                    JOptionPane.showMessageDialog(null, salida);

                }else{
                      JOptionPane.showMessageDialog(null, "el sueldo base no ee valido" );


                }
                    
                }else  {
                    JOptionPane.showMessageDialog(null, "el numero de trabajadores debe ser mayor a 0");
                  
                      }  
                break;
            case "2":
            case "B":
                  JOptionPane.showMessageDialog(null, "opcion 2");
                 break;
            case "3":
            case "C":
                   JOptionPane.showMessageDialog(null, "opcion 3");
                 break;
            case "4":
            case "S":
                   JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");    
        }
    }while(sentinel);
          

        
    }
    
}