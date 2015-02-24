package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdDisciplinaTipoPK.class)
public class AcdDisciplinaTipo {
    private long disciplinaTipoId;
    private int codUnidade;
    private byte codDisciplinaTipo;
    private String disciplinaTipo;
    private List<AcdGradeComponente> acdGradeComponentes;

    @Basic
    @Column(name = "DisciplinaTipo_ID", nullable = false, insertable = true, updatable = true)
    public long getDisciplinaTipoId() {
        return disciplinaTipoId;
    }

    public void setDisciplinaTipoId(long disciplinaTipoId) {
        this.disciplinaTipoId = disciplinaTipoId;
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
    @Column(name = "CodDisciplinaTipo", nullable = false, insertable = true, updatable = true)
    public byte getCodDisciplinaTipo() {
        return codDisciplinaTipo;
    }

    public void setCodDisciplinaTipo(byte codDisciplinaTipo) {
        this.codDisciplinaTipo = codDisciplinaTipo;
    }

    @Basic
    @Column(name = "DisciplinaTipo", nullable = true, insertable = true, updatable = true)
    public String getDisciplinaTipo() {
        return disciplinaTipo;
    }

    public void setDisciplinaTipo(String disciplinaTipo) {
        this.disciplinaTipo = disciplinaTipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdDisciplinaTipo that = (AcdDisciplinaTipo) o;

        if (codDisciplinaTipo != that.codDisciplinaTipo) return false;
        if (codUnidade != that.codUnidade) return false;
        if (disciplinaTipoId != that.disciplinaTipoId) return false;
        if (disciplinaTipo != null ? !disciplinaTipo.equals(that.disciplinaTipo) : that.disciplinaTipo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (disciplinaTipoId ^ (disciplinaTipoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) codDisciplinaTipo;
        result = 31 * result + (disciplinaTipo != null ? disciplinaTipo.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "acdDisciplinaTipo")
    public List<AcdGradeComponente> getAcdGradeComponentes() {
        return acdGradeComponentes;
    }

    public void setAcdGradeComponentes(List<AcdGradeComponente> acdGradeComponentes) {
        this.acdGradeComponentes = acdGradeComponentes;
    }
}
