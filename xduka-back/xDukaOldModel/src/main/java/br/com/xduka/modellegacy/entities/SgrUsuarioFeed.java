package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "sgrUsuárioFeed", schema = "dbo")
@IdClass(SgrUsuarioFeedPK.class)
public class SgrUsuarioFeed {
    private int idUsuário;
    private int codUnidade;
    private int codFeed;
    private String feed;
    private String url;
    private Timestamp data;
    private boolean excluído;
//    private SgrUsuarioUnidade sgrUsuarioUnidade;

    @Id
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
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
    @Column(name = "CodFeed", nullable = false, insertable = true, updatable = true)
    public int getCodFeed() {
        return codFeed;
    }

    public void setCodFeed(int codFeed) {
        this.codFeed = codFeed;
    }

    @Basic
    @Column(name = "Feed", nullable = true, insertable = true, updatable = true)
    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    @Basic
    @Column(name = "Url", nullable = true, insertable = true, updatable = true)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @Column(name = "Excluído", nullable = false, insertable = true, updatable = true)
    public boolean isExcluído() {
        return excluído;
    }

    public void setExcluído(boolean excluído) {
        this.excluído = excluído;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrUsuarioFeed that = (SgrUsuarioFeed) o;

        if (codFeed != that.codFeed) return false;
        if (codUnidade != that.codUnidade) return false;
        if (excluído != that.excluído) return false;
        if (idUsuário != that.idUsuário) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (feed != null ? !feed.equals(that.feed) : that.feed != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuário;
        result = 31 * result + codUnidade;
        result = 31 * result + codFeed;
        result = 31 * result + (feed != null ? feed.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (excluído ? 1 : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "IDUsuário", referencedColumnName = "IDUsuário", nullable = false), @JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false)})
//    public SgrUsuarioUnidade getSgrUsuarioUnidade() {
//        return sgrUsuarioUnidade;
//    }
//
//    public void setSgrUsuarioUnidade(SgrUsuarioUnidade sgrUsuarioUnidade) {
//        this.sgrUsuarioUnidade = sgrUsuarioUnidade;
//    }
}
