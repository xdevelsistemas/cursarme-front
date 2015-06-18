package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrDiferencaPK.class)
public class CbrDiferenca {
    private long diferençaId;
    private int codUnidade;
    private long codMovimento;
    private int codDiferença;
    private int codMotivo;
    private int codPagante;
    private Integer anoLetivo;
    private Integer matrícula;
    private boolean condicional;
    private BigDecimal diferençaValor;
    private Timestamp lançamentoData;
    private boolean cancelada;
    private Timestamp canceladaData;
    private String observação;
    private Long codMovimentoCob;
//    private CbrDiferencaMotivo cbrDiferencaMotivo;
//    private List<CbrDiferencaMes> cbrDiferençaMêses;

    @Basic
    @Column(name = "Diferença_ID", nullable = false, insertable = true, updatable = true)
    public long getDiferençaId() {
        return diferençaId;
    }

    public void setDiferençaId(long diferençaId) {
        this.diferençaId = diferençaId;
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
    @Column(name = "CodMovimento", nullable = false, insertable = true, updatable = true)
    public long getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(long codMovimento) {
        this.codMovimento = codMovimento;
    }

    @Id
    @Column(name = "CodDiferença", nullable = false, insertable = true, updatable = true)
    public int getCodDiferença() {
        return codDiferença;
    }

    public void setCodDiferença(int codDiferença) {
        this.codDiferença = codDiferença;
    }

    @Basic
    @Column(name = "CodMotivo", nullable = false, insertable = true, updatable = true)
    public int getCodMotivo() {
        return codMotivo;
    }

    public void setCodMotivo(int codMotivo) {
        this.codMotivo = codMotivo;
    }

    @Basic
    @Column(name = "CodPagante", nullable = false, insertable = true, updatable = true)
    public int getCodPagante() {
        return codPagante;
    }

    public void setCodPagante(int codPagante) {
        this.codPagante = codPagante;
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
    @Column(name = "Condicional", nullable = false, insertable = true, updatable = true)
    public boolean isCondicional() {
        return condicional;
    }

    public void setCondicional(boolean condicional) {
        this.condicional = condicional;
    }

    @Basic
    @Column(name = "DiferençaValor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getDiferençaValor() {
        return diferençaValor;
    }

    public void setDiferençaValor(BigDecimal diferençaValor) {
        this.diferençaValor = diferençaValor;
    }

    @Basic
    @Column(name = "LançamentoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getLançamentoData() {
        return lançamentoData;
    }

    public void setLançamentoData(Timestamp lançamentoData) {
        this.lançamentoData = lançamentoData;
    }

    @Basic
    @Column(name = "Cancelada", nullable = false, insertable = true, updatable = true)
    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    @Basic
    @Column(name = "CanceladaData", nullable = true, insertable = true, updatable = true)
    public Timestamp getCanceladaData() {
        return canceladaData;
    }

    public void setCanceladaData(Timestamp canceladaData) {
        this.canceladaData = canceladaData;
    }

    @Basic
    @Column(name = "Observação", nullable = true, insertable = true, updatable = true)
    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    @Basic
    @Column(name = "CodMovimentoCob", nullable = true, insertable = true, updatable = true)
    public Long getCodMovimentoCob() {
        return codMovimentoCob;
    }

    public void setCodMovimentoCob(Long codMovimentoCob) {
        this.codMovimentoCob = codMovimentoCob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrDiferenca that = (CbrDiferenca) o;

        if (cancelada != that.cancelada) return false;
        if (codDiferença != that.codDiferença) return false;
        if (codMotivo != that.codMotivo) return false;
        if (codMovimento != that.codMovimento) return false;
        if (codPagante != that.codPagante) return false;
        if (codUnidade != that.codUnidade) return false;
        if (condicional != that.condicional) return false;
        if (diferençaId != that.diferençaId) return false;
        if (anoLetivo != null ? !anoLetivo.equals(that.anoLetivo) : that.anoLetivo != null) return false;
        if (canceladaData != null ? !canceladaData.equals(that.canceladaData) : that.canceladaData != null)
            return false;
        if (codMovimentoCob != null ? !codMovimentoCob.equals(that.codMovimentoCob) : that.codMovimentoCob != null)
            return false;
        if (diferençaValor != null ? !diferençaValor.equals(that.diferençaValor) : that.diferençaValor != null)
            return false;
        if (lançamentoData != null ? !lançamentoData.equals(that.lançamentoData) : that.lançamentoData != null)
            return false;
        if (matrícula != null ? !matrícula.equals(that.matrícula) : that.matrícula != null) return false;
        if (observação != null ? !observação.equals(that.observação) : that.observação != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (diferençaId ^ (diferençaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) (codMovimento ^ (codMovimento >>> 32));
        result = 31 * result + codDiferença;
        result = 31 * result + codMotivo;
        result = 31 * result + codPagante;
        result = 31 * result + (anoLetivo != null ? anoLetivo.hashCode() : 0);
        result = 31 * result + (matrícula != null ? matrícula.hashCode() : 0);
        result = 31 * result + (condicional ? 1 : 0);
        result = 31 * result + (diferençaValor != null ? diferençaValor.hashCode() : 0);
        result = 31 * result + (lançamentoData != null ? lançamentoData.hashCode() : 0);
        result = 31 * result + (cancelada ? 1 : 0);
        result = 31 * result + (canceladaData != null ? canceladaData.hashCode() : 0);
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        result = 31 * result + (codMovimentoCob != null ? codMovimentoCob.hashCode() : 0);
        return result;
    }

//    @ManyToOne
//    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodMotivo", referencedColumnName = "CodMotivo", nullable = false)})
//    public CbrDiferencaMotivo getCbrDiferencaMotivo() {
//        return cbrDiferencaMotivo;
//    }
//
//    public void setCbrDiferencaMotivo(CbrDiferencaMotivo cbrDiferencaMotivo) {
//        this.cbrDiferencaMotivo = cbrDiferencaMotivo;
//    }

//    @OneToMany(mappedBy = "cbrDiferenca")
//    public List<CbrDiferencaMes> getCbrDiferençaMêses() {
//        return cbrDiferençaMêses;
//    }
//
//    public void setCbrDiferençaMêses(List<CbrDiferencaMes> cbrDiferençaMêses) {
//        this.cbrDiferençaMêses = cbrDiferençaMêses;
//    }
}
