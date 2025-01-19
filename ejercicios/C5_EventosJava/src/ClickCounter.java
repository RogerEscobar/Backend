import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ClickCounter {

    static int clickCount = 0;

    public static void main (String[]args) {

        JFrame frame = new JFrame("Ventana de eventos");
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Clicks: 0");

        JButton counter = new JButton("Haz click en este botón ");
        counter.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1){
                    clickCount++;
                    label.setText("Clicks: " + clickCount);
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        frame.add(label);
        frame.add(counter);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
