package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntOctQuitado {
    private long idQuitado;
    private String arquivo;
    private String númeroDoc;
    private Integer codUnidade;
    private Integer anoLetivo;
    private Integer matrícula;
    private Byte parcela;
    private Double pagoValor;
    private Timestamp pagoData;
    private Integer codCaixa;
    private Timestamp dataLeitura;

    @Id
    @Column(name = "IDQuitado", nullable = false, insertable = true, updatable = true)
    public long getIdQuitado() {
        return idQuitado;
    }

    public void setIdQuitado(long idQuitado) {
        this.idQuitado = idQuitado;
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
    @Column(name = "NúmeroDoc", nullable = true, insertable = true, updatable = true)
    public String getNúmeroDoc() {
        return númeroDoc;
    }

    public void setNúmeroDoc(String númeroDoc) {
        this.númeroDoc = númeroDoc;
    }

    @Basic
    @Column(name = "CodUnidade", nullable = true, insertable = true, updatable = true)
    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "AnoLetivo", nullable = true, insertable = true, updatable = true)
    public Integer getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(Integer anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Basic
    @Column(name = "Matrícula", nullable = true, insertable = true, updatable = true)
    public Integer getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(Integer matrícula) {
        this.matrícula = matrícula;
    }

    @Basic
    @Column(name = "Parcela", nullable = true, insertable = true, updatable = true)
    public Byte getParcela() {
        return parcela;
    }

    public void setParcela(Byte parcela) {
        this.parcela = parcela;
    }

    @Basic
    @Column(name = "PagoValor", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getPagoValor() {
        return pagoValor;
    }

    public void setPagoValor(Double pagoValor) {
        this.pagoValor = pagoValor;
    }

    @Basic
    @Column(name = "PagoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getPagoData() {
        return pagoData;
    }

    public void setPagoData(Timestamp pagoData) {
        this.pagoData = pagoData;
    }

    @Basic
    @Column(name = "CodCaixa", nullable = true, insertable = true, updatable = true)
    public Integer getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(Integer codCaixa) {
        this.codCaixa = codCaixa;
    }

    @Basic
    @Column(name = "DataLeitura", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(Timestamp dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntOctQuitado that = (CntOctQuitado) o;

        if (idQuitado != that.idQuitado) return false;
        if (anoLetivo != null ? !anoLetivo.equals(that.anoLetivo) : that.anoLetivo != null) return false;
        if (arquivo != null ? !arquivo.equals(that.arquivo) : that.arquivo != null) return false;
        if (codCaixa != null ? !codCaixa.equals(that.codCaixa) : that.codCaixa != null) return false;
        if (codUnidade != null ? !codUnidade.equals(that.codUnidade) : that.codUnidade != null) return false;
        if (dataLeitura != null ? !dataLeitura.equals(that.dataLeitura) : that.dataLeitura != null) return false;
        if (matrícula != null ? !matrícula.equals(that.matrícula) : that.matrícula != null) return false;
        if (númeroDoc != null ? !númeroDoc.equals(that.númeroDoc) : that.númeroDoc != null) return false;
        if (pagoData != null ? !pagoData.equals(that.pagoData) : that.pagoData != null) return false;
        if (pagoValor != null ? !pagoValor.equals(that.pagoValor) : that.pagoValor != null) return false;
        if (parcela != null ? !parcela.equals(that.parcela) : that.parcela != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idQuitado ^ (idQuitado >>> 32));
        result = 31 * result + (arquivo != null ? arquivo.hashCode() : 0);
        result = 31 * result + (númeroDoc != null ? númeroDoc.hashCode() : 0);
        result = 31 * result + (codUnidade != null ? codUnidade.hashCode() : 0);
        result = 31 * result + (anoLetivo != null ? anoLetivo.hashCode() : 0);
        result = 31 * result + (matrícula != null ? matrícula.hashCode() : 0);
        result = 31 * result + (parcela != null ? parcela.hashCode() : 0);
        result = 31 * result + (pagoValor != null ? pagoValor.hashCode() : 0);
        result = 31 * result + (pagoData != null ? pagoData.hashCode() : 0);
        result = 31 * result + (codCaixa != null ? codCaixa.hashCode() : 0);
        result = 31 * result + (dataLeitura != null ? dataLeitura.hashCode() : 0);
        return result;
    }
}
