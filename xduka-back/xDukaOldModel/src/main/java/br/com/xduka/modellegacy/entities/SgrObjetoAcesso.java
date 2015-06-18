package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class SgrObjetoAcesso {
    private long objetoAcessoId;
    private int codObjeto;
    private int codUnidade;
    private int idUsuário;
    private Timestamp data;
    private String ip;
    private String url;
    private String urlOrigem;
//    private SgrObjetoUnidade sgrObjetoUnidade;

    @Id
    @Column(name = "ObjetoAcesso_ID", nullable = false, insertable = true, updatable = true)
    public long getObjetoAcessoId() {
        return objetoAcessoId;
    }

    public void setObjetoAcessoId(long objetoAcessoId) {
        this.objetoAcessoId = objetoAcessoId;
    }

    @Basic
    @Column(name = "CodObjeto", nullable = false, insertable = false, updatable = false)
    public int getCodObjeto() {
        return codObjeto;
    }

    public void setCodObjeto(int codObjeto) {
        this.codObjeto = codObjeto;
    }

    @Basic
    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
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
    @Column(name = "Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "IP", nullable = true, insertable = true, updatable = true)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
    @Column(name = "UrlOrigem", nullable = true, insertable = true, updatable = true)
    public String getUrlOrigem() {
        return urlOrigem;
    }

    public void setUrlOrigem(String urlOrigem) {
        this.urlOrigem = urlOrigem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrObjetoAcesso that = (SgrObjetoAcesso) o;

        if (codObjeto != that.codObjeto) return false;
        if (codUnidade != that.codUnidade) return false;
        if (idUsuário != that.idUsuário) return false;
        if (objetoAcessoId != that.objetoAcessoId) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (urlOrigem != null ? !urlOrigem.equals(that.urlOrigem) : that.urlOrigem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (objetoAcessoId ^ (objetoAcessoId >>> 32));
        result = 31 * result + codObjeto;
        result = 31 * result + codUnidade;
        result = 31 * result + idUsuário;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (urlOrigem != null ? urlOrigem.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodObjeto", referencedColumnName = "CodObjeto", nullable = false), @JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false)})
//    public SgrObjetoUnidade getSgrObjetoUnidade() {
//        return sgrObjetoUnidade;
//    }
//
//    public void setSgrObjetoUnidade(SgrObjetoUnidade sgrObjetoUnidade) {
//        this.sgrObjetoUnidade = sgrObjetoUnidade;
//    }
}
