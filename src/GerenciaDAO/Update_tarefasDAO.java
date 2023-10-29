/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciaDAO;

import GerenciaDTO.tarefasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Update_tarefasDAO {

    Connection conn;
    PreparedStatement pstm;

    public void updateTarefa(tarefasDTO objtarefasDTO) {
        String sql = "UPDATE tarefasuser SET title_tarefa=?, descricao=?, concluido=?, prioridade=? WHERE id=?";
        conn = new Conexao().conectabd();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objtarefasDTO.getTitle());
            pstm.setString(2, objtarefasDTO.getDescri());
            pstm.setBoolean(3, objtarefasDTO.isConcluido());
            pstm.setString(4, objtarefasDTO.getPrioridade());
            pstm.setInt(5, objtarefasDTO.getCodigo());

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Tarefa atualizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao atualizar a tarefa.");
            }

            pstm.close();
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tarefa: " + erro.getMessage());
        }
    }
}
