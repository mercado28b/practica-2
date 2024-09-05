import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practica2_java {
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JButton borrarButton;

    public practica2_java() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField1.getText());

                JOptionPane.showMessageDialog(null, "La suma de los numeros es: " + (a + b));

                textField1.setText("");
                textField2.setText("");
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField1.getText());

                JOptionPane.showMessageDialog(null, "La resta de los numeros es: " + (a - b));

                textField1.setText("");
                textField2.setText("");

            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField1.getText());

                JOptionPane.showMessageDialog(null, "La multiplicacion de los numeros es: " + (a * b));

                textField1.setText("");
                textField2.setText("");

            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField1.getText());

                JOptionPane.showMessageDialog(null, "La divicion de los numeros es: " + (a / b));

                textField1.setText("");
                textField2.setText("");

            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");

            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
