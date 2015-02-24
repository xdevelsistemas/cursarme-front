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
public class SgrBackup {
    private long idBackup;
    private String arquivo;
    private String tamanho;
    private Timestamp data;
    private String endereço;
    private String url;

    @Id
    @Column(name = "IDBackup", nullable = false, insertable = true, updatable = true)
    public long getIdBackup() {
        return idBackup;
    }

    public void setIdBackup(long idBackup) {
        this.idBackup = idBackup;
    }

    @Basic
    @Column(name = "Arquivo", nullable = true, insertable = true, updatable = true)
    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    @Basic
    @Column(name = "Tamanho", nullable = true, insertable = true, updatable = true)
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
    @Column(name = "Endereço", nullable = true, insertable = true, updatable = true)
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Basic
    @Column(name = "Url", nullable = true, insertable = true, updatable = true)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrBackup sgrBackup = (SgrBackup) o;

        if (idBackup != sgrBackup.idBackup) return false;
        if (arquivo != null ? !arquivo.equals(sgrBackup.arquivo) : sgrBackup.arquivo != null) return false;
        if (data != null ? !data.equals(sgrBackup.data) : sgrBackup.data != null) return false;
        if (endereço != null ? !endereço.equals(sgrBackup.endereço) : sgrBackup.endereço != null) return false;
        if (tamanho != null ? !tamanho.equals(sgrBackup.tamanho) : sgrBackup.tamanho != null) return false;
        if (url != null ? !url.equals(sgrBackup.url) : sgrBackup.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idBackup ^ (idBackup >>> 32));
        result = 31 * result + (arquivo != null ? arquivo.hashCode() : 0);
        result = 31 * result + (tamanho != null ? tamanho.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (endereço != null ? endereço.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
