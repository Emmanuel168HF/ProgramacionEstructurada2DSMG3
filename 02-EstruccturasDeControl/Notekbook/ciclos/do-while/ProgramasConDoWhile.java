import javax.swing.JOptionPane;

public class ProgramasConDoWhile {
    public static void main(String[] args) {
        String opcion = "";
        boolean sentinel = true ;
    do {
        
    
        opcion = obtenerMenu();
        switch (opcion) {
            case "1":{
                JOptionPane.showMessageDialog(null, "soy tu mejor opcion 1");
                
                
                break;
            }
            case "2":{

            }
            case "3":{
                
            }
            case "4":{

            }
            default:   
        }
        JOptionPane.showMessageDialog(null, "opcion no valida");
      } while (sentinel);
    }
    

public static String obtenerMenu() {
    String menu = " ========= MENU ========\n" +
                "1)Opcion 1\n" +
                "2)Opcion 2\n" +
                "3)Opcion 3\n" +
                "4)salir \n" +
                "elijir Opcion: ";
                
            String opcion = JOptionPane.showInputDialog(menu);
            return opcion;



}
}