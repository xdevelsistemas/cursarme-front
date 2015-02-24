package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class AcdAtividade {
    private long atividadeId;

    @Basic
    @javax.persistence.Column(name = "Atividade_ID", nullable = false, insertable = true, updatable = true)
    public long getAtividadeId() {
        return atividadeId;
    }

    public void setAtividadeId(long atividadeId) {
        this.atividadeId = atividadeId;
    }

    private int anoLetivo;

    @Id
    @javax.persistence.Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codTipo;

    @Id
    @javax.persistence.Column(name = "CodTipo", nullable = false, insertable = true, updatable = true)
    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    private int codModalidade;

    @Id
    @javax.persistence.Column(name = "CodModalidade", nullable = false, insertable = true, updatable = true)
    public int getCodModalidade() {
        return codModalidade;
    }

    public void setCodModalidade(int codModalidade) {
        this.codModalidade = codModalidade;
    }

    private long codPauta;

    @Id
    @javax.persistence.Column(name = "CodPauta", nullable = false, insertable = true, updatable = true)
    public long getCodPauta() {
        return codPauta;
    }

    public void setCodPauta(long codPauta) {
        this.codPauta = codPauta;
    }

    private Integer codExtra;

    @Basic
    @javax.persistence.Column(name = "CodExtra", nullable = true, insertable = true, updatable = true)
    public Integer getCodExtra() {
        return codExtra;
    }

    public void setCodExtra(Integer codExtra) {
        this.codExtra = codExtra;
    }

    private Timestamp segunda;

    @Basic
    @javax.persistence.Column(name = "Segunda", nullable = true, insertable = true, updatable = true)
    public Timestamp getSegunda() {
        return segunda;
    }

    public void setSegunda(Timestamp segunda) {
        this.segunda = segunda;
    }

    private Timestamp terça;

    @Basic
    @javax.persistence.Column(name = "Terça", nullable = true, insertable = true, updatable = true)
    public Timestamp getTerça() {
        return terça;
    }

    public void setTerça(Timestamp terça) {
        this.terça = terça;
    }

    private Timestamp quarta;

    @Basic
    @javax.persistence.Column(name = "Quarta", nullable = true, insertable = true, updatable = true)
    public Timestamp getQuarta() {
        return quarta;
    }

    public void setQuarta(Timestamp quarta) {
        this.quarta = quarta;
    }

    private Timestamp quinta;

    @Basic
    @javax.persistence.Column(name = "Quinta", nullable = true, insertable = true, updatable = true)
    public Timestamp getQuinta() {
        return quinta;
    }

    public void setQuinta(Timestamp quinta) {
        this.quinta = quinta;
    }

    private Timestamp sexta;

    @Basic
    @javax.persistence.Column(name = "Sexta", nullable = true, insertable = true, updatable = true)
    public Timestamp getSexta() {
        return sexta;
    }

    public void setSexta(Timestamp sexta) {
        this.sexta = sexta;
    }

    private Timestamp sábado;

    @Basic
    @javax.persistence.Column(name = "Sábado", nullable = true, insertable = true, updatable = true)
    public Timestamp getSábado() {
        return sábado;
    }

    public void setSábado(Timestamp sábado) {
        this.sábado = sábado;
    }

    private Boolean janeiro;

    @Basic
    @javax.persistence.Column(name = "Janeiro", nullable = true, insertable = true, updatable = true)
    public Boolean getJaneiro() {
        return janeiro;
    }

    public void setJaneiro(Boolean janeiro) {
        this.janeiro = janeiro;
    }

    private Boolean fevereiro;

    @Basic
    @javax.persistence.Column(name = "Fevereiro", nullable = true, insertable = true, updatable = true)
    public Boolean getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(Boolean fevereiro) {
        this.fevereiro = fevereiro;
    }

    private Boolean março;

    @Basic
    @javax.persistence.Column(name = "Março", nullable = true, insertable = true, updatable = true)
    public Boolean getMarço() {
        return março;
    }

    public void setMarço(Boolean março) {
        this.março = março;
    }

    private Boolean abril;

    @Basic
    @javax.persistence.Column(name = "Abril", nullable = true, insertable = true, updatable = true)
    public Boolean getAbril() {
        return abril;
    }

    public void setAbril(Boolean abril) {
        this.abril = abril;
    }

    private Boolean maio;

    @Basic
    @javax.persistence.Column(name = "Maio", nullable = true, insertable = true, updatable = true)
    public Boolean getMaio() {
        return maio;
    }

    public void setMaio(Boolean maio) {
        this.maio = maio;
    }

    private Boolean junho;

    @Basic
    @javax.persistence.Column(name = "Junho", nullable = true, insertable = true, updatable = true)
    public Boolean getJunho() {
        return junho;
    }

    public void setJunho(Boolean junho) {
        this.junho = junho;
    }

    private Boolean julho;

    @Basic
    @javax.persistence.Column(name = "Julho", nullable = true, insertable = true, updatable = true)
    public Boolean getJulho() {
        return julho;
    }

    public void setJulho(Boolean julho) {
        this.julho = julho;
    }

    private Boolean agosto;

    @Basic
    @javax.persistence.Column(name = "Agosto", nullable = true, insertable = true, updatable = true)
    public Boolean getAgosto() {
        return agosto;
    }

    public void setAgosto(Boolean agosto) {
        this.agosto = agosto;
    }

    private Boolean setembro;

    @Basic
    @javax.persistence.Column(name = "Setembro", nullable = true, insertable = true, updatable = true)
    public Boolean getSetembro() {
        return setembro;
    }

    public void setSetembro(Boolean setembro) {
        this.setembro = setembro;
    }

    private Boolean outubro;

    @Basic
    @javax.persistence.Column(name = "Outubro", nullable = true, insertable = true, updatable = true)
    public Boolean getOutubro() {
        return outubro;
    }

    public void setOutubro(Boolean outubro) {
        this.outubro = outubro;
    }

    private Boolean novembro;

    @Basic
    @javax.persistence.Column(name = "Novembro", nullable = true, insertable = true, updatable = true)
    public Boolean getNovembro() {
        return novembro;
    }

    public void setNovembro(Boolean novembro) {
        this.novembro = novembro;
    }

    private Boolean dezembro;

    @Basic
    @javax.persistence.Column(name = "Dezembro", nullable = true, insertable = true, updatable = true)
    public Boolean getDezembro() {
        return dezembro;
    }

    public void setDezembro(Boolean dezembro) {
        this.dezembro = dezembro;
    }

    private BigDecimal valor;

    @Basic
    @javax.persistence.Column(name = "Valor", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    private BigDecimal total;

    @Basic
    @javax.persistence.Column(name = "Total", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAtividade that = (AcdAtividade) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (atividadeId != that.atividadeId) return false;
        if (codModalidade != that.codModalidade) return false;
        if (codPauta != that.codPauta) return false;
        if (codTipo != that.codTipo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (abril != null ? !abril.equals(that.abril) : that.abril != null) return false;
        if (agosto != null ? !agosto.equals(that.agosto) : that.agosto != null) return false;
        if (codExtra != null ? !codExtra.equals(that.codExtra) : that.codExtra != null) return false;
        if (dezembro != null ? !dezembro.equals(that.dezembro) : that.dezembro != null) return false;
        if (fevereiro != null ? !fevereiro.equals(that.fevereiro) : that.fevereiro != null) return false;
        if (janeiro != null ? !janeiro.equals(that.janeiro) : that.janeiro != null) return false;
        if (julho != null ? !julho.equals(that.julho) : that.julho != null) return false;
        if (junho != null ? !junho.equals(that.junho) : that.junho != null) return false;
        if (maio != null ? !maio.equals(that.maio) : that.maio != null) return false;
        if (março != null ? !março.equals(that.março) : that.março != null) return false;
        if (novembro != null ? !novembro.equals(that.novembro) : that.novembro != null) return false;
        if (outubro != null ? !outubro.equals(that.outubro) : that.outubro != null) return false;
        if (quarta != null ? !quarta.equals(that.quarta) : that.quarta != null) return false;
        if (quinta != null ? !quinta.equals(that.quinta) : that.quinta != null) return false;
        if (segunda != null ? !segunda.equals(that.segunda) : that.segunda != null) return false;
        if (setembro != null ? !setembro.equals(that.setembro) : that.setembro != null) return false;
        if (sexta != null ? !sexta.equals(that.sexta) : that.sexta != null) return false;
        if (sábado != null ? !sábado.equals(that.sábado) : that.sábado != null) return false;
        if (terça != null ? !terça.equals(that.terça) : that.terça != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (atividadeId ^ (atividadeId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codTipo;
        result = 31 * result + codModalidade;
        result = 31 * result + (int) (codPauta ^ (codPauta >>> 32));
        result = 31 * result + (codExtra != null ? codExtra.hashCode() : 0);
        result = 31 * result + (segunda != null ? segunda.hashCode() : 0);
        result = 31 * result + (terça != null ? terça.hashCode() : 0);
        result = 31 * result + (quarta != null ? quarta.hashCode() : 0);
        result = 31 * result + (quinta != null ? quinta.hashCode() : 0);
        result = 31 * result + (sexta != null ? sexta.hashCode() : 0);
        result = 31 * result + (sábado != null ? sábado.hashCode() : 0);
        result = 31 * result + (janeiro != null ? janeiro.hashCode() : 0);
        result = 31 * result + (fevereiro != null ? fevereiro.hashCode() : 0);
        result = 31 * result + (março != null ? março.hashCode() : 0);
        result = 31 * result + (abril != null ? abril.hashCode() : 0);
        result = 31 * result + (maio != null ? maio.hashCode() : 0);
        result = 31 * result + (junho != null ? junho.hashCode() : 0);
        result = 31 * result + (julho != null ? julho.hashCode() : 0);
        result = 31 * result + (agosto != null ? agosto.hashCode() : 0);
        result = 31 * result + (setembro != null ? setembro.hashCode() : 0);
        result = 31 * result + (outubro != null ? outubro.hashCode() : 0);
        result = 31 * result + (novembro != null ? novembro.hashCode() : 0);
        result = 31 * result + (dezembro != null ? dezembro.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        return result;
    }
}
