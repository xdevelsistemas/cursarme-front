package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class SgrUsuárioSistema {
    private String codSistema;
    private String sistema;
    private boolean utilizado;
    private String arquivo;

    @Id
    @Column(name = "CodSistema", nullable = false, insertable = true, updatable = true)
    public String getCodSistema() {
        return codSistema;
    }

    public void setCodSistema(String codSistema) {
        this.codSistema = codSistema;
    }

    @Basic
    @Column(name = "Sistema", nullable = true, insertable = true, updatable = true)
    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    @Basic
    @Column(name = "Utilizado", nullable = false, insertable = true, updatable = true)
    public boolean isUtilizado() {
        return utilizado;
    }

    public void setUtilizado(boolean utilizado) {
        this.utilizado = utilizado;
    }

    @Basic
    @Column(name = "Arquivo", nullable = true, insertable = true, updatable = true)
    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrUsuárioSistema that = (SgrUsuárioSistema) o;

        if (utilizado != that.utilizado) return false;
        if (arquivo != null ? !arquivo.equals(that.arquivo) : that.arquivo != null) return false;
        if (codSistema != null ? !codSistema.equals(that.codSistema) : that.codSistema != null) return false;
        if (sistema != null ? !sistema.equals(that.sistema) : that.sistema != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codSistema != null ? codSistema.hashCode() : 0;
        result = 31 * result + (sistema != null ? sistema.hashCode() : 0);
        result = 31 * result + (utilizado ? 1 : 0);
        result = 31 * result + (arquivo != null ? arquivo.hashCode() : 0);
        return result;
    }
}
