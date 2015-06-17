package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@IdClass(XdevbiFinanceiroPK.class)
@Entity
@javax.persistence.Table(name = "xdevbi_financeiro", schema = "dbo")
public class XdevbiFinanceiro {
    private BigDecimal abatimento;

    @Basic
    @javax.persistence.Column(name = "Abatimento", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAbatimento() {
        return abatimento;
    }

    public void setAbatimento(BigDecimal abatimento) {
        this.abatimento = abatimento;
    }

    private BigDecimal acréscimo;

    @Basic
    @javax.persistence.Column(name = "Acréscimo", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAcréscimo() {
        return acréscimo;
    }

    public void setAcréscimo(BigDecimal acréscimo) {
        this.acréscimo = acréscimo;
    }

    private BigDecimal acréscimoProgramado;

    @Basic
    @javax.persistence.Column(name = "AcréscimoProgramado", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getAcréscimoProgramado() {
        return acréscimoProgramado;
    }

    public void setAcréscimoProgramado(BigDecimal acréscimoProgramado) {
        this.acréscimoProgramado = acréscimoProgramado;
    }

    private Integer anoLcto;

    @Basic
    @javax.persistence.Column(name = "AnoLcto", nullable = true, insertable = true, updatable = true)
    public Integer getAnoLcto() {
        return anoLcto;
    }

    public void setAnoLcto(Integer anoLcto) {
        this.anoLcto = anoLcto;
    }

    private Integer anoPgto;

    @Basic
    @javax.persistence.Column(name = "AnoPgto", nullable = true, insertable = true, updatable = true)
    public Integer getAnoPgto() {
        return anoPgto;
    }

    public void setAnoPgto(Integer anoPgto) {
        this.anoPgto = anoPgto;
    }

    private String anoRef;

    @Basic
    @javax.persistence.Column(name = "AnoRef", nullable = true, insertable = true, updatable = true, length = 4)
    public String getAnoRef() {
        return anoRef;
    }

    public void setAnoRef(String anoRef) {
        this.anoRef = anoRef;
    }

    private BigDecimal bolsa;

    @Basic
    @javax.persistence.Column(name = "Bolsa", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getBolsa() {
        return bolsa;
    }

    public void setBolsa(BigDecimal bolsa) {
        this.bolsa = bolsa;
    }

    private BigDecimal bolsaCondicional;

    @Basic
    @javax.persistence.Column(name = "BolsaCondicional", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getBolsaCondicional() {
        return bolsaCondicional;
    }

    public void setBolsaCondicional(BigDecimal bolsaCondicional) {
        this.bolsaCondicional = bolsaCondicional;
    }

    private String caixa;

    @Basic
    @javax.persistence.Column(name = "Caixa", nullable = true, insertable = true, updatable = true)
    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    private BigDecimal créditoTerceiro;

    @Basic
    @javax.persistence.Column(name = "CréditoTerceiro", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getCréditoTerceiro() {
        return créditoTerceiro;
    }

    public void setCréditoTerceiro(BigDecimal créditoTerceiro) {
        this.créditoTerceiro = créditoTerceiro;
    }

    private String curso;

    @Id
    @javax.persistence.Column(name = "Curso", nullable = true, insertable = true, updatable = true)
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    private String cursoAbreviado;

    @Basic
    @javax.persistence.Column(name = "CursoAbreviado", nullable = true, insertable = true, updatable = true)
    public String getCursoAbreviado() {
        return cursoAbreviado;
    }

    public void setCursoAbreviado(String cursoAbreviado) {
        this.cursoAbreviado = cursoAbreviado;
    }

    private String mesLcto;

    @Basic
    @javax.persistence.Column(name = "MesLcto", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMesLcto() {
        return mesLcto;
    }

    public void setMesLcto(String mesLcto) {
        this.mesLcto = mesLcto;
    }

    private String mesPgto;

    @Basic
    @javax.persistence.Column(name = "MesPgto", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMesPgto() {
        return mesPgto;
    }

    public void setMesPgto(String mesPgto) {
        this.mesPgto = mesPgto;
    }

    private String mesRef;

    @Basic
    @javax.persistence.Column(name = "MesRef", nullable = true, insertable = true, updatable = true, length = 50)
    public String getMesRef() {
        return mesRef;
    }

    public void setMesRef(String mesRef) {
        this.mesRef = mesRef;
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

    private Timestamp pagoData;

    @Basic
    @javax.persistence.Column(name = "PagoData", nullable = true, insertable = true, updatable = true)
    public Timestamp getPagoData() {
        return pagoData;
    }

    public void setPagoData(Timestamp pagoData) {
        this.pagoData = pagoData;
    }

    private BigDecimal pagoValor;

    @Basic
    @javax.persistence.Column(name = "PagoValor", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getPagoValor() {
        return pagoValor;
    }

    public void setPagoValor(BigDecimal pagoValor) {
        this.pagoValor = pagoValor;
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

    private String quitaçãoDescrição;

    @Basic
    @javax.persistence.Column(name = "QuitaçãoDescrição", nullable = true, insertable = true, updatable = true)
    public String getQuitaçãoDescrição() {
        return quitaçãoDescrição;
    }

    public void setQuitaçãoDescrição(String quitaçãoDescrição) {
        this.quitaçãoDescrição = quitaçãoDescrição;
    }

    private String tipoCobrança;

    @Basic
    @javax.persistence.Column(name = "TipoCobrança", nullable = true, insertable = true, updatable = true)
    public String getTipoCobrança() {
        return tipoCobrança;
    }

    public void setTipoCobrança(String tipoCobrança) {
        this.tipoCobrança = tipoCobrança;
    }

    private String turmaComplementoCompleta;

    @Basic
    @javax.persistence.Column(name = "TurmaComplementoCompleta", nullable = true, insertable = true, updatable = true)
    public String getTurmaComplementoCompleta() {
        return turmaComplementoCompleta;
    }

    public void setTurmaComplementoCompleta(String turmaComplementoCompleta) {
        this.turmaComplementoCompleta = turmaComplementoCompleta;
    }

    private BigDecimal valorAberto;

    @Basic
    @javax.persistence.Column(name = "ValorAberto", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorAberto() {
        return valorAberto;
    }

    public void setValorAberto(BigDecimal valorAberto) {
        this.valorAberto = valorAberto;
    }

    private BigDecimal valorCorrigido;

    @Basic
    @javax.persistence.Column(name = "ValorCorrigido", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorCorrigido() {
        return valorCorrigido;
    }

    public void setValorCorrigido(BigDecimal valorCorrigido) {
        this.valorCorrigido = valorCorrigido;
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

    private String unidade;

    @Basic
    @javax.persistence.Column(name = "Unidade", nullable = true, insertable = true, updatable = true)
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    private BigDecimal valorContabilizado;

    @Basic
    @javax.persistence.Column(name = "ValorContabilizado", nullable = false, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorContabilizado() {
        return valorContabilizado;
    }

    public void setValorContabilizado(BigDecimal valorContabilizado) {
        this.valorContabilizado = valorContabilizado;
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

        XdevbiFinanceiro that = (XdevbiFinanceiro) o;

        if (parcela != that.parcela) return false;
        if (abatimento != null ? !abatimento.equals(that.abatimento) : that.abatimento != null) return false;
        if (acréscimo != null ? !acréscimo.equals(that.acréscimo) : that.acréscimo != null) return false;
        if (acréscimoProgramado != null ? !acréscimoProgramado.equals(that.acréscimoProgramado) : that.acréscimoProgramado != null)
            return false;
        if (anoLcto != null ? !anoLcto.equals(that.anoLcto) : that.anoLcto != null) return false;
        if (anoPgto != null ? !anoPgto.equals(that.anoPgto) : that.anoPgto != null) return false;
        if (anoRef != null ? !anoRef.equals(that.anoRef) : that.anoRef != null) return false;
        if (bolsa != null ? !bolsa.equals(that.bolsa) : that.bolsa != null) return false;
        if (bolsaCondicional != null ? !bolsaCondicional.equals(that.bolsaCondicional) : that.bolsaCondicional != null)
            return false;
        if (caixa != null ? !caixa.equals(that.caixa) : that.caixa != null) return false;
        if (créditoTerceiro != null ? !créditoTerceiro.equals(that.créditoTerceiro) : that.créditoTerceiro != null)
            return false;
        if (curso != null ? !curso.equals(that.curso) : that.curso != null) return false;
        if (cursoAbreviado != null ? !cursoAbreviado.equals(that.cursoAbreviado) : that.cursoAbreviado != null)
            return false;
        if (dataVencimento != null ? !dataVencimento.equals(that.dataVencimento) : that.dataVencimento != null)
            return false;
        if (mesLcto != null ? !mesLcto.equals(that.mesLcto) : that.mesLcto != null) return false;
        if (mesPgto != null ? !mesPgto.equals(that.mesPgto) : that.mesPgto != null) return false;
        if (mesRef != null ? !mesRef.equals(that.mesRef) : that.mesRef != null) return false;
        if (nomeAluno != null ? !nomeAluno.equals(that.nomeAluno) : that.nomeAluno != null) return false;
        if (pagarValor != null ? !pagarValor.equals(that.pagarValor) : that.pagarValor != null) return false;
        if (pagoData != null ? !pagoData.equals(that.pagoData) : that.pagoData != null) return false;
        if (pagoValor != null ? !pagoValor.equals(that.pagoValor) : that.pagoValor != null) return false;
        if (quitaçãoDescrição != null ? !quitaçãoDescrição.equals(that.quitaçãoDescrição) : that.quitaçãoDescrição != null)
            return false;
        if (tipoCobrança != null ? !tipoCobrança.equals(that.tipoCobrança) : that.tipoCobrança != null) return false;
        if (turmaComplementoCompleta != null ? !turmaComplementoCompleta.equals(that.turmaComplementoCompleta) : that.turmaComplementoCompleta != null)
            return false;
        if (unidade != null ? !unidade.equals(that.unidade) : that.unidade != null) return false;
        if (valorAberto != null ? !valorAberto.equals(that.valorAberto) : that.valorAberto != null) return false;
        if (valorContabilizado != null ? !valorContabilizado.equals(that.valorContabilizado) : that.valorContabilizado != null)
            return false;
        if (valorCorrigido != null ? !valorCorrigido.equals(that.valorCorrigido) : that.valorCorrigido != null)
            return false;
        if (valorPagoCorrigido != null ? !valorPagoCorrigido.equals(that.valorPagoCorrigido) : that.valorPagoCorrigido != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = abatimento != null ? abatimento.hashCode() : 0;
        result = 31 * result + (acréscimo != null ? acréscimo.hashCode() : 0);
        result = 31 * result + (acréscimoProgramado != null ? acréscimoProgramado.hashCode() : 0);
        result = 31 * result + (anoLcto != null ? anoLcto.hashCode() : 0);
        result = 31 * result + (anoPgto != null ? anoPgto.hashCode() : 0);
        result = 31 * result + (anoRef != null ? anoRef.hashCode() : 0);
        result = 31 * result + (bolsa != null ? bolsa.hashCode() : 0);
        result = 31 * result + (bolsaCondicional != null ? bolsaCondicional.hashCode() : 0);
        result = 31 * result + (caixa != null ? caixa.hashCode() : 0);
        result = 31 * result + (créditoTerceiro != null ? créditoTerceiro.hashCode() : 0);
        result = 31 * result + (curso != null ? curso.hashCode() : 0);
        result = 31 * result + (cursoAbreviado != null ? cursoAbreviado.hashCode() : 0);
        result = 31 * result + (mesLcto != null ? mesLcto.hashCode() : 0);
        result = 31 * result + (mesPgto != null ? mesPgto.hashCode() : 0);
        result = 31 * result + (mesRef != null ? mesRef.hashCode() : 0);
        result = 31 * result + (nomeAluno != null ? nomeAluno.hashCode() : 0);
        result = 31 * result + (pagarValor != null ? pagarValor.hashCode() : 0);
        result = 31 * result + (pagoData != null ? pagoData.hashCode() : 0);
        result = 31 * result + (pagoValor != null ? pagoValor.hashCode() : 0);
        result = 31 * result + parcela;
        result = 31 * result + (quitaçãoDescrição != null ? quitaçãoDescrição.hashCode() : 0);
        result = 31 * result + (tipoCobrança != null ? tipoCobrança.hashCode() : 0);
        result = 31 * result + (turmaComplementoCompleta != null ? turmaComplementoCompleta.hashCode() : 0);
        result = 31 * result + (valorAberto != null ? valorAberto.hashCode() : 0);
        result = 31 * result + (valorCorrigido != null ? valorCorrigido.hashCode() : 0);
        result = 31 * result + (valorPagoCorrigido != null ? valorPagoCorrigido.hashCode() : 0);
        result = 31 * result + (unidade != null ? unidade.hashCode() : 0);
        result = 31 * result + (valorContabilizado != null ? valorContabilizado.hashCode() : 0);
        result = 31 * result + (dataVencimento != null ? dataVencimento.hashCode() : 0);
        return result;
    }
}
