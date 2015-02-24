package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntQuitaçãoErros", schema = "dbo", catalog = "xDuka")
@IdClass(CntQuitacaoErrosPK.class)
public class CntQuitacaoErros {
    private int erroId;
    private Timestamp movimentoData;
    private String conta;
    private String motivo;
    private String nossoNúmero;
    private String agênciaRecebedora;
    private Integer matrícula;
    private Byte parcela;
    private BigDecimal valor;
    private boolean quitado;
    private String arquivo;
    private Short linha;
    private String registro;
    private boolean resolvido;
    private String solução;
    private byte[] cts;

    @Basic
    @Column(name = "ErroID", nullable = false, insertable = true, updatable = true)
    public int getErroId() {
        return erroId;
    }

    public void setErroId(int erroId) {
        this.erroId = erroId;
    }

    @Id
    @Column(name = "MovimentoData", nullable = false, insertable = true, updatable = true)
    public Timestamp getMovimentoData() {
        return movimentoData;
    }

    public void setMovimentoData(Timestamp movimentoData) {
        this.movimentoData = movimentoData;
    }

    @Id
    @Column(name = "Conta", nullable = false, insertable = true, updatable = true)
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Basic
    @Column(name = "Motivo", nullable = true, insertable = true, updatable = true)
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Basic
    @Column(name = "NossoNúmero", nullable = true, insertable = true, updatable = true)
    public String getNossoNúmero() {
        return nossoNúmero;
    }

    public void setNossoNúmero(String nossoNúmero) {
        this.nossoNúmero = nossoNúmero;
    }

    @Basic
    @Column(name = "AgênciaRecebedora", nullable = true, insertable = true, updatable = true)
    public String getAgênciaRecebedora() {
        return agênciaRecebedora;
    }

    public void setAgênciaRecebedora(String agênciaRecebedora) {
        this.agênciaRecebedora = agênciaRecebedora;
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
    @Column(name = "Valor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "Quitado", nullable = false, insertable = true, updatable = true)
    public boolean isQuitado() {
        return quitado;
    }

    public void setQuitado(boolean quitado) {
        this.quitado = quitado;
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
    @Column(name = "Linha", nullable = true, insertable = true, updatable = true)
    public Short getLinha() {
        return linha;
    }

    public void setLinha(Short linha) {
        this.linha = linha;
    }

    @Basic
    @Column(name = "Registro", nullable = true, insertable = true, updatable = true)
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    @Basic
    @Column(name = "Resolvido", nullable = false, insertable = true, updatable = true)
    public boolean isResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean resolvido) {
        this.resolvido = resolvido;
    }

    @Basic
    @Column(name = "Solução", nullable = true, insertable = true, updatable = true)
    public String getSolução() {
        return solução;
    }

    public void setSolução(String solução) {
        this.solução = solução;
    }

    @Basic
    @Column(name = "CTS", nullable = true, insertable = true, updatable = true)
    public byte[] getCts() {
        return cts;
    }

    public void setCts(byte[] cts) {
        this.cts = cts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntQuitacaoErros that = (CntQuitacaoErros) o;

        if (erroId != that.erroId) return false;
        if (quitado != that.quitado) return false;
        if (resolvido != that.resolvido) return false;
        if (agênciaRecebedora != null ? !agênciaRecebedora.equals(that.agênciaRecebedora) : that.agênciaRecebedora != null)
            return false;
        if (arquivo != null ? !arquivo.equals(that.arquivo) : that.arquivo != null) return false;
        if (conta != null ? !conta.equals(that.conta) : that.conta != null) return false;
        if (!Arrays.equals(cts, that.cts)) return false;
        if (linha != null ? !linha.equals(that.linha) : that.linha != null) return false;
        if (matrícula != null ? !matrícula.equals(that.matrícula) : that.matrícula != null) return false;
        if (motivo != null ? !motivo.equals(that.motivo) : that.motivo != null) return false;
        if (movimentoData != null ? !movimentoData.equals(that.movimentoData) : that.movimentoData != null)
            return false;
        if (nossoNúmero != null ? !nossoNúmero.equals(that.nossoNúmero) : that.nossoNúmero != null) return false;
        if (parcela != null ? !parcela.equals(that.parcela) : that.parcela != null) return false;
        if (registro != null ? !registro.equals(that.registro) : that.registro != null) return false;
        if (solução != null ? !solução.equals(that.solução) : that.solução != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = erroId;
        result = 31 * result + (movimentoData != null ? movimentoData.hashCode() : 0);
        result = 31 * result + (conta != null ? conta.hashCode() : 0);
        result = 31 * result + (motivo != null ? motivo.hashCode() : 0);
        result = 31 * result + (nossoNúmero != null ? nossoNúmero.hashCode() : 0);
        result = 31 * result + (agênciaRecebedora != null ? agênciaRecebedora.hashCode() : 0);
        result = 31 * result + (matrícula != null ? matrícula.hashCode() : 0);
        result = 31 * result + (parcela != null ? parcela.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (quitado ? 1 : 0);
        result = 31 * result + (arquivo != null ? arquivo.hashCode() : 0);
        result = 31 * result + (linha != null ? linha.hashCode() : 0);
        result = 31 * result + (registro != null ? registro.hashCode() : 0);
        result = 31 * result + (resolvido ? 1 : 0);
        result = 31 * result + (solução != null ? solução.hashCode() : 0);
        result = 31 * result + (cts != null ? Arrays.hashCode(cts) : 0);
        return result;
    }
}
