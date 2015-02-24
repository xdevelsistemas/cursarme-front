package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class SgrLicença {
    private int id;
    private String cliente;
    private String codLicença;
    private String licença;
    private String versão;
    private Long controle;

    @Id
    @Column(name = "Id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Cliente", nullable = true, insertable = true, updatable = true)
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Basic
    @Column(name = "CodLicença", nullable = true, insertable = true, updatable = true)
    public String getCodLicença() {
        return codLicença;
    }

    public void setCodLicença(String codLicença) {
        this.codLicença = codLicença;
    }

    @Basic
    @Column(name = "Licença", nullable = true, insertable = true, updatable = true)
    public String getLicença() {
        return licença;
    }

    public void setLicença(String licença) {
        this.licença = licença;
    }

    @Basic
    @Column(name = "Versão", nullable = true, insertable = true, updatable = true)
    public String getVersão() {
        return versão;
    }

    public void setVersão(String versão) {
        this.versão = versão;
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

        SgrLicença that = (SgrLicença) o;

        if (id != that.id) return false;
        if (cliente != null ? !cliente.equals(that.cliente) : that.cliente != null) return false;
        if (codLicença != null ? !codLicença.equals(that.codLicença) : that.codLicença != null) return false;
        if (controle != null ? !controle.equals(that.controle) : that.controle != null) return false;
        if (licença != null ? !licença.equals(that.licença) : that.licença != null) return false;
        if (versão != null ? !versão.equals(that.versão) : that.versão != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cliente != null ? cliente.hashCode() : 0);
        result = 31 * result + (codLicença != null ? codLicença.hashCode() : 0);
        result = 31 * result + (licença != null ? licença.hashCode() : 0);
        result = 31 * result + (versão != null ? versão.hashCode() : 0);
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        return result;
    }
}
