package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "sgrPersonalização", schema = "dbo", catalog = "xDuka")
@IdClass(SgrPersonalizacaoPK.class)
public class SgrPersonalizacao {
    private int idControle;
    private int idUsuário;
    private boolean ativo;
    private boolean bloqueado;
    private boolean visivel;
    private SgrControle sgrControleByIdControle;

    @Id
    @Column(name = "IDControle", nullable = false, insertable = false, updatable = false)
    public int getIdControle() {
        return idControle;
    }

    public void setIdControle(int idControle) {
        this.idControle = idControle;
    }

    @Id
    @Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    @Basic
    @Column(name = "Ativo", nullable = false, insertable = true, updatable = true)
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Basic
    @Column(name = "Bloqueado", nullable = false, insertable = true, updatable = true)
    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Basic
    @Column(name = "Visivel", nullable = false, insertable = true, updatable = true)
    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrPersonalizacao that = (SgrPersonalizacao) o;

        if (ativo != that.ativo) return false;
        if (bloqueado != that.bloqueado) return false;
        if (idControle != that.idControle) return false;
        if (idUsuário != that.idUsuário) return false;
        if (visivel != that.visivel) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idControle;
        result = 31 * result + idUsuário;
        result = 31 * result + (ativo ? 1 : 0);
        result = 31 * result + (bloqueado ? 1 : 0);
        result = 31 * result + (visivel ? 1 : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDControle", referencedColumnName = "IDControle", nullable = false)
    public SgrControle getSgrControleByIdControle() {
        return sgrControleByIdControle;
    }

    public void setSgrControleByIdControle(SgrControle sgrControleByIdControle) {
        this.sgrControleByIdControle = sgrControleByIdControle;
    }
}
