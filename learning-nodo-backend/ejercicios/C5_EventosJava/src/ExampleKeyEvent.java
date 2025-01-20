import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ExampleKeyEvent {
    public static void main (String[]args){
        //Crear una nueva ventana
        JFrame frame = new JFrame("Ventana de eventos");

        //Crear un boton
        JTextField entry = new JTextField("Escribe una frase y presiona Enter");

        //Listener del teclado
        entry.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER){
                    JOptionPane.showMessageDialog(frame, "Tu mensaje fue enviado");
                }

            }
        });
        //Añadir el campo
        frame.add(entry);

        //Modal size
        frame.setSize(400, 250);

        //Cierre del modal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Visibilidad de la ventana
        frame.setVisible(true);
    }
}
