package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class SgrIdentificador {
    private String identificador;
    private String senha;

    @Id
    @Column(name = "Identificador", nullable = false, insertable = true, updatable = true)
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Basic
    @Column(name = "Senha", nullable = true, insertable = true, updatable = true)
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrIdentificador that = (SgrIdentificador) o;

        if (identificador != null ? !identificador.equals(that.identificador) : that.identificador != null)
            return false;
        if (senha != null ? !senha.equals(that.senha) : that.senha != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identificador != null ? identificador.hashCode() : 0;
        result = 31 * result + (senha != null ? senha.hashCode() : 0);
        return result;
    }
}
