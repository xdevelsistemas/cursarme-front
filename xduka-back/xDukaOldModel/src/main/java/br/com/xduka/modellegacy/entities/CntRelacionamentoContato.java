package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntRelacionamentoContatoPK.class)
public class CntRelacionamentoContato {
    private long relacionamentoContatoId;
    private int codUnidade;
    private int codRelacionamento;
    private int codContato;
    private String contato;
    private boolean correpondência;
    private String contatoCargo;
    private String email;
    private String pronomeTratamento;

    @Basic
    @Column(name = "RelacionamentoContato_ID", nullable = false, insertable = true, updatable = true)
    public long getRelacionamentoContatoId() {
        return relacionamentoContatoId;
    }

    public void setRelacionamentoContatoId(long relacionamentoContatoId) {
        this.relacionamentoContatoId = relacionamentoContatoId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
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
    @Column(name = "CodContato", nullable = false, insertable = true, updatable = true)
    public int getCodContato() {
        return codContato;
    }

    public void setCodContato(int codContato) {
        this.codContato = codContato;
    }

    @Basic
    @Column(name = "Contato", nullable = true, insertable = true, updatable = true)
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Basic
    @Column(name = "Correpondência", nullable = false, insertable = true, updatable = true)
    public boolean isCorrepondência() {
        return correpondência;
    }

    public void setCorrepondência(boolean correpondência) {
        this.correpondência = correpondência;
    }

    @Basic
    @Column(name = "ContatoCargo", nullable = true, insertable = true, updatable = true)
    public String getContatoCargo() {
        return contatoCargo;
    }

    public void setContatoCargo(String contatoCargo) {
        this.contatoCargo = contatoCargo;
    }

    @Basic
    @Column(name = "email", nullable = true, insertable = true, updatable = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "PronomeTratamento", nullable = true, insertable = true, updatable = true)
    public String getPronomeTratamento() {
        return pronomeTratamento;
    }

    public void setPronomeTratamento(String pronomeTratamento) {
        this.pronomeTratamento = pronomeTratamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamentoContato that = (CntRelacionamentoContato) o;

        if (codContato != that.codContato) return false;
        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (correpondência != that.correpondência) return false;
        if (relacionamentoContatoId != that.relacionamentoContatoId) return false;
        if (contato != null ? !contato.equals(that.contato) : that.contato != null) return false;
        if (contatoCargo != null ? !contatoCargo.equals(that.contatoCargo) : that.contatoCargo != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (pronomeTratamento != null ? !pronomeTratamento.equals(that.pronomeTratamento) : that.pronomeTratamento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (relacionamentoContatoId ^ (relacionamentoContatoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codRelacionamento;
        result = 31 * result + codContato;
        result = 31 * result + (contato != null ? contato.hashCode() : 0);
        result = 31 * result + (correpondência ? 1 : 0);
        result = 31 * result + (contatoCargo != null ? contatoCargo.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (pronomeTratamento != null ? pronomeTratamento.hashCode() : 0);
        return result;
    }
}
