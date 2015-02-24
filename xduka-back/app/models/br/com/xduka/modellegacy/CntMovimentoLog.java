package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntMovimentoLog {
    private long movimentoLogId;
    private Integer codUnidade;
    private Long codMovimento;
    private Timestamp data;
    private Long idUsuário;
    private String logMensagem;
    private String logMensagemNew;

    @Id
    @Column(name = "MovimentoLog_ID", nullable = false, insertable = true, updatable = true)
    public long getMovimentoLogId() {
        return movimentoLogId;
    }

    public void setMovimentoLogId(long movimentoLogId) {
        this.movimentoLogId = movimentoLogId;
    }

    @Basic
    @Column(name = "CodUnidade", nullable = true, insertable = true, updatable = true)
    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "CodMovimento", nullable = true, insertable = true, updatable = true)
    public Long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(Long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Basic
    @Column(name = "Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "IDUsuário", nullable = true, insertable = true, updatable = true)
    public Long getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(Long idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Basic
    @Column(name = "LogMensagem", nullable = true, insertable = true, updatable = true)
    public String getLogMensagem() {
        return logMensagem;
    }

    public void setLogMensagem(String logMensagem) {
        this.logMensagem = logMensagem;
    }

    @Basic
    @Column(name = "LogMensagem-New", nullable = true, insertable = true, updatable = true)
    public String getLogMensagemNew() {
        return logMensagemNew;
    }

    public void setLogMensagemNew(String logMensagemNew) {
        this.logMensagemNew = logMensagemNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMovimentoLog that = (CntMovimentoLog) o;

        if (movimentoLogId != that.movimentoLogId) return false;
        if (codMovimento != null ? !codMovimento.equals(that.codMovimento) : that.codMovimento != null) return false;
        if (codUnidade != null ? !codUnidade.equals(that.codUnidade) : that.codUnidade != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (idUsuário != null ? !idUsuário.equals(that.idUsuário) : that.idUsuário != null) return false;
        if (logMensagem != null ? !logMensagem.equals(that.logMensagem) : that.logMensagem != null) return false;
        if (logMensagemNew != null ? !logMensagemNew.equals(that.logMensagemNew) : that.logMensagemNew != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (movimentoLogId ^ (movimentoLogId >>> 32));
        result = 31 * result + (codUnidade != null ? codUnidade.hashCode() : 0);
        result = 31 * result + (codMovimento != null ? codMovimento.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (idUsuário != null ? idUsuário.hashCode() : 0);
        result = 31 * result + (logMensagem != null ? logMensagem.hashCode() : 0);
        result = 31 * result + (logMensagemNew != null ? logMensagemNew.hashCode() : 0);
        return result;
    }
}
