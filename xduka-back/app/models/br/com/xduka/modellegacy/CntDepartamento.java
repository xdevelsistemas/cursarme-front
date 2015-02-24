package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntDepartamentoPK.class)
public class CntDepartamento {
    private long departamentoId;
    private int codUnidade;
    private String codDepartamento;
    private String departamento;
    private String codDepartamentoPrincipal;
    private boolean estoque;
    private boolean orçamentoAprovado;

    @Basic
    @Column(name = "Departamento_ID", nullable = false, insertable = true, updatable = true)
    public long getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(long departamentoId) {
        this.departamentoId = departamentoId;
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
    @Column(name = "CodDepartamento", nullable = false, insertable = true, updatable = true)
    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    @Basic
    @Column(name = "Departamento", nullable = true, insertable = true, updatable = true)
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Basic
    @Column(name = "CodDepartamentoPrincipal", nullable = true, insertable = true, updatable = true)
    public String getCodDepartamentoPrincipal() {
        return codDepartamentoPrincipal;
    }

    public void setCodDepartamentoPrincipal(String codDepartamentoPrincipal) {
        this.codDepartamentoPrincipal = codDepartamentoPrincipal;
    }

    @Basic
    @Column(name = "Estoque", nullable = false, insertable = true, updatable = true)
    public boolean isEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }

    @Basic
    @Column(name = "OrçamentoAprovado", nullable = false, insertable = true, updatable = true)
    public boolean isOrçamentoAprovado() {
        return orçamentoAprovado;
    }

    public void setOrçamentoAprovado(boolean orçamentoAprovado) {
        this.orçamentoAprovado = orçamentoAprovado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntDepartamento that = (CntDepartamento) o;

        if (codUnidade != that.codUnidade) return false;
        if (departamentoId != that.departamentoId) return false;
        if (estoque != that.estoque) return false;
        if (orçamentoAprovado != that.orçamentoAprovado) return false;
        if (codDepartamento != null ? !codDepartamento.equals(that.codDepartamento) : that.codDepartamento != null)
            return false;
        if (codDepartamentoPrincipal != null ? !codDepartamentoPrincipal.equals(that.codDepartamentoPrincipal) : that.codDepartamentoPrincipal != null)
            return false;
        if (departamento != null ? !departamento.equals(that.departamento) : that.departamento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (departamentoId ^ (departamentoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (codDepartamento != null ? codDepartamento.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (codDepartamentoPrincipal != null ? codDepartamentoPrincipal.hashCode() : 0);
        result = 31 * result + (estoque ? 1 : 0);
        result = 31 * result + (orçamentoAprovado ? 1 : 0);
        return result;
    }


}
