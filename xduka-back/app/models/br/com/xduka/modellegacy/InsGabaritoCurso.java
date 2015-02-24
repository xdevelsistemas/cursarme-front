package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsGabaritoCursoPK.class)
public class InsGabaritoCurso {
    private int gabaritoCursoId;
    private int codUnidade;
    private int codInscrição;
    private int codCurso;
    private byte codCursoVest;
    private String codGrupo;
    private byte codÁrea;
    private int prova;
    private byte codGabarito;

    @Basic
    @Column(name = "GabaritoCurso_ID", nullable = false, insertable = true, updatable = true)
    public int getGabaritoCursoId() {
        return gabaritoCursoId;
    }

    public void setGabaritoCursoId(int gabaritoCursoId) {
        this.gabaritoCursoId = gabaritoCursoId;
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
    @Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
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
    @Column(name = "CodCursoVest", nullable = false, insertable = true, updatable = true)
    public byte getCodCursoVest() {
        return codCursoVest;
    }

    public void setCodCursoVest(byte codCursoVest) {
        this.codCursoVest = codCursoVest;
    }

    @Id
    @Column(name = "CodGrupo", nullable = false, insertable = true, updatable = true)
    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    @Id
    @Column(name = "CodÁrea", nullable = false, insertable = true, updatable = true)
    public byte getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(byte codÁrea) {
        this.codÁrea = codÁrea;
    }

    @Id
    @Column(name = "Prova", nullable = false, insertable = true, updatable = true)
    public int getProva() {
        return prova;
    }

    public void setProva(int prova) {
        this.prova = prova;
    }

    @Id
    @Column(name = "CodGabarito", nullable = false, insertable = true, updatable = true)
    public byte getCodGabarito() {
        return codGabarito;
    }

    public void setCodGabarito(byte codGabarito) {
        this.codGabarito = codGabarito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsGabaritoCurso that = (InsGabaritoCurso) o;

        if (codCurso != that.codCurso) return false;
        if (codCursoVest != that.codCursoVest) return false;
        if (codGabarito != that.codGabarito) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codÁrea != that.codÁrea) return false;
        if (gabaritoCursoId != that.gabaritoCursoId) return false;
        if (prova != that.prova) return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gabaritoCursoId;
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCurso;
        result = 31 * result + (int) codCursoVest;
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        result = 31 * result + (int) codÁrea;
        result = 31 * result + prova;
        result = 31 * result + (int) codGabarito;
        return result;
    }
}
