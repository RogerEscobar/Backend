import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FiveElement {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Elegir elemento");
        String[] elements = {"Agua", "Aire", "Tierra", "Fuego", "Amor"};
        JTextField selection = new JTextField(10);
        JButton btnDiscover = new JButton("Elemento");
        JLabel yourElement = new JLabel("Tú elemento es");

        btnDiscover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arrayAccess(elements, selection, yourElement);
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingresa un número entre 0 y 4 para conocer tu elemento"));
        panel.add(selection);
        panel.add(btnDiscover);
        panel.add(yourElement);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void arrayAccess(String[] elements, JTextField selection, JLabel yourElement){
        try

    {
        int selectionNum = Integer.parseInt(selection.getText());
        String elementsList = elements[selectionNum];
        yourElement.setText(" Tú elenebto es: " + elementsList);
    }
        catch(
    NumberFormatException e)

    {
        yourElement.setText("Ingresa un número entero");
    }
        catch(
    ArrayIndexOutOfBoundsException e)

    {
        yourElement.setText("El número esta fuera del rango");
    }
        finally

    {
        System.out.println("Acceso a los elementos finalizado");
        yourElement.setText(yourElement.getText() + " Acceso a los elementos finalizado");
    }
}
}
