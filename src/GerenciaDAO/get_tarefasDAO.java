/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciaDAO;

import GerenciaDTO.tarefasDTO;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/*
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


import newtime.DTO.cadLivroDTO;
*/
/**
 *
 * @author User
 */
public class get_tarefasDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<tarefasDTO> listar_tarefas = new ArrayList<>();
    public ArrayList<tarefasDTO> getTarefasDAO(){
        String sql = "select * from tarefasuser";
        conn = new Conexao().conectabd();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {                
                tarefasDTO objtarefasDTO = new tarefasDTO();
                objtarefasDTO.setCodigo(rs.getInt("id"));
                objtarefasDTO.setTitle(rs.getString("title_tarefa"));
                objtarefasDTO.setDescri(rs.getString("descricao"));
                objtarefasDTO.setPrazo(rs.getDate("prazo"));
                objtarefasDTO.setDataInicial(rs.getDate("dataInicial"));
                objtarefasDTO.setConcluido(rs.getBoolean("concluido"));
                objtarefasDTO.setPrioridade(rs.getString("prioridade"));
                
                listar_tarefas.add(objtarefasDTO);
            }
            rs.close();
            pstm.close();
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisar tarefa get_tarefasDAO: " + erro);
        }
        return listar_tarefas;
    }
}
