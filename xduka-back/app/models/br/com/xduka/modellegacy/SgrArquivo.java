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
public class SgrArquivo {
    private long idArquivo;
    private int idUsuário;
    private String arquivo;
    private String endereço;
    private String url;
    private Timestamp dataCriação;
    private Timestamp dataModificação;
    private Long tamanho;
    private String extensão;
    private String tipo;
    private String comentário;
    private boolean excluído;
    private Timestamp excluídoData;
    private Boolean institucional;

    @Id
    @Column(name = "IDArquivo", nullable = false, insertable = true, updatable = true)
    public long getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(long idArquivo) {
        this.idArquivo = idArquivo;
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
    @Column(name = "Arquivo", nullable = false, insertable = true, updatable = true)
    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    @Basic
    @Column(name = "Endereço", nullable = false, insertable = true, updatable = true)
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Basic
    @Column(name = "Url", nullable = false, insertable = true, updatable = true)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "DataCriação", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataCriação() {
        return dataCriação;
    }

    public void setDataCriação(Timestamp dataCriação) {
        this.dataCriação = dataCriação;
    }

    @Basic
    @Column(name = "DataModificação", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataModificação() {
        return dataModificação;
    }

    public void setDataModificação(Timestamp dataModificação) {
        this.dataModificação = dataModificação;
    }

    @Basic
    @Column(name = "Tamanho", nullable = true, insertable = true, updatable = true)
    public Long getTamanho() {
        return tamanho;
    }

    public void setTamanho(Long tamanho) {
        this.tamanho = tamanho;
    }

    @Basic
    @Column(name = "Extensão", nullable = true, insertable = true, updatable = true, length = 12)
    public String getExtensão() {
        return extensão;
    }

    public void setExtensão(String extensão) {
        this.extensão = extensão;
    }

    @Basic
    @Column(name = "Tipo", nullable = true, insertable = true, updatable = true, length = 255)
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Basic
    @Column(name = "Comentário", nullable = true, insertable = true, updatable = true)
    public String getComentário() {
        return comentário;
    }

    public void setComentário(String comentário) {
        this.comentário = comentário;
    }

    @Basic
    @Column(name = "Excluído", nullable = false, insertable = true, updatable = true)
    public boolean isExcluído() {
        return excluído;
    }

    public void setExcluído(boolean excluído) {
        this.excluído = excluído;
    }

    @Basic
    @Column(name = "ExcluídoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getExcluídoData() {
        return excluídoData;
    }

    public void setExcluídoData(Timestamp excluídoData) {
        this.excluídoData = excluídoData;
    }

    @Basic
    @Column(name = "Institucional", nullable = true, insertable = true, updatable = true)
    public Boolean getInstitucional() {
        return institucional;
    }

    public void setInstitucional(Boolean institucional) {
        this.institucional = institucional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrArquivo that = (SgrArquivo) o;

        if (excluído != that.excluído) return false;
        if (idArquivo != that.idArquivo) return false;
        if (idUsuário != that.idUsuário) return false;
        if (arquivo != null ? !arquivo.equals(that.arquivo) : that.arquivo != null) return false;
        if (comentário != null ? !comentário.equals(that.comentário) : that.comentário != null) return false;
        if (dataCriação != null ? !dataCriação.equals(that.dataCriação) : that.dataCriação != null) return false;
        if (dataModificação != null ? !dataModificação.equals(that.dataModificação) : that.dataModificação != null)
            return false;
        if (endereço != null ? !endereço.equals(that.endereço) : that.endereço != null) return false;
        if (excluídoData != null ? !excluídoData.equals(that.excluídoData) : that.excluídoData != null) return false;
        if (extensão != null ? !extensão.equals(that.extensão) : that.extensão != null) return false;
        if (institucional != null ? !institucional.equals(that.institucional) : that.institucional != null)
            return false;
        if (tamanho != null ? !tamanho.equals(that.tamanho) : that.tamanho != null) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idArquivo ^ (idArquivo >>> 32));
        result = 31 * result + idUsuário;
        result = 31 * result + (arquivo != null ? arquivo.hashCode() : 0);
        result = 31 * result + (endereço != null ? endereço.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (dataCriação != null ? dataCriação.hashCode() : 0);
        result = 31 * result + (dataModificação != null ? dataModificação.hashCode() : 0);
        result = 31 * result + (tamanho != null ? tamanho.hashCode() : 0);
        result = 31 * result + (extensão != null ? extensão.hashCode() : 0);
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + (comentário != null ? comentário.hashCode() : 0);
        result = 31 * result + (excluído ? 1 : 0);
        result = 31 * result + (excluídoData != null ? excluídoData.hashCode() : 0);
        result = 31 * result + (institucional != null ? institucional.hashCode() : 0);
        return result;
    }
}
