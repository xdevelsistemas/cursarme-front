package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdAreaVestPK.class)
public class AcdAreaVest {
    private int anoLetivo;
    private int codUnidade;
    private byte codÁrea;
    private String área;
//    private List<AcdGrupoVest> acdGrupoVests;

    @Id
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
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
    @Column(name = "CodÁrea", nullable = false, insertable = true, updatable = true)
    public byte getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(byte codÁrea) {
        this.codÁrea = codÁrea;
    }

    @Basic
    @Column(name = "Área", nullable = true, insertable = true, updatable = true)
    public String getÁrea() {
        return área;
    }

    public void setÁrea(String área) {
        this.área = área;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdAreaVest that = (AcdAreaVest) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codÁrea != that.codÁrea) return false;
        if (área != null ? !área.equals(that.área) : that.área != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + (int) codÁrea;
        result = 31 * result + (área != null ? área.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "acdAreaVest")
//    public List<AcdGrupoVest> getAcdGrupoVests() {
//        return acdGrupoVests;
//    }
//
//    public void setAcdGrupoVests(List<AcdGrupoVest> acdGrupoVests) {
//        this.acdGrupoVests = acdGrupoVests;
//    }
}
