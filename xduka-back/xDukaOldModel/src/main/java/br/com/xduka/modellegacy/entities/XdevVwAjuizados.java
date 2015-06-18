package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(XdevVwAjuizadosPK.class)
@Table(name = "xdev_vw_ajuizados", schema = "dbo")
public class XdevVwAjuizados {
    private int codCurso;
    private String turma;
    private int codUnidade;
    private int matrícula;
    private long codMovimento;
    private int parcela;
    private Timestamp dataVencimento;
    private BigDecimal pagoValor;
    private BigDecimal pagarValor;

    @Id
    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Id
    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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
    @Column(name = "Matrícula", nullable = false, insertable = true, updatable = true)
    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    @Id
    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Id
    @Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    @Basic
    @Column(name = "dataVencimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Timestamp dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Basic
    @Column(name = "PagoValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagoValor() {
        return pagoValor;
    }

    public void setPagoValor(BigDecimal pagoValor) {
        this.pagoValor = pagoValor;
    }

    @Basic
    @Column(name = "PagarValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagarValor() {
        return pagarValor;
    }

    public void setPagarValor(BigDecimal pagarValor) {
        this.pagarValor = pagarValor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XdevVwAjuizados that = (XdevVwAjuizados) o;

        if (codCurso != that.codCurso) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (matrícula != that.matrícula) return false;
        if (parcela != that.parcela) return false;
        if (dataVencimento != null ? !dataVencimento.equals(that.dataVencimento) : that.dataVencimento != null)
            return false;
        if (pagarValor != null ? !pagarValor.equals(that.pagarValor) : that.pagarValor != null) return false;
        if (pagoValor != null ? !pagoValor.equals(that.pagoValor) : that.pagoValor != null) return false;
        if (turma != null ? !turma.equals(that.turma) : that.turma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codCurso;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + matrícula;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + parcela;
        result = 31 * result + (dataVencimento != null ? dataVencimento.hashCode() : 0);
        result = 31 * result + (pagoValor != null ? pagoValor.hashCode() : 0);
        result = 31 * result + (pagarValor != null ? pagarValor.hashCode() : 0);
        return result;
    }
}
