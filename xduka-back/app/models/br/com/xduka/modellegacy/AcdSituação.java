package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdSituaçãoPK.class)
public class AcdSituação {
    private int codUnidade;
    private byte codSituação;
    private String situação;
    private String status;
    private boolean transferência;
    private boolean normal;
    private boolean sistema;
    private boolean turma;
    private boolean remover;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodSituação", nullable = false, insertable = true, updatable = true)
    public byte getCodSituação() {
        return codSituação;
    }

    public void setCodSituação(byte codSituação) {
        this.codSituação = codSituação;
    }

    @Basic
    @Column(name = "Situação", nullable = true, insertable = true, updatable = true)
    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    @Basic
    @Column(name = "Status", nullable = true, insertable = true, updatable = true)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "Transferência", nullable = false, insertable = true, updatable = true)
    public boolean isTransferência() {
        return transferência;
    }

    public void setTransferência(boolean transferência) {
        this.transferência = transferência;
    }

    @Basic
    @Column(name = "Normal", nullable = false, insertable = true, updatable = true)
    public boolean isNormal() {
        return normal;
    }

    public void setNormal(boolean normal) {
        this.normal = normal;
    }

    @Basic
    @Column(name = "Sistema", nullable = false, insertable = true, updatable = true)
    public boolean isSistema() {
        return sistema;
    }

    public void setSistema(boolean sistema) {
        this.sistema = sistema;
    }

    @Basic
    @Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public boolean isTurma() {
        return turma;
    }

    public void setTurma(boolean turma) {
        this.turma = turma;
    }

    @Basic
    @Column(name = "Remover", nullable = false, insertable = true, updatable = true)
    public boolean isRemover() {
        return remover;
    }

    public void setRemover(boolean remover) {
        this.remover = remover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdSituação that = (AcdSituação) o;

        if (codSituação != that.codSituação) return false;
        if (codUnidade != that.codUnidade) return false;
        if (normal != that.normal) return false;
        if (remover != that.remover) return false;
        if (sistema != that.sistema) return false;
        if (transferência != that.transferência) return false;
        if (turma != that.turma) return false;
        if (situação != null ? !situação.equals(that.situação) : that.situação != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (int) codSituação;
        result = 31 * result + (situação != null ? situação.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (transferência ? 1 : 0);
        result = 31 * result + (normal ? 1 : 0);
        result = 31 * result + (sistema ? 1 : 0);
        result = 31 * result + (turma ? 1 : 0);
        result = 31 * result + (remover ? 1 : 0);
        return result;
    }
}
