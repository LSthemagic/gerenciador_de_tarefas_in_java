package GerenciaDAO;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection conectabd() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/gerenciador_tarefas?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException erro) {
            System.out.println("Error connecting to the database");
            erro.printStackTrace();
        }

        return conn;
    }
}
