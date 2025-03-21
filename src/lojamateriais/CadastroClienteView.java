import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroClienteView extends JFrame {

    public CadastroClienteView() {
        setTitle("Cadastro de Cliente");
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

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(15); 
        JLabel lblCpf = new JLabel("CPF:");
        JTextField txtCpf = new JTextField(15); 
        JButton btnSalvar = new JButton("Salvar");

        // Estilizando labels e texto
        lblNome.setFont(new Font("Arial", Font.BOLD, 14));
        lblCpf.setFont(new Font("Arial", Font.BOLD, 14));
        txtNome.setFont(new Font("Arial", Font.PLAIN, 14));
        txtCpf.setFont(new Font("Arial", Font.PLAIN, 14));

        // Borda e cor nos campos
        txtNome.setBorder(BorderFactory.createLineBorder(new Color(42, 87, 141), 2));
        txtCpf.setBorder(BorderFactory.createLineBorder(new Color(42, 87, 141), 2));

        // Estilizando o botão
        btnSalvar.setFont(new Font("Arial", Font.BOLD, 14));
        btnSalvar.setBackground(new Color(42, 87, 141));
        btnSalvar.setForeground(Color.WHITE);
        btnSalvar.setFocusPainted(false);
        btnSalvar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Painel de Cadastro
        painel.add(lblNome);
        painel.add(txtNome);
        painel.add(lblCpf);
        painel.add(txtCpf);
        painel.add(new JLabel()); // Espaço
        painel.add(btnSalvar);

        // Adicionando painel ao JFrame
        add(painel, BorderLayout.CENTER);

        // Ação do botão
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cpf = txtCpf.getText();
                JOptionPane.showMessageDialog(null, "Cliente " + nome + " cadastrado com sucesso!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroClienteView().setVisible(true));
    }
}
