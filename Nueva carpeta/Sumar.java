import java.awt.*;
import javax.swing.*;

public class Sumar extends JFrame {
    public Sumar () {
        setTitle("El Sumador +10");
        setSize(370, 185);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1, 8, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(12, 15, 12, 15));
        JTextField txtNumero = new JTextField();
        JButton btnSumar = new JButton("Sumar 10");
        JLabel lblResultado = new JLabel("Resultado: ...", SwingConstants.CENTER);
        panel.add(txtNumero);
        panel.add(btnSumar);
        panel.add(lblResultado);
        add(panel);

        btnSumar.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(txtNumero.getText().trim());
                int total = numero + 10;
                lblResultado.setText("Resultado: " + String.valueOf(total));
            } catch (NumberFormatException error) {
                lblResultado.setText("Ingresa un número entero válido");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Sumar().setVisible(true));
    }
}

