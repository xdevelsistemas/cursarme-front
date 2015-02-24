package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdGrupoVestPK.class)
public class AcdGrupoVest {
    private long grupoVestId;
    private int anoLetivo;
    private int codUnidade;
    private String codGrupo;
    private Byte codÁrea;
    private Double codDiscursiva1;
    private Double codDiscursiva2;
    private Double codDiscursiva3;
    private boolean emescam;
    private List<AcdCursoVest> acdCursoVests;
    private AcdÁreaVest acdÁreaVest;

    @Basic
    @Column(name = "GrupoVest_ID", nullable = false, insertable = true, updatable = true)
    public long getGrupoVestId() {
        return grupoVestId;
    }

    public void setGrupoVestId(long grupoVestId) {
        this.grupoVestId = grupoVestId;
    }

    @Id
    @Column(name = "AnoLetivo", nullable = false, insertable = false, updatable = false)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
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
    @Column(name = "CodGrupo", nullable = false, insertable = true, updatable = true)
    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    @Basic
    @Column(name = "CodÁrea", nullable = true, insertable = false, updatable = false)
    public Byte getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(Byte codÁrea) {
        this.codÁrea = codÁrea;
    }

    @Basic
    @Column(name = "CodDiscursiva1", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getCodDiscursiva1() {
        return codDiscursiva1;
    }

    public void setCodDiscursiva1(Double codDiscursiva1) {
        this.codDiscursiva1 = codDiscursiva1;
    }

    @Basic
    @Column(name = "CodDiscursiva2", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getCodDiscursiva2() {
        return codDiscursiva2;
    }

    public void setCodDiscursiva2(Double codDiscursiva2) {
        this.codDiscursiva2 = codDiscursiva2;
    }

    @Basic
    @Column(name = "CodDiscursiva3", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getCodDiscursiva3() {
        return codDiscursiva3;
    }

    public void setCodDiscursiva3(Double codDiscursiva3) {
        this.codDiscursiva3 = codDiscursiva3;
    }

    @Basic
    @Column(name = "Emescam", nullable = false, insertable = true, updatable = true)
    public boolean isEmescam() {
        return emescam;
    }

    public void setEmescam(boolean emescam) {
        this.emescam = emescam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdGrupoVest that = (AcdGrupoVest) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (emescam != that.emescam) return false;
        if (grupoVestId != that.grupoVestId) return false;
        if (codDiscursiva1 != null ? !codDiscursiva1.equals(that.codDiscursiva1) : that.codDiscursiva1 != null)
            return false;
        if (codDiscursiva2 != null ? !codDiscursiva2.equals(that.codDiscursiva2) : that.codDiscursiva2 != null)
            return false;
        if (codDiscursiva3 != null ? !codDiscursiva3.equals(that.codDiscursiva3) : that.codDiscursiva3 != null)
            return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;
        if (codÁrea != null ? !codÁrea.equals(that.codÁrea) : that.codÁrea != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (grupoVestId ^ (grupoVestId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        result = 31 * result + (codÁrea != null ? codÁrea.hashCode() : 0);
        result = 31 * result + (codDiscursiva1 != null ? codDiscursiva1.hashCode() : 0);
        result = 31 * result + (codDiscursiva2 != null ? codDiscursiva2.hashCode() : 0);
        result = 31 * result + (codDiscursiva3 != null ? codDiscursiva3.hashCode() : 0);
        result = 31 * result + (emescam ? 1 : 0);
        return result;
    }

    @OneToMany(mappedBy = "acdGrupoVest")
    public List<AcdCursoVest> getAcdCursoVests() {
        return acdCursoVests;
    }

    public void setAcdCursoVests(List<AcdCursoVest> acdCursoVests) {
        this.acdCursoVests = acdCursoVests;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "AnoLetivo", referencedColumnName = "AnoLetivo", nullable = false), @JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodÁrea", referencedColumnName = "CodÁrea", nullable = false)})
    public AcdÁreaVest getAcdÁreaVest() {
        return acdÁreaVest;
    }

    public void setAcdÁreaVest(AcdÁreaVest acdÁreaVest) {
        this.acdÁreaVest = acdÁreaVest;
    }
}
