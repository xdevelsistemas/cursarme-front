package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@Table(name = "sgrUsuárioNível", schema = "dbo", catalog = "xDuka")
public class SgrUsuarioNível {
    private int idNível;
    private String nível;
    private boolean desenvolvedor;
    private boolean administrador;
    private boolean supervisor;
    private boolean usuário;

    @Id
    @Column(name = "IDNível", nullable = false, insertable = true, updatable = true)
    public int getIdNível() {
        return idNível;
    }

    public void setIdNível(int idNível) {
        this.idNível = idNível;
    }

    @Basic
    @Column(name = "Nível", nullable = true, insertable = true, updatable = true)
    public String getNível() {
        return nível;
    }

    public void setNível(String nível) {
        this.nível = nível;
    }

    @Basic
    @Column(name = "Desenvolvedor", nullable = false, insertable = true, updatable = true)
    public boolean isDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(boolean desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    @Basic
    @Column(name = "Administrador", nullable = false, insertable = true, updatable = true)
    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    @Basic
    @Column(name = "Supervisor", nullable = false, insertable = true, updatable = true)
    public boolean isSupervisor() {
        return supervisor;
    }

    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }

    @Basic
    @Column(name = "Usuário", nullable = false, insertable = true, updatable = true)
    public boolean isUsuário() {
        return usuário;
    }

    public void setUsuário(boolean usuário) {
        this.usuário = usuário;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrUsuarioNível that = (SgrUsuarioNível) o;

        if (administrador != that.administrador) return false;
        if (desenvolvedor != that.desenvolvedor) return false;
        if (idNível != that.idNível) return false;
        if (supervisor != that.supervisor) return false;
        if (usuário != that.usuário) return false;
        if (nível != null ? !nível.equals(that.nível) : that.nível != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idNível;
        result = 31 * result + (nível != null ? nível.hashCode() : 0);
        result = 31 * result + (desenvolvedor ? 1 : 0);
        result = 31 * result + (administrador ? 1 : 0);
        result = 31 * result + (supervisor ? 1 : 0);
        result = 31 * result + (usuário ? 1 : 0);
        return result;
    }
}
