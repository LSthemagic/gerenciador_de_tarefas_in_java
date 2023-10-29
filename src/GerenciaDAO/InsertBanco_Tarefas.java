/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciaDAO;

import GerenciaDTO.tarefasDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class InsertBanco_Tarefas {

    Connection conn;
    PreparedStatement pstm;

    public void cad_Tarefas(tarefasDTO tarefas) {

        String sql = "insert into tarefasuser (title_tarefa,descricao,prazo,dataInicial,concluido,prioridade) values(?,?,?,?,?,?)";
        java.util.Date utilPrazo = tarefas.getPrazo();
        java.sql.Date sqlPrazo = new java.sql.Date(utilPrazo.getTime());

        java.util.Date utilDataInicial = tarefas.getDataInicial();
        java.sql.Date sqlDataInicial = new java.sql.Date(utilDataInicial.getTime());
        conn = new Conexao().conectabd();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, tarefas.getTitle());
            pstm.setString(2, tarefas.getDescri());
            pstm.setDate(3, sqlPrazo);
            pstm.setDate(4, sqlDataInicial);
            pstm.setBoolean(5, tarefas.isConcluido());
            pstm.setString(6, tarefas.getPrioridade());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert DAO:" + e);
        }
    }

}
/*
java.util.Date utilPrazo = tarefas.getPrazo();
java.sql.Date sqlPrazo = new java.sql.Date(utilPrazo.getTime());

java.util.Date utilDataInicial = tarefas.getDataInicial();
java.sql.Date sqlDataInicial = new java.sql.Date(utilDataInicial.getTime());

pstm.setDate(3, sqlPrazo);
pstm.setDate(4, sqlDataInicial);

 */
 /*

 Connection conn;
        PreparedStatement pstm;
        
    public void cadastrarLeitor(LeitorDTO objleitordto){
        String sql = "insert into leitor (nome,idade,usuario,senha) values(?,?,?,?)";
        
        conn = new Conexao().conectabd();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objleitordto.getNome());
            pstm.setInt(2, objleitordto.getIdade());
            pstm.setString(3, objleitordto.getUsuario());
            pstm.setString(4, objleitordto.getSenha());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"leitor DAO:" + erro);
        }
    }
   
 */
