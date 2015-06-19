package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(InsVagaPK.class)
public class InsVaga {
    private long vagaId;

    @Basic
    @javax.persistence.Column(name = "Vaga_ID", nullable = false, insertable = true, updatable = true)
    public long getVagaId() {
        return vagaId;
    }

    public void setVagaId(long vagaId) {
        this.vagaId = vagaId;
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

    private int codInscrição;

    @Id
    @javax.persistence.Column(name = "CodInscrição", nullable = false, insertable = true, updatable = true)
    public int getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(int codInscrição) {
        this.codInscrição = codInscrição;
    }

    private int codCurso;

    @Id
    @javax.persistence.Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private String codTurno;

    @Id
    @javax.persistence.Column(name = "CodTurno", nullable = false, insertable = true, updatable = true)
    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    private String turma;

    @Id
    @javax.persistence.Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    private Integer vaga;

    @Basic
    @javax.persistence.Column(name = "Vaga", nullable = true, insertable = true, updatable = true)
    public Integer getVaga() {
        return vaga;
    }

    public void setVaga(Integer vaga) {
        this.vaga = vaga;
    }

    private int codPeríodo;

    @Id
    @javax.persistence.Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    private Integer codDisciplina01;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina01", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina01() {
        return codDisciplina01;
    }

    public void setCodDisciplina01(Integer codDisciplina01) {
        this.codDisciplina01 = codDisciplina01;
    }

    private Integer codDisciplina02;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina02", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina02() {
        return codDisciplina02;
    }

    public void setCodDisciplina02(Integer codDisciplina02) {
        this.codDisciplina02 = codDisciplina02;
    }

    private Integer codDisciplina03;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina03", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina03() {
        return codDisciplina03;
    }

    public void setCodDisciplina03(Integer codDisciplina03) {
        this.codDisciplina03 = codDisciplina03;
    }

    private Integer codDisciplina04;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina04", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina04() {
        return codDisciplina04;
    }

    public void setCodDisciplina04(Integer codDisciplina04) {
        this.codDisciplina04 = codDisciplina04;
    }

    private Integer codDisciplina05;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina05", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina05() {
        return codDisciplina05;
    }

    public void setCodDisciplina05(Integer codDisciplina05) {
        this.codDisciplina05 = codDisciplina05;
    }

    private Integer codDisciplina06;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina06", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina06() {
        return codDisciplina06;
    }

    public void setCodDisciplina06(Integer codDisciplina06) {
        this.codDisciplina06 = codDisciplina06;
    }

    private Integer codDisciplina07;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina07", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina07() {
        return codDisciplina07;
    }

    public void setCodDisciplina07(Integer codDisciplina07) {
        this.codDisciplina07 = codDisciplina07;
    }

    private Integer codDisciplina08;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina08", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina08() {
        return codDisciplina08;
    }

    public void setCodDisciplina08(Integer codDisciplina08) {
        this.codDisciplina08 = codDisciplina08;
    }

    private Integer codDisciplina09;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina09", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina09() {
        return codDisciplina09;
    }

    public void setCodDisciplina09(Integer codDisciplina09) {
        this.codDisciplina09 = codDisciplina09;
    }

    private Integer codDisciplina10;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina10", nullable = true, insertable = true, updatable = true)
    public Integer getCodDisciplina10() {
        return codDisciplina10;
    }

    public void setCodDisciplina10(Integer codDisciplina10) {
        this.codDisciplina10 = codDisciplina10;
    }

    private Boolean cancelada;

    @Basic
    @javax.persistence.Column(name = "Cancelada", nullable = true, insertable = true, updatable = true)
    public Boolean getCancelada() {
        return cancelada;
    }

    public void setCancelada(Boolean cancelada) {
        this.cancelada = cancelada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsVaga insVaga = (InsVaga) o;

        if (codCurso != insVaga.codCurso) return false;
        if (codInscrição != insVaga.codInscrição) return false;
        if (codPeríodo != insVaga.codPeríodo) return false;
        if (codUnidade != insVaga.codUnidade) return false;
        if (vagaId != insVaga.vagaId) return false;
        if (cancelada != null ? !cancelada.equals(insVaga.cancelada) : insVaga.cancelada != null) return false;
        if (codDisciplina01 != null ? !codDisciplina01.equals(insVaga.codDisciplina01) : insVaga.codDisciplina01 != null)
            return false;
        if (codDisciplina02 != null ? !codDisciplina02.equals(insVaga.codDisciplina02) : insVaga.codDisciplina02 != null)
            return false;
        if (codDisciplina03 != null ? !codDisciplina03.equals(insVaga.codDisciplina03) : insVaga.codDisciplina03 != null)
            return false;
        if (codDisciplina04 != null ? !codDisciplina04.equals(insVaga.codDisciplina04) : insVaga.codDisciplina04 != null)
            return false;
        if (codDisciplina05 != null ? !codDisciplina05.equals(insVaga.codDisciplina05) : insVaga.codDisciplina05 != null)
            return false;
        if (codDisciplina06 != null ? !codDisciplina06.equals(insVaga.codDisciplina06) : insVaga.codDisciplina06 != null)
            return false;
        if (codDisciplina07 != null ? !codDisciplina07.equals(insVaga.codDisciplina07) : insVaga.codDisciplina07 != null)
            return false;
        if (codDisciplina08 != null ? !codDisciplina08.equals(insVaga.codDisciplina08) : insVaga.codDisciplina08 != null)
            return false;
        if (codDisciplina09 != null ? !codDisciplina09.equals(insVaga.codDisciplina09) : insVaga.codDisciplina09 != null)
            return false;
        if (codDisciplina10 != null ? !codDisciplina10.equals(insVaga.codDisciplina10) : insVaga.codDisciplina10 != null)
            return false;
        if (codTurno != null ? !codTurno.equals(insVaga.codTurno) : insVaga.codTurno != null) return false;
        if (turma != null ? !turma.equals(insVaga.turma) : insVaga.turma != null) return false;
        if (vaga != null ? !vaga.equals(insVaga.vaga) : insVaga.vaga != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (vagaId ^ (vagaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codInscrição;
        result = 31 * result + codCurso;
        result = 31 * result + (codTurno != null ? codTurno.hashCode() : 0);
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + (vaga != null ? vaga.hashCode() : 0);
        result = 31 * result + codPeríodo;
        result = 31 * result + (codDisciplina01 != null ? codDisciplina01.hashCode() : 0);
        result = 31 * result + (codDisciplina02 != null ? codDisciplina02.hashCode() : 0);
        result = 31 * result + (codDisciplina03 != null ? codDisciplina03.hashCode() : 0);
        result = 31 * result + (codDisciplina04 != null ? codDisciplina04.hashCode() : 0);
        result = 31 * result + (codDisciplina05 != null ? codDisciplina05.hashCode() : 0);
        result = 31 * result + (codDisciplina06 != null ? codDisciplina06.hashCode() : 0);
        result = 31 * result + (codDisciplina07 != null ? codDisciplina07.hashCode() : 0);
        result = 31 * result + (codDisciplina08 != null ? codDisciplina08.hashCode() : 0);
        result = 31 * result + (codDisciplina09 != null ? codDisciplina09.hashCode() : 0);
        result = 31 * result + (codDisciplina10 != null ? codDisciplina10.hashCode() : 0);
        result = 31 * result + (cancelada != null ? cancelada.hashCode() : 0);
        return result;
    }
}
