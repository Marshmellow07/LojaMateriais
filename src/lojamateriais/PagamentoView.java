import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PagamentoView extends JFrame {

    public PagamentoView() {
        setTitle("Pagamento");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2, 2, 10, 10));
        painel.setBackground(new Color(255, 255, 255));

        JLabel lblValor = new JLabel("Valor do Pagamento:");
        JTextField txtValor = new JTextField(10);
        JButton btnPagar = new JButton("Pagar");

        // Estilizando as labels e campos
        lblValor.setFont(new Font("Arial", Font.BOLD, 14));
        txtValor.setFont(new Font("Arial", Font.PLAIN, 14));
        txtValor.setBorder(BorderFactory.createLineBorder(new Color(42, 87, 141), 2));

        // Estilizando o botão
        btnPagar.setFont(new Font("Arial", Font.BOLD, 14));
        btnPagar.setBackground(new Color(42, 87, 141));
        btnPagar.setForeground(Color.WHITE);
        btnPagar.setFocusPainted(false);
        btnPagar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Painel de Pagamento
        painel.add(lblValor);
        painel.add(txtValor);
        painel.add(new JLabel()); // Espaço
        painel.add(btnPagar);

        // Adicionando painel ao JFrame
        add(painel, BorderLayout.CENTER);

        // Ação do botão
        btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = txtValor.getText();
                JOptionPane.showMessageDialog(null, "Pagamento de R$" + valor + " realizado com sucesso!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PagamentoView().setVisible(true));
    }
}
