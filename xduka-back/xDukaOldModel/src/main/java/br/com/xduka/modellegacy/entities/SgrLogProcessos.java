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
public class SgrLogProcessos {
    private long logProcessosId;
    private Timestamp data;
    private int idUsuário;
    private String descrição;
    private Byte tipo;
    private Timestamp alterado;
    private String ip;

    @Id
    @Column(name = "LogProcessos_ID", nullable = false, insertable = true, updatable = true)
    public long getLogProcessosId() {
        return logProcessosId;
    }

    public void setLogProcessosId(long logProcessosId) {
        this.logProcessosId = logProcessosId;
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
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Basic
    @Column(name = "Descrição", nullable = true, insertable = true, updatable = true)
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Basic
    @Column(name = "Tipo", nullable = true, insertable = true, updatable = true)
    public Byte getTipo() {
        return tipo;
    }

    public void setTipo(Byte tipo) {
        this.tipo = tipo;
    }

    @Basic
    @Column(name = "Alterado", nullable = true, insertable = true, updatable = true)
    public Timestamp getAlterado() {
        return alterado;
    }

    public void setAlterado(Timestamp alterado) {
        this.alterado = alterado;
    }

    @Basic
    @Column(name = "Ip", nullable = true, insertable = true, updatable = true)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrLogProcessos that = (SgrLogProcessos) o;

        if (idUsuário != that.idUsuário) return false;
        if (logProcessosId != that.logProcessosId) return false;
        if (alterado != null ? !alterado.equals(that.alterado) : that.alterado != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (descrição != null ? !descrição.equals(that.descrição) : that.descrição != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (logProcessosId ^ (logProcessosId >>> 32));
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + idUsuário;
        result = 31 * result + (descrição != null ? descrição.hashCode() : 0);
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (alterado != null ? alterado.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        return result;
    }
}
