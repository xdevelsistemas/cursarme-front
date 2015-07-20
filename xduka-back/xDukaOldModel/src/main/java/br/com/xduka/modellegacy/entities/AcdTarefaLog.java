package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdTarefaLog {
    private long tarefaLogId;
    private int codUnidade;
    private int anoLetivo;
    private int matrícula;
    private Timestamp data;
    private Integer idUsuário;

    @Id
    @Column(name = "TarefaLog_ID", nullable = false, insertable = true, updatable = true)
    public long getTarefaLogId() {
        return tarefaLogId;
    }

    public void setTarefaLogId(long tarefaLogId) {
        this.tarefaLogId = tarefaLogId;
    }

    @Basic
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Basic
    @Column(name = "Matrícula", nullable = false, insertable = true, updatable = true)
    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    @Basic
    @Column(name = "Data", nullable = false, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "IDUsuário", nullable = true, insertable = true, updatable = true)
    public Integer getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(Integer idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTarefaLog that = (AcdTarefaLog) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (matrícula != that.matrícula) return false;
        if (tarefaLogId != that.tarefaLogId) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (idUsuário != null ? !idUsuário.equals(that.idUsuário) : that.idUsuário != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (tarefaLogId ^ (tarefaLogId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + matrícula;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (idUsuário != null ? idUsuário.hashCode() : 0);
        return result;
    }
}
