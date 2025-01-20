import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExampleMouseEvent {
    public static void main(String[] args) {
        //Crear una nueva ventana
        JFrame frame = new JFrame("Ventana de eventos");

        //Crear un boton
        JLabel label = new JLabel("Haz click en este texto con el botón derecho de tu mouse");

        //Listener del click
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    JOptionPane.showMessageDialog(frame, "Hiciste click con el botón correcto");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        //Añadir el boton
        frame.add(label);

        //Modal size
        frame.setSize(400, 250);

        //Cierre del modal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Visibilidad de la ventana
        frame.setVisible(true);
    }
}