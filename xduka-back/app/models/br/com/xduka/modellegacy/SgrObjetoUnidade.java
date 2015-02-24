package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(SgrObjetoUnidadePK.class)
public class SgrObjetoUnidade {
    private long objetoUnidadeId;
    private int codObjeto;
    private int codUnidade;
    private boolean disponível;
    private Long controle;
    private List<SgrAbertura> sgrAberturas;
    private List<SgrObjetoAcesso> sgrObjetoAcessos;

    @Basic
    @Column(name = "ObjetoUnidade_ID", nullable = false, insertable = true, updatable = true)
    public long getObjetoUnidadeId() {
        return objetoUnidadeId;
    }

    public void setObjetoUnidadeId(long objetoUnidadeId) {
        this.objetoUnidadeId = objetoUnidadeId;
    }

    @Id
    @Column(name = "CodObjeto", nullable = false, insertable = true, updatable = true)
    public int getCodObjeto() {
        return codObjeto;
    }

    public void setCodObjeto(int codObjeto) {
        this.codObjeto = codObjeto;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "Disponível", nullable = false, insertable = true, updatable = true)
    public boolean isDisponível() {
        return disponível;
    }

    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }

    @Basic
    @Column(name = "Controle", nullable = true, insertable = true, updatable = true)
    public Long getControle() {
        return controle;
    }

    public void setControle(Long controle) {
        this.controle = controle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrObjetoUnidade that = (SgrObjetoUnidade) o;

        if (codObjeto != that.codObjeto) return false;
        if (codUnidade != that.codUnidade) return false;
        if (disponível != that.disponível) return false;
        if (objetoUnidadeId != that.objetoUnidadeId) return false;
        if (controle != null ? !controle.equals(that.controle) : that.controle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (objetoUnidadeId ^ (objetoUnidadeId >>> 32));
        result = 31 * result + codObjeto;
        result = 31 * result + codUnidade;
        result = 31 * result + (disponível ? 1 : 0);
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sgrObjetoUnidade")
    public List<SgrAbertura> getSgrAberturas() {
        return sgrAberturas;
    }

    public void setSgrAberturas(List<SgrAbertura> sgrAberturas) {
        this.sgrAberturas = sgrAberturas;
    }

    @OneToMany(mappedBy = "sgrObjetoUnidade")
    public List<SgrObjetoAcesso> getSgrObjetoAcessos() {
        return sgrObjetoAcessos;
    }

    public void setSgrObjetoAcessos(List<SgrObjetoAcesso> sgrObjetoAcessos) {
        this.sgrObjetoAcessos = sgrObjetoAcessos;
    }
}
