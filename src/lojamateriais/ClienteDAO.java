import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    // Método para cadastrar cliente no banco de dados
    public void cadastrarCliente(String nome, String cpf) {
        String sql = "INSERT INTO Cliente (nome, cpf) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para consultar um cliente por CPF
    public boolean consultarClientePorCPF(String cpf) {
        String sql = "SELECT * FROM Cliente WHERE cpf = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            return stmt.executeQuery().next(); 
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
