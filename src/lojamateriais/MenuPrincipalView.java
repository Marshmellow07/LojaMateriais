import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipalView extends JFrame {

    public MenuPrincipalView() {
        setTitle("Menu Principal");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        setLayout(new FlowLayout());

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 1, 10, 10));
        painel.setBackground(new Color(255, 255, 255));

        JButton btnCadastroCliente = new JButton("Cadastro de Cliente");
        JButton btnCadastroProduto = new JButton("Cadastro de Produto");
        JButton btnPagamento = new JButton("Pagamento");

        // Estilizando os botões
        btnCadastroCliente.setFont(new Font("Arial", Font.BOLD, 14));
        btnCadastroProduto.setFont(new Font("Arial", Font.BOLD, 14));
        btnPagamento.setFont(new Font("Arial", Font.BOLD, 14));
        btnCadastroCliente.setBackground(new Color(42, 87, 141));
        btnCadastroProduto.setBackground(new Color(42, 87, 141));
        btnPagamento.setBackground(new Color(42, 87, 141));
        btnCadastroCliente.setForeground(Color.WHITE);
        btnCadastroProduto.setForeground(Color.WHITE);
        btnPagamento.setForeground(Color.WHITE);
        btnCadastroCliente.setFocusPainted(false);
        btnCadastroProduto.setFocusPainted(false);
        btnPagamento.setFocusPainted(false);

        // Painel de navegação
        painel.add(btnCadastroCliente);
        painel.add(btnCadastroProduto);
        painel.add(btnPagamento);

        add(painel, BorderLayout.CENTER);

        // Ações dos botões
        btnCadastroCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroClienteView().setVisible(true);
            }
        });
        btnCadastroProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroProdutoView().setVisible(true);
            }
        });
        btnPagamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PagamentoView().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuPrincipalView().setVisible(true));
    }
}
