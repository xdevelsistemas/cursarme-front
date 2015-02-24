package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "xdev_cbrLoteRemessa", schema = "dbo", catalog = "xDuka")
public class XdevCbrLoteRemessa {
    private int id;
    private String numRemessa;
    private Timestamp dtaGeracao;
    private String conteudoLote;
    private List<XdevCbrItemRemessa> xdevCbrItemRemessas;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "num_remessa", nullable = false, insertable = true, updatable = true)
    public String getNumRemessa() {
        return numRemessa;
    }

    public void setNumRemessa(String numRemessa) {
        this.numRemessa = numRemessa;
    }

    @Basic
    @Column(name = "dta_geracao", nullable = false, insertable = true, updatable = true)
    public Timestamp getDtaGeracao() {
        return dtaGeracao;
    }

    public void setDtaGeracao(Timestamp dtaGeracao) {
        this.dtaGeracao = dtaGeracao;
    }

    @Basic
    @Column(name = "conteudo_lote", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getConteudoLote() {
        return conteudoLote;
    }

    public void setConteudoLote(String conteudoLote) {
        this.conteudoLote = conteudoLote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XdevCbrLoteRemessa that = (XdevCbrLoteRemessa) o;

        if (id != that.id) return false;
        if (conteudoLote != null ? !conteudoLote.equals(that.conteudoLote) : that.conteudoLote != null) return false;
        if (dtaGeracao != null ? !dtaGeracao.equals(that.dtaGeracao) : that.dtaGeracao != null) return false;
        if (numRemessa != null ? !numRemessa.equals(that.numRemessa) : that.numRemessa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (numRemessa != null ? numRemessa.hashCode() : 0);
        result = 31 * result + (dtaGeracao != null ? dtaGeracao.hashCode() : 0);
        result = 31 * result + (conteudoLote != null ? conteudoLote.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "xdevCbrLoteRemessa")
    public List<XdevCbrItemRemessa> getXdevCbrItemRemessas() {
        return xdevCbrItemRemessas;
    }

    public void setXdevCbrItemRemessas(List<XdevCbrItemRemessa> xdevCbrItemRemessas) {
        this.xdevCbrItemRemessas = xdevCbrItemRemessas;
    }
}
