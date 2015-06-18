package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
public class CntOctArquivoPK implements Serializable {
    private String arquivo;

    @Column(name = "Arquivo", nullable = false, insertable = true, updatable = true)
    @Id
    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    private Timestamp dataMovimento;

    @Column(name = "DataMovimento", nullable = false, insertable = true, updatable = true)
    @Id
    public Timestamp getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Timestamp dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private String arquivoLido;

    @Column(name = "ArquivoLido", nullable = false, insertable = true, updatable = true)
    @Id
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

        CntOctArquivoPK that = (CntOctArquivoPK) o;

        if (codUnidade != that.codUnidade) return false;
        if (arquivo != null ? !arquivo.equals(that.arquivo) : that.arquivo != null) return false;
        if (arquivoLido != null ? !arquivoLido.equals(that.arquivoLido) : that.arquivoLido != null) return false;
        if (dataMovimento != null ? !dataMovimento.equals(that.dataMovimento) : that.dataMovimento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = arquivo != null ? arquivo.hashCode() : 0;
        result = 31 * result + (dataMovimento != null ? dataMovimento.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + (arquivoLido != null ? arquivoLido.hashCode() : 0);
        return result;
    }
}
