package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdDependenciaPeriodoPK.class)
public class AcdDependenciaPeriodo {
    private long dependênciaPeríodoId;
    private int codunidade;
    private int anoLetivo;
    private int codCurso;
    private int codPeríodo;
    private int qtdReprovação;
    private int qtdDependência;
    private int qtdAdaptação;
    private Timestamp dataEncerramento;
    private Integer diasLetivos;

    @Basic
    @Column(name = "DependênciaPeríodo_ID", nullable = false, insertable = true, updatable = true)
    public long getDependênciaPeríodoId() {
        return dependênciaPeríodoId;
    }

    public void setDependênciaPeríodoId(long dependênciaPeríodoId) {
        this.dependênciaPeríodoId = dependênciaPeríodoId;
    }

    @Id
    @Column(name = "Codunidade", nullable = false, insertable = true, updatable = true)
    public int getCodunidade() {
        return codunidade;
    }

    public void setCodunidade(int codunidade) {
        this.codunidade = codunidade;
    }

    @Id
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
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
    @Column(name = "QtdReprovação", nullable = false, insertable = true, updatable = true)
    public int getQtdReprovação() {
        return qtdReprovação;
    }

    public void setQtdReprovação(int qtdReprovação) {
        this.qtdReprovação = qtdReprovação;
    }

    @Basic
    @Column(name = "QtdDependência", nullable = false, insertable = true, updatable = true)
    public int getQtdDependência() {
        return qtdDependência;
    }

    public void setQtdDependência(int qtdDependência) {
        this.qtdDependência = qtdDependência;
    }

    @Basic
    @Column(name = "QtdAdaptação", nullable = false, insertable = true, updatable = true)
    public int getQtdAdaptação() {
        return qtdAdaptação;
    }

    public void setQtdAdaptação(int qtdAdaptação) {
        this.qtdAdaptação = qtdAdaptação;
    }

    @Basic
    @Column(name = "DataEncerramento", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Timestamp dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    @Basic
    @Column(name = "DiasLetivos", nullable = true, insertable = true, updatable = true)
    public Integer getDiasLetivos() {
        return diasLetivos;
    }

    public void setDiasLetivos(Integer diasLetivos) {
        this.diasLetivos = diasLetivos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdDependenciaPeriodo that = (AcdDependenciaPeriodo) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codCurso != that.codCurso) return false;
        if (codPeríodo != that.codPeríodo) return false;
        if (codunidade != that.codunidade) return false;
        if (dependênciaPeríodoId != that.dependênciaPeríodoId) return false;
        if (qtdAdaptação != that.qtdAdaptação) return false;
        if (qtdDependência != that.qtdDependência) return false;
        if (qtdReprovação != that.qtdReprovação) return false;
        if (dataEncerramento != null ? !dataEncerramento.equals(that.dataEncerramento) : that.dataEncerramento != null)
            return false;
        if (diasLetivos != null ? !diasLetivos.equals(that.diasLetivos) : that.diasLetivos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dependênciaPeríodoId ^ (dependênciaPeríodoId >>> 32));
        result = 31 * result + codunidade;
        result = 31 * result + anoLetivo;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + qtdReprovação;
        result = 31 * result + qtdDependência;
        result = 31 * result + qtdAdaptação;
        result = 31 * result + (dataEncerramento != null ? dataEncerramento.hashCode() : 0);
        result = 31 * result + (diasLetivos != null ? diasLetivos.hashCode() : 0);
        return result;
    }
}
