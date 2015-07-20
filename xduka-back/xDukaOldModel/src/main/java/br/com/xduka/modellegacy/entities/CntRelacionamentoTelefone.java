package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntRelacionamentoTelefonePK.class)
public class CntRelacionamentoTelefone {
    private long relacinamentoTelefoneId;
    private int codUnidade;
    private int codRelacionamento;
    private int índice;
    private String ddd;
    private String telefone;
    private String telefoneObs;
    private Integer codTipoLocal;
//    private CntTipoLocal cntTipoLocal;

    @Basic
    @Column(name = "RelacinamentoTelefone_ID", nullable = false, insertable = true, updatable = true)
    public long getRelacinamentoTelefoneId() {
        return relacinamentoTelefoneId;
    }

    public void setRelacinamentoTelefoneId(long relacinamentoTelefoneId) {
        this.relacinamentoTelefoneId = relacinamentoTelefoneId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodRelacionamento", nullable = false, insertable = true, updatable = true)
    public int getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(int codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
    }

    @Id
    @Column(name = "Índice", nullable = false, insertable = true, updatable = true)
    public int getÍndice() {
        return índice;
    }

    public void setÍndice(int índice) {
        this.índice = índice;
    }

    @Basic
    @Column(name = "DDD", nullable = true, insertable = true, updatable = true)
    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    @Basic
    @Column(name = "Telefone", nullable = true, insertable = true, updatable = true)
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Basic
    @Column(name = "TelefoneObs", nullable = true, insertable = true, updatable = true)
    public String getTelefoneObs() {
        return telefoneObs;
    }

    public void setTelefoneObs(String telefoneObs) {
        this.telefoneObs = telefoneObs;
    }

    @Basic
    @Column(name = "CodTipoLocal", nullable = true, insertable = false, updatable = false)
    public Integer getCodTipoLocal() {
        return codTipoLocal;
    }

    public void setCodTipoLocal(Integer codTipoLocal) {
        this.codTipoLocal = codTipoLocal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoTelefone that = (CntRelacionamentoTelefone) o;

        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (relacinamentoTelefoneId != that.relacinamentoTelefoneId) return false;
        if (índice != that.índice) return false;
        if (codTipoLocal != null ? !codTipoLocal.equals(that.codTipoLocal) : that.codTipoLocal != null) return false;
        if (ddd != null ? !ddd.equals(that.ddd) : that.ddd != null) return false;
        if (telefone != null ? !telefone.equals(that.telefone) : that.telefone != null) return false;
        if (telefoneObs != null ? !telefoneObs.equals(that.telefoneObs) : that.telefoneObs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (relacinamentoTelefoneId ^ (relacinamentoTelefoneId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codRelacionamento;
        result = 31 * result + índice;
        result = 31 * result + (ddd != null ? ddd.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (telefoneObs != null ? telefoneObs.hashCode() : 0);
        result = 31 * result + (codTipoLocal != null ? codTipoLocal.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodTipoLocal", referencedColumnName = "CodTipoLocal" , nullable = false)})
//    public CntTipoLocal getCntTipoLocal() {
//        return cntTipoLocal;
//    }
//
//    public void setCntTipoLocal(CntTipoLocal cntTipoLocal) {
//        this.cntTipoLocal = cntTipoLocal;
//    }
}
