package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */

public class XdevbiFinanceiroPK implements Serializable{

    private String curso;

    @Id
    @javax.persistence.Column(name = "Curso", nullable = true, insertable = true, updatable = true)
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    private String nomeAluno;

    @Id
    @javax.persistence.Column(name = "NomeAluno", nullable = true, insertable = true, updatable = true)
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    private BigDecimal pagarValor;

    @Id
    @javax.persistence.Column(name = "PagarValor", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagarValor() {
        return pagarValor;
    }

    public void setPagarValor(BigDecimal pagarValor) {
        this.pagarValor = pagarValor;
    }

    private int parcela;

    @Id
    @javax.persistence.Column(name = "Parcela", nullable = false, insertable = true, updatable = true)
    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }



    private BigDecimal valorPagoCorrigido;

    @Id
    @javax.persistence.Column(name = "ValorPagoCorrigido", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorPagoCorrigido() {
        return valorPagoCorrigido;
    }

    public void setValorPagoCorrigido(BigDecimal valorPagoCorrigido) {
        this.valorPagoCorrigido = valorPagoCorrigido;
    }


    private Timestamp dataVencimento;

    @Id
    @javax.persistence.Column(name = "DataVencimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Timestamp dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XdevbiFinanceiroPK that = (XdevbiFinanceiroPK) o;

        if (parcela != that.parcela) return false;
        if (dataVencimento != null ? !dataVencimento.equals(that.dataVencimento) : that.dataVencimento != null)
            return false;
        if (nomeAluno != null ? !nomeAluno.equals(that.nomeAluno) : that.nomeAluno != null) return false;
        if (pagarValor != null ? !pagarValor.equals(that.pagarValor) : that.pagarValor != null) return false;
        if (valorPagoCorrigido != null ? !valorPagoCorrigido.equals(that.valorPagoCorrigido) : that.valorPagoCorrigido != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (nomeAluno != null ? nomeAluno.hashCode() : 0);
        result = 31 * result + (curso != null ? curso.hashCode() : 0);
        result = 31 * result + (pagarValor != null ? pagarValor.hashCode() : 0);
        result = 31 * result + parcela;
        result = 31 * result + (valorPagoCorrigido != null ? valorPagoCorrigido.hashCode() : 0);
        result = 31 * result + (dataVencimento != null ? dataVencimento.hashCode() : 0);
        return result;
    }
}
