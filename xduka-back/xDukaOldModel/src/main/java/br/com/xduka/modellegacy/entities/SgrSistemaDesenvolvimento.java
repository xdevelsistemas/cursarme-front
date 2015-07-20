package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class SgrSistemaDesenvolvimento {
    private String sistemaDesenvolvimento;
    private String sistemaResponsável;

    @Id
    @Column(name = "SistemaDesenvolvimento", nullable = false, insertable = true, updatable = true)
    public String getSistemaDesenvolvimento() {
        return sistemaDesenvolvimento;
    }

    public void setSistemaDesenvolvimento(String sistemaDesenvolvimento) {
        this.sistemaDesenvolvimento = sistemaDesenvolvimento;
    }

    @Basic
    @Column(name = "SistemaResponsável", nullable = true, insertable = true, updatable = true)
    public String getSistemaResponsável() {
        return sistemaResponsável;
    }

    public void setSistemaResponsável(String sistemaResponsável) {
        this.sistemaResponsável = sistemaResponsável;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrSistemaDesenvolvimento that = (SgrSistemaDesenvolvimento) o;

        if (sistemaDesenvolvimento != null ? !sistemaDesenvolvimento.equals(that.sistemaDesenvolvimento) : that.sistemaDesenvolvimento != null)
            return false;
        if (sistemaResponsável != null ? !sistemaResponsável.equals(that.sistemaResponsável) : that.sistemaResponsável != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sistemaDesenvolvimento != null ? sistemaDesenvolvimento.hashCode() : 0;
        result = 31 * result + (sistemaResponsável != null ? sistemaResponsável.hashCode() : 0);
        return result;
    }
}
