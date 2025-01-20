import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExampleActionEvent {
    public static void main(String[]args){
        //Crear una nueva ventana
        JFrame frame = new JFrame("Ventana de eventos");

        //Crear un boton
        JButton button = new JButton("Haz click");

        //Listener del click
        button.addActionListener(e -> {
            //Modal al hacer click
            JOptionPane.showMessageDialog(frame, "Hiciste click");
        });

        //Añadir el boton
        frame.add(button);

        //Modal size
        frame.setSize(400,250);

        //Cierre del modal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Visibilidad de la ventana
        frame.setVisible(true);


    }
}
