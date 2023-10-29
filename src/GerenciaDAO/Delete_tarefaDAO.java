/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciaDAO;

/**
 *
 * @author User
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Delete_tarefaDAO {
    Connection conn;
    PreparedStatement pstm;

    public void deleteTarefa(int id) {
        String sql = "DELETE FROM tarefasuser WHERE id=?";
        conn = new Conexao().conectabd();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Tarefa deletada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Tarefa não encontrada ou falha ao deletar.");
            }
            pstm.close();
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar tarefa: " + erro.getMessage());
        }
    }
}


