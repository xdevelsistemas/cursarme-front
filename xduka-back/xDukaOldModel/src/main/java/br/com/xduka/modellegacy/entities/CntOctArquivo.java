package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntOctArquivoPK.class)
public class CntOctArquivo {
    private String arquivo;
    private boolean importado;
    private Timestamp dataMovimento;
    private Integer númeroTítulos;
    private Integer númeroErros;
    private int codUnidade;
    private String arquivoLido;

    @Id
    @Column(name = "Arquivo", nullable = false, insertable = true, updatable = true)
    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    @Basic
    @Column(name = "Importado", nullable = false, insertable = true, updatable = true)
    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    @Id
    @Column(name = "DataMovimento", nullable = false, insertable = true, updatable = true)
    public Timestamp getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Timestamp dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    @Basic
    @Column(name = "NúmeroTítulos", nullable = true, insertable = true, updatable = true)
    public Integer getNúmeroTítulos() {
        return númeroTítulos;
    }

    public void setNúmeroTítulos(Integer númeroTítulos) {
        this.númeroTítulos = númeroTítulos;
    }

    @Basic
    @Column(name = "NúmeroErros", nullable = true, insertable = true, updatable = true)
    public Integer getNúmeroErros() {
        return númeroErros;
    }

    public void setNúmeroErros(Integer númeroErros) {
        this.númeroErros = númeroErros;
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
    @Column(name = "ArquivoLido", nullable = false, insertable = true, updatable = true)
    public String getArquivoLido() {
        return arquivoLido;
    }

    public void setArquivoLido(String arquivoLido) {
        this.arquivoLido = arquivoLido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntOctArquivo that = (CntOctArquivo) o;

        if (codUnidade != that.codUnidade) return false;
        if (importado != that.importado) return false;
        if (arquivo != null ? !arquivo.equals(that.arquivo) : that.arquivo != null) return false;
        if (arquivoLido != null ? !arquivoLido.equals(that.arquivoLido) : that.arquivoLido != null) return false;
        if (dataMovimento != null ? !dataMovimento.equals(that.dataMovimento) : that.dataMovimento != null)
            return false;
        if (númeroErros != null ? !númeroErros.equals(that.númeroErros) : that.númeroErros != null) return false;
        if (númeroTítulos != null ? !númeroTítulos.equals(that.númeroTítulos) : that.númeroTítulos != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = arquivo != null ? arquivo.hashCode() : 0;
        result = 31 * result + (importado ? 1 : 0);
        result = 31 * result + (dataMovimento != null ? dataMovimento.hashCode() : 0);
        result = 31 * result + (númeroTítulos != null ? númeroTítulos.hashCode() : 0);
        result = 31 * result + (númeroErros != null ? númeroErros.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + (arquivoLido != null ? arquivoLido.hashCode() : 0);
        return result;
    }
}
