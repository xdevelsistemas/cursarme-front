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
public class AcdPautaLog {
    private long pautaLogId;
    private Integer codUnidade;
    private Long codPauta;
    private Timestamp data;
    private Long idUsuário;
    private String logMensagem;

    @Id
    @Column(name = "PautaLog_ID", nullable = false, insertable = true, updatable = true)
    public long getPautaLogId() {
        return pautaLogId;
    }

    public void setPautaLogId(long pautaLogId) {
        this.pautaLogId = pautaLogId;
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
    @Column(name = "CodPauta", nullable = true, insertable = true, updatable = true)
    public Long getCodPauta() {
        return codPauta;
    }

    public void setCodPauta(Long codPauta) {
        this.codPauta = codPauta;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPautaLog that = (AcdPautaLog) o;

        if (pautaLogId != that.pautaLogId) return false;
        if (codPauta != null ? !codPauta.equals(that.codPauta) : that.codPauta != null) return false;
        if (codUnidade != null ? !codUnidade.equals(that.codUnidade) : that.codUnidade != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (idUsuário != null ? !idUsuário.equals(that.idUsuário) : that.idUsuário != null) return false;
        if (logMensagem != null ? !logMensagem.equals(that.logMensagem) : that.logMensagem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pautaLogId ^ (pautaLogId >>> 32));
        result = 31 * result + (codUnidade != null ? codUnidade.hashCode() : 0);
        result = 31 * result + (codPauta != null ? codPauta.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (idUsuário != null ? idUsuário.hashCode() : 0);
        result = 31 * result + (logMensagem != null ? logMensagem.hashCode() : 0);
        return result;
    }
}
