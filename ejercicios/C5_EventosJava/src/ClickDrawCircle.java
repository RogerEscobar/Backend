import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ClickDrawCircle {

    static Point lastClick;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Ventana de eventos");
        frame.setLayout(new FlowLayout());

        JPanel drawingPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (lastClick != null){
                    g.setColor(Color.RED);
                    g.fillOval(lastClick.x -15, lastClick.y -15, 30 , 30);
                }
            }
        };
        drawingPanel.setBackground(Color.GRAY);
        drawingPanel.setPreferredSize(new Dimension(400,400));
        drawingPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lastClick =e.getPoint();
                drawingPanel.repaint();
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

        frame.add(drawingPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}