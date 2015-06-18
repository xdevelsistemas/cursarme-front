package br.com.xduka.modellegacy.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by clayton on 04/12/14.
 */
public class InsGabaritoCursoPK implements Serializable {
    private int codUnidade;

    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codInscrição;

    @Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    private int codCurso;

    @Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    @Id
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private byte codCursoVest;

    @Column(name = "CodCursoVest", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodCursoVest() {
        return codCursoVest;
    }

    public void setCodCursoVest(byte codCursoVest) {
        this.codCursoVest = codCursoVest;
    }

    private String codGrupo;

    @Column(name = "CodGrupo", nullable = false, insertable = true, updatable = true)
    @Id
    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    private byte codÁrea;

    @Column(name = "CodÁrea", nullable = false, insertable = true, updatable = true)
    @Id
    public byte getCodÁrea() {
        return codÁrea;
    }

    public void setCodÁrea(byte codÁrea) {
        this.codÁrea = codÁrea;
    }

    private int prova;

    @Column(name = "Prova", nullable = false, insertable = true, updatable = true)
    @Id
    public int getProva() {
        return prova;
    }

    public void setProva(int prova) {
        this.prova = prova;
    }

    private byte codGabarito;

    @Column(name = "CodGabarito", nullable = false, insertable = true, updatable = true)
    @Id
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

        InsGabaritoCursoPK that = (InsGabaritoCursoPK) o;

        if (codCurso != that.codCurso) return false;
        if (codCursoVest != that.codCursoVest) return false;
        if (codGabarito != that.codGabarito) return false;
        if (codInscrição != that.codInscrição) return false;
        if (codUnidade != that.codUnidade) return false;
        if (codÁrea != that.codÁrea) return false;
        if (prova != that.prova) return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
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
