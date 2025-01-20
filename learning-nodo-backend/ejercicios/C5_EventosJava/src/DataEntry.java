import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataEntry {
    public static void main(String[] args){

        JFrame frame = new JFrame("Haz una división");
        JTextField Num1 = new JTextField(10);
        JTextField Num2 = new JTextField(10);
        JButton btnDivide = new JButton("Dividir");
        JLabel lblresult = new JLabel("Resultado: ");

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divideNumbers(Num1, Num2, lblresult);
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Dividendo"));
        panel.add(Num1);
        panel.add(new JLabel("Divisor"));
        panel.add(Num2);
        panel.add(lblresult);
        panel.add(btnDivide);

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void divideNumbers(JTextField Num1, JTextField Num2, JLabel lblresult){
        try {
            //Numeros para dividir
            int num1 = Integer.parseInt(Num1.getText());
            int num2 = Integer.parseInt(Num2.getText());
            int result = num1 / num2;
            lblresult.setText("Resultado: "+ result);
        }
        catch (NumberFormatException e) {
            lblresult.setText("Error: Ingresa solo números");
        }
        catch (ArithmeticException e) {
            lblresult.setText("Error: No es posible dividir por cero");
        }
    }
}
