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
public class SgrSolicitacao {
    private int codUnidade;
    private Integer aberta;
    private Integer concluída;
    private Integer confirmada;
    private Integer total;
    private Integer alerta;
    private Integer devolvida;
    private Integer concluídaHoje;
    private Timestamp dataConcluída;
    private Timestamp dataSincronizada;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "Aberta", nullable = true, insertable = true, updatable = true)
    public Integer getAberta() {
        return aberta;
    }

    public void setAberta(Integer aberta) {
        this.aberta = aberta;
    }

    @Basic
    @Column(name = "Concluída", nullable = true, insertable = true, updatable = true)
    public Integer getConcluída() {
        return concluída;
    }

    public void setConcluída(Integer concluída) {
        this.concluída = concluída;
    }

    @Basic
    @Column(name = "Confirmada", nullable = true, insertable = true, updatable = true)
    public Integer getConfirmada() {
        return confirmada;
    }

    public void setConfirmada(Integer confirmada) {
        this.confirmada = confirmada;
    }

    @Basic
    @Column(name = "Total", nullable = true, insertable = true, updatable = true)
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Basic
    @Column(name = "Alerta", nullable = true, insertable = true, updatable = true)
    public Integer getAlerta() {
        return alerta;
    }

    public void setAlerta(Integer alerta) {
        this.alerta = alerta;
    }

    @Basic
    @Column(name = "Devolvida", nullable = true, insertable = true, updatable = true)
    public Integer getDevolvida() {
        return devolvida;
    }

    public void setDevolvida(Integer devolvida) {
        this.devolvida = devolvida;
    }

    @Basic
    @Column(name = "ConcluídaHoje", nullable = true, insertable = true, updatable = true)
    public Integer getConcluídaHoje() {
        return concluídaHoje;
    }

    public void setConcluídaHoje(Integer concluídaHoje) {
        this.concluídaHoje = concluídaHoje;
    }

    @Basic
    @Column(name = "DataConcluída", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataConcluída() {
        return dataConcluída;
    }

    public void setDataConcluída(Timestamp dataConcluída) {
        this.dataConcluída = dataConcluída;
    }

    @Basic
    @Column(name = "DataSincronizada", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataSincronizada() {
        return dataSincronizada;
    }

    public void setDataSincronizada(Timestamp dataSincronizada) {
        this.dataSincronizada = dataSincronizada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrSolicitacao that = (SgrSolicitacao) o;

        if (codUnidade != that.codUnidade) return false;
        if (aberta != null ? !aberta.equals(that.aberta) : that.aberta != null) return false;
        if (alerta != null ? !alerta.equals(that.alerta) : that.alerta != null) return false;
        if (concluída != null ? !concluída.equals(that.concluída) : that.concluída != null) return false;
        if (concluídaHoje != null ? !concluídaHoje.equals(that.concluídaHoje) : that.concluídaHoje != null)
            return false;
        if (confirmada != null ? !confirmada.equals(that.confirmada) : that.confirmada != null) return false;
        if (dataConcluída != null ? !dataConcluída.equals(that.dataConcluída) : that.dataConcluída != null)
            return false;
        if (dataSincronizada != null ? !dataSincronizada.equals(that.dataSincronizada) : that.dataSincronizada != null)
            return false;
        if (devolvida != null ? !devolvida.equals(that.devolvida) : that.devolvida != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (aberta != null ? aberta.hashCode() : 0);
        result = 31 * result + (concluída != null ? concluída.hashCode() : 0);
        result = 31 * result + (confirmada != null ? confirmada.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (alerta != null ? alerta.hashCode() : 0);
        result = 31 * result + (devolvida != null ? devolvida.hashCode() : 0);
        result = 31 * result + (concluídaHoje != null ? concluídaHoje.hashCode() : 0);
        result = 31 * result + (dataConcluída != null ? dataConcluída.hashCode() : 0);
        result = 31 * result + (dataSincronizada != null ? dataSincronizada.hashCode() : 0);
        return result;
    }
}
