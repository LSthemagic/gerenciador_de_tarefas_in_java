/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciaDTO;

import java.time.Instant;
import java.sql.Date;

/**
 *
 * @author Aluno
 */
public class tarefasDTO {
    private int codigo;
    private boolean concluido;
    private String title;
    private String descri;
    private String prioridade;
    private java.sql.Date prazo;
    private java.sql.Date dataInicial;
    private Date utilDataInicial = new Date(1999, 1, 1);  // Add utilDataInicial field
    
    // Constructor to initialize utilDataInicial
    
    
    // Other getters and setters for title, descri, prazo, and prioridade
    
    // Setter for utilDataInicial
    public void setUtilDataInicial(Date utilDataInicial) {
        this.utilDataInicial = utilDataInicial;
    }
    
    // Getter for utilDataInicial
    public Date getUtilDataInicial() {
        return utilDataInicial;
    }
   
  

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the descri
     */
    public String getDescri() {
        return descri;
    }

    /**
     * @param descri the descri to set
     */
    public void setDescri(String descri) {
        this.descri = descri;
    }

    /**
     * @return the prioridade
     */
    public String getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return the prazo
     */
    public Date getPrazo() {
        return prazo;
    }

    /**
     * @param prazo the prazo to set
     */
    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    /**
     * @return the dataInicial
     */
    public Date getDataInicial() {
        return dataInicial;
    }

    /**
     * @param dataInicial the dataInicial to set
     */
    public void setDataInicial(java.sql.Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    /**
     * @return the concluido
     */
    public boolean isConcluido() {
        return concluido;
    }

    /**
     * @param concluido the concluido to set
     */
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @param dataInicial the dataInicial to set
     */
   
    
    
}
