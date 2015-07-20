package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntOct {
    private int idOct;

    @Id
    @javax.persistence.Column(name = "IDOct", nullable = false, insertable = true, updatable = true)
    public int getIdOct() {
        return idOct;
    }

    public void setIdOct(int idOct) {
        this.idOct = idOct;
    }

    private String arquivo;

    @Basic
    @javax.persistence.Column(name = "Arquivo", nullable = true, insertable = true, updatable = true)
    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    private String númeroDoc;

    @Basic
    @javax.persistence.Column(name = "NúmeroDoc", nullable = true, insertable = true, updatable = true)
    public String getNúmeroDoc() {
        return númeroDoc;
    }

    public void setNúmeroDoc(String númeroDoc) {
        this.númeroDoc = númeroDoc;
    }

    private Short ano;

    @Basic
    @javax.persistence.Column(name = "Ano", nullable = true, insertable = true, updatable = true)
    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        this.ano = ano;
    }

    private Integer matrícula;

    @Basic
    @javax.persistence.Column(name = "Matrícula", nullable = true, insertable = true, updatable = true)
    public Integer getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(Integer matrícula) {
        this.matrícula = matrícula;
    }

    private Byte parcela;

    @Basic
    @javax.persistence.Column(name = "Parcela", nullable = true, insertable = true, updatable = true)
    public Byte getParcela() {
        return parcela;
    }

    public void setParcela(Byte parcela) {
        this.parcela = parcela;
    }

    private Byte codConta;

    @Basic
    @javax.persistence.Column(name = "CodConta", nullable = true, insertable = true, updatable = true)
    public Byte getCodConta() {
        return codConta;
    }

    public void setCodConta(Byte codConta) {
        this.codConta = codConta;
    }

    private Double pagoValor;

    @Basic
    @javax.persistence.Column(name = "PagoValor", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getPagoValor() {
        return pagoValor;
    }

    public void setPagoValor(Double pagoValor) {
        this.pagoValor = pagoValor;
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

    private boolean quitada;

    @Basic
    @javax.persistence.Column(name = "Quitada", nullable = false, insertable = true, updatable = true)
    public boolean isQuitada() {
        return quitada;
    }

    public void setQuitada(boolean quitada) {
        this.quitada = quitada;
    }

    private boolean problema;

    @Basic
    @javax.persistence.Column(name = "Problema", nullable = false, insertable = true, updatable = true)
    public boolean isProblema() {
        return problema;
    }

    public void setProblema(boolean problema) {
        this.problema = problema;
    }

    private boolean solucionado;

    @Basic
    @javax.persistence.Column(name = "Solucionado", nullable = false, insertable = true, updatable = true)
    public boolean isSolucionado() {
        return solucionado;
    }

    public void setSolucionado(boolean solucionado) {
        this.solucionado = solucionado;
    }

    private String problemaDescrição;

    @Basic
    @javax.persistence.Column(name = "ProblemaDescrição", nullable = true, insertable = true, updatable = true)
    public String getProblemaDescrição() {
        return problemaDescrição;
    }

    public void setProblemaDescrição(String problemaDescrição) {
        this.problemaDescrição = problemaDescrição;
    }

    private String linha;

    @Basic
    @javax.persistence.Column(name = "Linha", nullable = true, insertable = true, updatable = true)
    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    private boolean anoAnterior;

    @Basic
    @javax.persistence.Column(name = "AnoAnterior", nullable = false, insertable = true, updatable = true)
    public boolean isAnoAnterior() {
        return anoAnterior;
    }

    public void setAnoAnterior(boolean anoAnterior) {
        this.anoAnterior = anoAnterior;
    }

    private boolean anoPosterior;

    @Basic
    @javax.persistence.Column(name = "AnoPosterior", nullable = false, insertable = true, updatable = true)
    public boolean isAnoPosterior() {
        return anoPosterior;
    }

    public void setAnoPosterior(boolean anoPosterior) {
        this.anoPosterior = anoPosterior;
    }

    private Integer codUnidade;

    @Basic
    @javax.persistence.Column(name = "CodUnidade", nullable = true, insertable = true, updatable = true)
    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    private Timestamp dataMovimento;

    @Basic
    @javax.persistence.Column(name = "DataMovimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Timestamp dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    private Timestamp dataCrédito;

    @Basic
    @javax.persistence.Column(name = "DataCrédito", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataCrédito() {
        return dataCrédito;
    }

    public void setDataCrédito(Timestamp dataCrédito) {
        this.dataCrédito = dataCrédito;
    }

    private String conta;

    @Basic
    @javax.persistence.Column(name = "Conta", nullable = true, insertable = true, updatable = true)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntOct cntOct = (CntOct) o;

        if (anoAnterior != cntOct.anoAnterior) return false;
        if (anoPosterior != cntOct.anoPosterior) return false;
        if (idOct != cntOct.idOct) return false;
        if (problema != cntOct.problema) return false;
        if (quitada != cntOct.quitada) return false;
        if (solucionado != cntOct.solucionado) return false;
        if (ano != null ? !ano.equals(cntOct.ano) : cntOct.ano != null) return false;
        if (arquivo != null ? !arquivo.equals(cntOct.arquivo) : cntOct.arquivo != null) return false;
        if (codConta != null ? !codConta.equals(cntOct.codConta) : cntOct.codConta != null) return false;
        if (codUnidade != null ? !codUnidade.equals(cntOct.codUnidade) : cntOct.codUnidade != null) return false;
        if (conta != null ? !conta.equals(cntOct.conta) : cntOct.conta != null) return false;
        if (dataCrédito != null ? !dataCrédito.equals(cntOct.dataCrédito) : cntOct.dataCrédito != null) return false;
        if (dataMovimento != null ? !dataMovimento.equals(cntOct.dataMovimento) : cntOct.dataMovimento != null)
            return false;
        if (linha != null ? !linha.equals(cntOct.linha) : cntOct.linha != null) return false;
        if (matrícula != null ? !matrícula.equals(cntOct.matrícula) : cntOct.matrícula != null) return false;
        if (númeroDoc != null ? !númeroDoc.equals(cntOct.númeroDoc) : cntOct.númeroDoc != null) return false;
        if (pagoData != null ? !pagoData.equals(cntOct.pagoData) : cntOct.pagoData != null) return false;
        if (pagoValor != null ? !pagoValor.equals(cntOct.pagoValor) : cntOct.pagoValor != null) return false;
        if (parcela != null ? !parcela.equals(cntOct.parcela) : cntOct.parcela != null) return false;
        if (problemaDescrição != null ? !problemaDescrição.equals(cntOct.problemaDescrição) : cntOct.problemaDescrição != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOct;
        result = 31 * result + (arquivo != null ? arquivo.hashCode() : 0);
        result = 31 * result + (númeroDoc != null ? númeroDoc.hashCode() : 0);
        result = 31 * result + (ano != null ? ano.hashCode() : 0);
        result = 31 * result + (matrícula != null ? matrícula.hashCode() : 0);
        result = 31 * result + (parcela != null ? parcela.hashCode() : 0);
        result = 31 * result + (codConta != null ? codConta.hashCode() : 0);
        result = 31 * result + (pagoValor != null ? pagoValor.hashCode() : 0);
        result = 31 * result + (pagoData != null ? pagoData.hashCode() : 0);
        result = 31 * result + (quitada ? 1 : 0);
        result = 31 * result + (problema ? 1 : 0);
        result = 31 * result + (solucionado ? 1 : 0);
        result = 31 * result + (problemaDescrição != null ? problemaDescrição.hashCode() : 0);
        result = 31 * result + (linha != null ? linha.hashCode() : 0);
        result = 31 * result + (anoAnterior ? 1 : 0);
        result = 31 * result + (anoPosterior ? 1 : 0);
        result = 31 * result + (codUnidade != null ? codUnidade.hashCode() : 0);
        result = 31 * result + (dataMovimento != null ? dataMovimento.hashCode() : 0);
        result = 31 * result + (dataCrédito != null ? dataCrédito.hashCode() : 0);
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        return result;
    }
}
