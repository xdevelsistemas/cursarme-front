package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "xdev_cbrItemRemessa", schema = "dbo")
public class XdevCbrItemRemessa {
    private int id;
    private long codMovimento;
    private int parcela;
    private int remessaId;
    private int codUnidade;
    private int statusItem;
    private String nnumero;
    private XdevCbrLoteRemessa xdevCbrLoteRemessa;
    private List<XdevCbrItemRemessaEvento> xdevCbrItemRemessaEventos;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Basic
    @Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    @Basic
    @Column(name = "remessa_id", nullable = false, insertable = false, updatable = false)
    public int getRemessaId() {
        return remessaId;
    }

    public void setRemessaId(int remessaId) {
        this.remessaId = remessaId;
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
    @Column(name = "status_item", nullable = false, insertable = true, updatable = true)
    public int getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(int statusItem) {
        this.statusItem = statusItem;
    }

    @Basic
    @Column(name = "nnumero", nullable = false, insertable = true, updatable = true, length = 50)
    public String getNnumero() {
        return nnumero;
    }

    public void setNnumero(String nnumero) {
        this.nnumero = nnumero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XdevCbrItemRemessa that = (XdevCbrItemRemessa) o;

        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (id != that.id) return false;
        if (parcela != that.parcela) return false;
        if (remessaId != that.remessaId) return false;
        if (statusItem != that.statusItem) return false;
        if (nnumero != null ? !nnumero.equals(that.nnumero) : that.nnumero != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + parcela;
        result = 31 * result + remessaId;
        result = 31 * result + codUnidade;
        result = 31 * result + statusItem;
        result = 31 * result + (nnumero != null ? nnumero.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "remessa_id", referencedColumnName = "id", nullable = false)
    public XdevCbrLoteRemessa getXdevCbrLoteRemessa() {
        return xdevCbrLoteRemessa;
    }

    public void setXdevCbrLoteRemessa(XdevCbrLoteRemessa xdevCbrLoteRemessa) {
        this.xdevCbrLoteRemessa = xdevCbrLoteRemessa;
    }

    @OneToMany(mappedBy = "xdevCbrItemRemessa")
    public List<XdevCbrItemRemessaEvento> getXdevCbrItemRemessaEventos() {
        return xdevCbrItemRemessaEventos;
    }

    public void setXdevCbrItemRemessaEventos(List<XdevCbrItemRemessaEvento> xdevCbrItemRemessaEventos) {
        this.xdevCbrItemRemessaEventos = xdevCbrItemRemessaEventos;
    }
}
