package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "xdev_cbrItemRemessaEvento", schema = "dbo", catalog = "xDuka")
public class XdevCbrItemRemessaEvento {
    private int id;
    private int idItemCobranca;
    private String numEvento;
    private String txtEvento;
    private String conteudoEvento;
    private XdevCbrItemRemessa xdevCbrItemRemessa;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_item_cobranca", nullable = false, insertable = false, updatable = false)
    public int getIdItemCobranca() {
        return idItemCobranca;
    }

    public void setIdItemCobranca(int idItemCobranca) {
        this.idItemCobranca = idItemCobranca;
    }

    @Basic
    @Column(name = "num_evento", nullable = false, insertable = true, updatable = true, length = 10)
    public String getNumEvento() {
        return numEvento;
    }

    public void setNumEvento(String numEvento) {
        this.numEvento = numEvento;
    }

    @Basic
    @Column(name = "txt_evento", nullable = false, insertable = true, updatable = true, length = 4000)
    public String getTxtEvento() {
        return txtEvento;
    }

    public void setTxtEvento(String txtEvento) {
        this.txtEvento = txtEvento;
    }

    @Basic
    @Column(name = "conteudo_evento", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getConteudoEvento() {
        return conteudoEvento;
    }

    public void setConteudoEvento(String conteudoEvento) {
        this.conteudoEvento = conteudoEvento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XdevCbrItemRemessaEvento that = (XdevCbrItemRemessaEvento) o;

        if (id != that.id) return false;
        if (idItemCobranca != that.idItemCobranca) return false;
        if (conteudoEvento != null ? !conteudoEvento.equals(that.conteudoEvento) : that.conteudoEvento != null)
            return false;
        if (numEvento != null ? !numEvento.equals(that.numEvento) : that.numEvento != null) return false;
        if (txtEvento != null ? !txtEvento.equals(that.txtEvento) : that.txtEvento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idItemCobranca;
        result = 31 * result + (numEvento != null ? numEvento.hashCode() : 0);
        result = 31 * result + (txtEvento != null ? txtEvento.hashCode() : 0);
        result = 31 * result + (conteudoEvento != null ? conteudoEvento.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_item_cobranca", referencedColumnName = "id", nullable = false)
    public XdevCbrItemRemessa getXdevCbrItemRemessa() {
        return xdevCbrItemRemessa;
    }

    public void setXdevCbrItemRemessa(XdevCbrItemRemessa xdevCbrItemRemessa) {
        this.xdevCbrItemRemessa = xdevCbrItemRemessa;
    }
}
