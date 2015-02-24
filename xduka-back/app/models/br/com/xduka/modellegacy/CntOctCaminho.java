package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class CntOctCaminho {
    private int caminhoId;
    private int codUnidade;
    private String caminho;
    private Integer númeroArquivoLido;

    @Id
    @Column(name = "Caminho_ID", nullable = false, insertable = true, updatable = true)
    public int getCaminhoId() {
        return caminhoId;
    }

    public void setCaminhoId(int caminhoId) {
        this.caminhoId = caminhoId;
    }

    @Basic
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Basic
    @Column(name = "Caminho", nullable = true, insertable = true, updatable = true)
    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    @Basic
    @Column(name = "NúmeroArquivoLido", nullable = true, insertable = true, updatable = true)
    public Integer getNúmeroArquivoLido() {
        return númeroArquivoLido;
    }

    public void setNúmeroArquivoLido(Integer númeroArquivoLido) {
        this.númeroArquivoLido = númeroArquivoLido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntOctCaminho that = (CntOctCaminho) o;

        if (caminhoId != that.caminhoId) return false;
        if (codUnidade != that.codUnidade) return false;
        if (caminho != null ? !caminho.equals(that.caminho) : that.caminho != null) return false;
        if (númeroArquivoLido != null ? !númeroArquivoLido.equals(that.númeroArquivoLido) : that.númeroArquivoLido != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = caminhoId;
        result = 31 * result + codUnidade;
        result = 31 * result + (caminho != null ? caminho.hashCode() : 0);
        result = 31 * result + (númeroArquivoLido != null ? númeroArquivoLido.hashCode() : 0);
        return result;
    }
}
