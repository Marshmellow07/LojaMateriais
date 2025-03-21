import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    public LoginView() {
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2, 10, 10));
        painel.setBackground(new Color(255, 255, 255));

        JLabel lblUsuario = new JLabel("Usuário:");
        JLabel lblSenha = new JLabel("Senha:");
        JTextField txtUsuario = new JTextField(15); // Menor
        JPasswordField txtSenha = new JPasswordField(15); // Menor
        JButton btnEntrar = new JButton("Entrar");

        // Estilizando labels
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        lblSenha.setFont(new Font("Arial", Font.BOLD, 14));

        // Estilizando campos de texto
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
        txtSenha.setFont(new Font("Arial", Font.PLAIN, 14));
        txtUsuario.setBorder(BorderFactory.createLineBorder(new Color(42, 87, 141), 2));
        txtSenha.setBorder(BorderFactory.createLineBorder(new Color(42, 87, 141), 2));

        // Estilizando botão
        btnEntrar.setFont(new Font("Arial", Font.BOLD, 14));
        btnEntrar.setBackground(new Color(42, 87, 141));
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setFocusPainted(false);
        btnEntrar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Painel de Campos
        painel.add(lblUsuario);
        painel.add(txtUsuario);
        painel.add(lblSenha);
        painel.add(txtSenha);
        painel.add(new JLabel()); // Espaço
        painel.add(btnEntrar);

        // Adicionando painel ao JFrame
        add(painel, BorderLayout.CENTER);

        // Ação do botão "Entrar"
        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                char[] senha = txtSenha.getPassword();
                if ("admin".equals(usuario) && "1234".equals(new String(senha))) {
                    new MenuPrincipalView().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginView().setVisible(true));
    }
}
