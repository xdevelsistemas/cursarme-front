package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdIngressoFormaPK.class)
public class AcdIngressoForma {
    private int codUnidade;
    private int codIngressoForma;
    private String ingressoForma;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodIngressoForma", nullable = false, insertable = true, updatable = true)
    public int getCodIngressoForma() {
        return codIngressoForma;
    }

    public void setCodIngressoForma(int codIngressoForma) {
        this.codIngressoForma = codIngressoForma;
    }

    @Basic
    @Column(name = "IngressoForma", nullable = true, insertable = true, updatable = true)
    public String getIngressoForma() {
        return ingressoForma;
    }

    public void setIngressoForma(String ingressoForma) {
        this.ingressoForma = ingressoForma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdIngressoForma that = (AcdIngressoForma) o;

        if (codIngressoForma != that.codIngressoForma) return false;
        if (codUnidade != that.codUnidade) return false;
        if (ingressoForma != null ? !ingressoForma.equals(that.ingressoForma) : that.ingressoForma != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codIngressoForma;
        result = 31 * result + (ingressoForma != null ? ingressoForma.hashCode() : 0);
        return result;
    }
}
