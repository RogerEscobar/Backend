import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyRecognition {
    public static void main(String[] args) {
        //Crear una nueva ventana
        JFrame frame = new JFrame("Ventana de eventos");

        //Crear campo de texto
        JTextField entry = new JTextField();

        //Crear un texto instrucción
        JLabel label = new JLabel("Presiona Enter o A");

        //Listener del teclado
        entry.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            //Detectar que tecla se esta presionando
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    label.setText("Presionaste Enter");
                } else if (e.getKeyCode() == KeyEvent.VK_A) {
                    label.setText("Presionaste la A");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        //Añadir el campo
        frame.add(entry);
        frame.add(label);

        //Modal size
        frame.setSize(400, 250);

        //Cierre del modal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Visibilidad de la ventana
        frame.setVisible(true);
    }
}
