package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdPeríodoPK.class)
public class AcdPeríodo {
    private long períodoId;
    private int codUnidade;
    private int codCurso;
    private int codPeríodo;
    private String período;
    private String períodoAbreviado;
    private String períodoDocumento;
    private Byte codNível;
    private String perfilProfissional;
    private Boolean último;
    private Long codCentroCusto;
    private Short tipoPauta;
    private AcdNível acdNível;
    private List<AcdReserva> acdReservas;

    @Basic
    @Column(name = "Período_ID", nullable = false, insertable = true, updatable = true)
    public long getPeríodoId() {
        return períodoId;
    }

    public void setPeríodoId(long períodoId) {
        this.períodoId = períodoId;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = false, updatable = false)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Id
    @Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    @Basic
    @Column(name = "Período", nullable = true, insertable = true, updatable = true)
    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }

    @Basic
    @Column(name = "PeríodoAbreviado", nullable = true, insertable = true, updatable = true)
    public String getPeríodoAbreviado() {
        return períodoAbreviado;
    }

    public void setPeríodoAbreviado(String períodoAbreviado) {
        this.períodoAbreviado = períodoAbreviado;
    }

    @Basic
    @Column(name = "PeríodoDocumento", nullable = true, insertable = true, updatable = true)
    public String getPeríodoDocumento() {
        return períodoDocumento;
    }

    public void setPeríodoDocumento(String períodoDocumento) {
        this.períodoDocumento = períodoDocumento;
    }

    @Basic
    @Column(name = "CodNível", nullable = true, insertable = false, updatable = false)
    public Byte getCodNível() {
        return codNível;
    }

    public void setCodNível(Byte codNível) {
        this.codNível = codNível;
    }

    @Basic
    @Column(name = "PerfilProfissional", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getPerfilProfissional() {
        return perfilProfissional;
    }

    public void setPerfilProfissional(String perfilProfissional) {
        this.perfilProfissional = perfilProfissional;
    }

    @Basic
    @Column(name = "Último", nullable = true, insertable = true, updatable = true)
    public Boolean getÚltimo() {
        return último;
    }

    public void setÚltimo(Boolean último) {
        this.último = último;
    }

    @Basic
    @Column(name = "CodCentroCusto", nullable = true, insertable = true, updatable = true)
    public Long getCodCentroCusto() {
        return codCentroCusto;
    }

    public void setCodCentroCusto(Long codCentroCusto) {
        this.codCentroCusto = codCentroCusto;
    }

    @Basic
    @Column(name = "TipoPauta", nullable = true, insertable = true, updatable = true)
    public Short getTipoPauta() {
        return tipoPauta;
    }

    public void setTipoPauta(Short tipoPauta) {
        this.tipoPauta = tipoPauta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdPeríodo that = (AcdPeríodo) o;

        if (codCurso != that.codCurso) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (períodoId != that.períodoId) return false;
        if (codCentroCusto != null ? !codCentroCusto.equals(that.codCentroCusto) : that.codCentroCusto != null)
            return false;
        if (codNível != null ? !codNível.equals(that.codNível) : that.codNível != null) return false;
        if (perfilProfissional != null ? !perfilProfissional.equals(that.perfilProfissional) : that.perfilProfissional != null)
            return false;
        if (período != null ? !período.equals(that.período) : that.período != null) return false;
        if (períodoAbreviado != null ? !períodoAbreviado.equals(that.períodoAbreviado) : that.períodoAbreviado != null)
            return false;
        if (períodoDocumento != null ? !períodoDocumento.equals(that.períodoDocumento) : that.períodoDocumento != null)
            return false;
        if (tipoPauta != null ? !tipoPauta.equals(that.tipoPauta) : that.tipoPauta != null) return false;
        if (último != null ? !último.equals(that.último) : that.último != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (períodoId ^ (períodoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + (período != null ? período.hashCode() : 0);
        result = 31 * result + (períodoAbreviado != null ? períodoAbreviado.hashCode() : 0);
        result = 31 * result + (períodoDocumento != null ? períodoDocumento.hashCode() : 0);
        result = 31 * result + (codNível != null ? codNível.hashCode() : 0);
        result = 31 * result + (perfilProfissional != null ? perfilProfissional.hashCode() : 0);
        result = 31 * result + (último != null ? último.hashCode() : 0);
        result = 31 * result + (codCentroCusto != null ? codCentroCusto.hashCode() : 0);
        result = 31 * result + (tipoPauta != null ? tipoPauta.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodNível", referencedColumnName = "CodNível" , nullable = false)})
    public AcdNível getAcdNível() {
        return acdNível;
    }

    public void setAcdNível(AcdNível acdNível) {
        this.acdNível = acdNível;
    }

    @OneToMany(mappedBy = "acdPeríodo")
    public List<AcdReserva> getAcdReservas() {
        return acdReservas;
    }

    public void setAcdReservas(List<AcdReserva> acdReservas) {
        this.acdReservas = acdReservas;
    }
}
