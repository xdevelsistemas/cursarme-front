package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "sgrUsuárioMensagem", schema = "dbo")
public class SgrUsuarioMensagem {
    private int idMensagem;
    private Integer idUsuário;
    private Integer idUsuárioRemetente;
    private String mensagem;
    private Timestamp momento;

    @Id
    @Column(name = "IDMensagem", nullable = false, insertable = true, updatable = true)
    public int getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(int idMensagem) {
        this.idMensagem = idMensagem;
    }

    @Basic
    @Column(name = "IDUsuário", nullable = true, insertable = true, updatable = true)
    public Integer getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(Integer idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Basic
    @Column(name = "IDUsuárioRemetente", nullable = true, insertable = true, updatable = true)
    public Integer getIdUsuárioRemetente() {
        return idUsuárioRemetente;
    }

    public void setIdUsuárioRemetente(Integer idUsuárioRemetente) {
        this.idUsuárioRemetente = idUsuárioRemetente;
    }

    @Basic
    @Column(name = "Mensagem", nullable = true, insertable = true, updatable = true)
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Basic
    @Column(name = "Momento", nullable = true, insertable = true, updatable = true)
    public Timestamp getMomento() {
        return momento;
    }

    public void setMomento(Timestamp momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrUsuarioMensagem that = (SgrUsuarioMensagem) o;

        if (idMensagem != that.idMensagem) return false;
        if (idUsuário != null ? !idUsuário.equals(that.idUsuário) : that.idUsuário != null) return false;
        if (idUsuárioRemetente != null ? !idUsuárioRemetente.equals(that.idUsuárioRemetente) : that.idUsuárioRemetente != null)
            return false;
        if (mensagem != null ? !mensagem.equals(that.mensagem) : that.mensagem != null) return false;
        if (momento != null ? !momento.equals(that.momento) : that.momento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMensagem;
        result = 31 * result + (idUsuário != null ? idUsuário.hashCode() : 0);
        result = 31 * result + (idUsuárioRemetente != null ? idUsuárioRemetente.hashCode() : 0);
        result = 31 * result + (mensagem != null ? mensagem.hashCode() : 0);
        result = 31 * result + (momento != null ? momento.hashCode() : 0);
        return result;
    }
}
