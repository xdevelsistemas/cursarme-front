package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
public class SgrObjeto {
    private String codSistema;

    @Basic
    @javax.persistence.Column(name = "CodSistema", nullable = true, insertable = true, updatable = true)
    public String getCodSistema() {
        return codSistema;
    }

    public void setCodSistema(String codSistema) {
        this.codSistema = codSistema;
    }

    private int codObjeto;

    @Id
    @javax.persistence.Column(name = "CodObjeto", nullable = false, insertable = true, updatable = true)
    public int getCodObjeto() {
        return codObjeto;
    }

    public void setCodObjeto(int codObjeto) {
        this.codObjeto = codObjeto;
    }

    private String objeto;

    @Basic
    @javax.persistence.Column(name = "Objeto", nullable = true, insertable = true, updatable = true)
    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    private String nome;

    @Basic
    @javax.persistence.Column(name = "Nome", nullable = true, insertable = true, updatable = true)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String descrição;

    @Basic
    @javax.persistence.Column(name = "Descrição", nullable = true, insertable = true, updatable = true)
    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    private String url;

    @Basic
    @javax.persistence.Column(name = "Url", nullable = true, insertable = true, updatable = true)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private Timestamp dataCriação;

    @Basic
    @javax.persistence.Column(name = "DataCriação", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataCriação() {
        return dataCriação;
    }

    public void setDataCriação(Timestamp dataCriação) {
        this.dataCriação = dataCriação;
    }

    private Timestamp dataModificação;

    @Basic
    @javax.persistence.Column(name = "DataModificação", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataModificação() {
        return dataModificação;
    }

    public void setDataModificação(Timestamp dataModificação) {
        this.dataModificação = dataModificação;
    }

    private byte menu;

    @Basic
    @javax.persistence.Column(name = "Menu", nullable = false, insertable = true, updatable = true)
    public byte getMenu() {
        return menu;
    }

    public void setMenu(byte menu) {
        this.menu = menu;
    }

    private Byte ordem;

    @Basic
    @javax.persistence.Column(name = "Ordem", nullable = true, insertable = true, updatable = true)
    public Byte getOrdem() {
        return ordem;
    }

    public void setOrdem(Byte ordem) {
        this.ordem = ordem;
    }

    private String campos;

    @Basic
    @javax.persistence.Column(name = "Campos", nullable = true, insertable = true, updatable = true)
    public String getCampos() {
        return campos;
    }

    public void setCampos(String campos) {
        this.campos = campos;
    }

    private String consulta;

    @Basic
    @javax.persistence.Column(name = "Consulta", nullable = true, insertable = true, updatable = true)
    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    private boolean link;

    @Basic
    @javax.persistence.Column(name = "Link", nullable = false, insertable = true, updatable = true)
    public boolean isLink() {
        return link;
    }

    public void setLink(boolean link) {
        this.link = link;
    }

    private boolean padrão;

    @Basic
    @javax.persistence.Column(name = "Padrão", nullable = false, insertable = true, updatable = true)
    public boolean isPadrão() {
        return padrão;
    }

    public void setPadrão(boolean padrão) {
        this.padrão = padrão;
    }

    private Integer idNível;

    @Basic
    @javax.persistence.Column(name = "IDNível", nullable = true, insertable = true, updatable = true)
    public Integer getIdNível() {
        return idNível;
    }

    public void setIdNível(Integer idNível) {
        this.idNível = idNível;
    }

    private boolean multiplataforma;

    @Basic
    @javax.persistence.Column(name = "Multiplataforma", nullable = false, insertable = true, updatable = true)
    public boolean isMultiplataforma() {
        return multiplataforma;
    }

    public void setMultiplataforma(boolean multiplataforma) {
        this.multiplataforma = multiplataforma;
    }

    private boolean personalizaControle;

    @Basic
    @javax.persistence.Column(name = "PersonalizaControle", nullable = false, insertable = true, updatable = true)
    public boolean isPersonalizaControle() {
        return personalizaControle;
    }

    public void setPersonalizaControle(boolean personalizaControle) {
        this.personalizaControle = personalizaControle;
    }

    private Timestamp dataÚltimoAcesso;

    @Basic
    @javax.persistence.Column(name = "DataÚltimoAcesso", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataÚltimoAcesso() {
        return dataÚltimoAcesso;
    }

    public void setDataÚltimoAcesso(Timestamp dataÚltimoAcesso) {
        this.dataÚltimoAcesso = dataÚltimoAcesso;
    }

    private String ajuda;

    @Basic
    @javax.persistence.Column(name = "Ajuda", nullable = true, insertable = true, updatable = true)
    public String getAjuda() {
        return ajuda;
    }

    public void setAjuda(String ajuda) {
        this.ajuda = ajuda;
    }

    private Long acesso;

    @Basic
    @javax.persistence.Column(name = "Acesso", nullable = true, insertable = true, updatable = true)
    public Long getAcesso() {
        return acesso;
    }

    public void setAcesso(Long acesso) {
        this.acesso = acesso;
    }

    private boolean nãoUtilizado;

    @Basic
    @javax.persistence.Column(name = "NãoUtilizado", nullable = false, insertable = true, updatable = true)
    public boolean isNãoUtilizado() {
        return nãoUtilizado;
    }

    public void setNãoUtilizado(boolean nãoUtilizado) {
        this.nãoUtilizado = nãoUtilizado;
    }

    private boolean excluído;

    @Basic
    @javax.persistence.Column(name = "Excluído", nullable = false, insertable = true, updatable = true)
    public boolean isExcluído() {
        return excluído;
    }

    public void setExcluído(boolean excluído) {
        this.excluído = excluído;
    }

    private Integer controle;

    @Basic
    @javax.persistence.Column(name = "Controle", nullable = true, insertable = true, updatable = true)
    public Integer getControle() {
        return controle;
    }

    public void setControle(Integer controle) {
        this.controle = controle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrObjeto sgrObjeto = (SgrObjeto) o;

        if (codObjeto != sgrObjeto.codObjeto) return false;
        if (excluído != sgrObjeto.excluído) return false;
        if (link != sgrObjeto.link) return false;
        if (menu != sgrObjeto.menu) return false;
        if (multiplataforma != sgrObjeto.multiplataforma) return false;
        if (nãoUtilizado != sgrObjeto.nãoUtilizado) return false;
        if (padrão != sgrObjeto.padrão) return false;
        if (personalizaControle != sgrObjeto.personalizaControle) return false;
        if (acesso != null ? !acesso.equals(sgrObjeto.acesso) : sgrObjeto.acesso != null) return false;
        if (ajuda != null ? !ajuda.equals(sgrObjeto.ajuda) : sgrObjeto.ajuda != null) return false;
        if (campos != null ? !campos.equals(sgrObjeto.campos) : sgrObjeto.campos != null) return false;
        if (codSistema != null ? !codSistema.equals(sgrObjeto.codSistema) : sgrObjeto.codSistema != null) return false;
        if (consulta != null ? !consulta.equals(sgrObjeto.consulta) : sgrObjeto.consulta != null) return false;
        if (controle != null ? !controle.equals(sgrObjeto.controle) : sgrObjeto.controle != null) return false;
        if (dataCriação != null ? !dataCriação.equals(sgrObjeto.dataCriação) : sgrObjeto.dataCriação != null)
            return false;
        if (dataModificação != null ? !dataModificação.equals(sgrObjeto.dataModificação) : sgrObjeto.dataModificação != null)
            return false;
        if (dataÚltimoAcesso != null ? !dataÚltimoAcesso.equals(sgrObjeto.dataÚltimoAcesso) : sgrObjeto.dataÚltimoAcesso != null)
            return false;
        if (descrição != null ? !descrição.equals(sgrObjeto.descrição) : sgrObjeto.descrição != null) return false;
        if (idNível != null ? !idNível.equals(sgrObjeto.idNível) : sgrObjeto.idNível != null) return false;
        if (nome != null ? !nome.equals(sgrObjeto.nome) : sgrObjeto.nome != null) return false;
        if (objeto != null ? !objeto.equals(sgrObjeto.objeto) : sgrObjeto.objeto != null) return false;
        if (ordem != null ? !ordem.equals(sgrObjeto.ordem) : sgrObjeto.ordem != null) return false;
        if (url != null ? !url.equals(sgrObjeto.url) : sgrObjeto.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codSistema != null ? codSistema.hashCode() : 0;
        result = 31 * result + codObjeto;
        result = 31 * result + (objeto != null ? objeto.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (descrição != null ? descrição.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (dataCriação != null ? dataCriação.hashCode() : 0);
        result = 31 * result + (dataModificação != null ? dataModificação.hashCode() : 0);
        result = 31 * result + (int) menu;
        result = 31 * result + (ordem != null ? ordem.hashCode() : 0);
        result = 31 * result + (campos != null ? campos.hashCode() : 0);
        result = 31 * result + (consulta != null ? consulta.hashCode() : 0);
        result = 31 * result + (link ? 1 : 0);
        result = 31 * result + (padrão ? 1 : 0);
        result = 31 * result + (idNível != null ? idNível.hashCode() : 0);
        result = 31 * result + (multiplataforma ? 1 : 0);
        result = 31 * result + (personalizaControle ? 1 : 0);
        result = 31 * result + (dataÚltimoAcesso != null ? dataÚltimoAcesso.hashCode() : 0);
        result = 31 * result + (ajuda != null ? ajuda.hashCode() : 0);
        result = 31 * result + (acesso != null ? acesso.hashCode() : 0);
        result = 31 * result + (nãoUtilizado ? 1 : 0);
        result = 31 * result + (excluído ? 1 : 0);
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        return result;
    }
}
