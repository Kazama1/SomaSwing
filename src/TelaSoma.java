import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSoma {
    private JButton btnIgual;
    private JPanel panel1;
    private JTextField txtValor2;
    private JTextField txtValor1;
    private JLabel lblSoma;

    public TelaSoma() {
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtValor1.getText());
                int n2 = Integer.parseInt(txtValor2.getText());
                int s  = n1= n2;
                lblSoma.setText(Integer.toString(s));


            }
        });
    }
}
