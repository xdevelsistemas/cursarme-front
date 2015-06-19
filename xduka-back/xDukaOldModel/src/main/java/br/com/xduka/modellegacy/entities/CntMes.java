package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "cntMês", schema = "dbo")
@IdClass(CntMesPK.class)
public class CntMes {
    private int codUnidade;
    private int mês;
    private Boolean encerrado;
//    private List<CntMesSaldo> cntMêsSaldos;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "Mês", nullable = false, insertable = true, updatable = true)
    public int getMês() {
        return mês;
    }

    public void setMês(int mês) {
        this.mês = mês;
    }

    @Basic
    @Column(name = "Encerrado", nullable = true, insertable = true, updatable = true)
    public Boolean getEncerrado() {
        return encerrado;
    }

    public void setEncerrado(Boolean encerrado) {
        this.encerrado = encerrado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntMes cntMes = (CntMes) o;

        if (codUnidade != cntMes.codUnidade) return false;
        if (mês != cntMes.mês) return false;
        if (encerrado != null ? !encerrado.equals(cntMes.encerrado) : cntMes.encerrado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + mês;
        result = 31 * result + (encerrado != null ? encerrado.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "cntMês")
//    public List<CntMesSaldo> getCntMêsSaldos() {
//        return cntMêsSaldos;
//    }
//
//    public void setCntMêsSaldos(List<CntMesSaldo> cntMêsSaldos) {
//        this.cntMêsSaldos = cntMêsSaldos;
//    }
}
