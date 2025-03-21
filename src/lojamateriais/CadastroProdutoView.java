import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProdutoView extends JFrame {

    public CadastroProdutoView() {
        setTitle("Cadastro de Produto");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2, 10, 10));
        painel.setBackground(new Color(255, 255, 255));

        JLabel lblNomeProduto = new JLabel("Nome do Produto:");
        JTextField txtNomeProduto = new JTextField(15);
        JLabel lblPreco = new JLabel("Preço:");
        JTextField txtPreco = new JTextField(10);
        JButton btnSalvarProduto = new JButton("Salvar");

        // Estilizando as labels e campos
        lblNomeProduto.setFont(new Font("Arial", Font.BOLD, 14));
        lblPreco.setFont(new Font("Arial", Font.BOLD, 14));
        txtNomeProduto.setFont(new Font("Arial", Font.PLAIN, 14));
        txtPreco.setFont(new Font("Arial", Font.PLAIN, 14));

        // Borda nos campos
        txtNomeProduto.setBorder(BorderFactory.createLineBorder(new Color(42, 87, 141), 2));
        txtPreco.setBorder(BorderFactory.createLineBorder(new Color(42, 87, 141), 2));

        // Estilizando o botão
        btnSalvarProduto.setFont(new Font("Arial", Font.BOLD, 14));
        btnSalvarProduto.setBackground(new Color(42, 87, 141));
        btnSalvarProduto.setForeground(Color.WHITE);
        btnSalvarProduto.setFocusPainted(false);
        btnSalvarProduto.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Painel de Produto
        painel.add(lblNomeProduto);
        painel.add(txtNomeProduto);
        painel.add(lblPreco);
        painel.add(txtPreco);
        painel.add(new JLabel()); // Espaço
        painel.add(btnSalvarProduto);

        // Adicionando painel ao JFrame
        add(painel, BorderLayout.CENTER);

        // Ação do botão
        btnSalvarProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeProduto = txtNomeProduto.getText();
                String preco = txtPreco.getText();
                JOptionPane.showMessageDialog(null, "Produto " + nomeProduto + " cadastrado com sucesso!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroProdutoView().setVisible(true));
    }
}
