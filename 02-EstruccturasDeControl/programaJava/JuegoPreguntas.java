import javax.swing.JOptionPane;
/*
    Universidad Tecnologica de Tula-Tepeji
    Programa educativo: Tecnologias de la Informacion e innovacion
    TSU. Desarrollo de Software Multiplataforma
    Programador: Armandoo Emmanuel Gomez Almaraz
    "Fecha de creacion: 22/01/2026"
    Descripcion: en un juego de prenguntas als que se responde si o no gana quien responta correctamente las 3 preguntas.
    Si responde mal a cualquiera de ellas ya no se prengunta la siguente y termina el juego
*/
public class JuegoPreguntas {
    public static void main(String[] args) {
        // Se da Una bienvenida al juego
        JOptionPane.showMessageDialog(null, "Responde las siguientes preguntas con SI o NO");
        // Primera pregunta
        String respuesta1 = JOptionPane.showInputDialog("EL primer albun de Zoe es Demo Olmos?");
        // Se utiliza un switch para evaluar la respuesta
        switch (respuesta1) {
            case "SI":
                // Segunda pregunta
                String respuesta2 = JOptionPane.showInputDialog("El segundo albun de Zoe es Karmatica Resonancia?");
                switch (respuesta2) {
                    case "SI":
                       JOptionPane.showMessageDialog(null, "Respuesta incorrecta, fin del juego");
                        
                        break;
                    case "NO":
                         // Tercera pregunta
                        String respuesta3 = JOptionPane.showInputDialog("El tercer albun de Zoe es Aztlan?");
                        switch (respuesta3) {
                            case "SI":
                                 JOptionPane.showMessageDialog(null, "Respuesta incorrecta, fin del juego");
                                break;
                            case "NO":
                                JOptionPane.showMessageDialog(null, "Felicidades, has respondido correctamente las 3 preguntas y has ganado el juego");
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
                break;
            case "NO":
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta, fin del juego");
                break;
                
            default:
                break;
        }
    }
}
