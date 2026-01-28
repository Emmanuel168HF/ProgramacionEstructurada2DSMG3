import javax.swing.JOptionPane;

public class menu {
    public static void main(String[] args) {
        String menu = "",opcion="";
        boolean sentinel = true;
        // Crea la cadena
        menu = "======== MENU ========\n"+
            "1)Opcion 1\n"+
            "2)Opcion 2\n"+
            "3)Opcion 3\n"+
            "4)Salir\n"+
            "Elejir opcion";
        // Mostrar el menu
        do{
        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion.toUpperCase()) {
            case "1":
            case "A":
                JOptionPane.showMessageDialog(null, "Opcion 1");
                break;
            case "2":
                case "B":
                JOptionPane.showMessageDialog(null, "Opcion 2");
                break;
            case "3":
            case "C":
                JOptionPane.showMessageDialog(null, "Opcion 3");
                break;
            case "4":
            case "D":
                JOptionPane.showMessageDialog(null, "Salir");
                sentinel=false;
                break;       
            default:
                break;
        }
    }while (sentinel);   
    
    }
}
