package models.br.com.xduka.modellegacy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@javax.persistence.Table(name = "sgrUsuário", schema = "dbo", catalog = "xDuka")
public class SgrUsuario {
    private int idUsuário;

    @Id
    @javax.persistence.Column(name = "IDUsuário", nullable = false, insertable = true, updatable = true)
    public int getIdUsuário() {
        return idUsuário;
    }

    public void setIdUsuário(int idUsuário) {
        this.idUsuário = idUsuário;
    }

    private String usuário;

    @Basic
    @javax.persistence.Column(name = "Usuário", nullable = true, insertable = true, updatable = true)
    public String getUsuário() {
        return usuário;
    }

    public void setUsuário(String usuário) {
        this.usuário = usuário;
    }

    private String senha;

    @Basic
    @javax.persistence.Column(name = "Senha", nullable = true, insertable = true, updatable = true)
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private boolean bloqueada;

    @Basic
    @javax.persistence.Column(name = "Bloqueada", nullable = false, insertable = true, updatable = true)
    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
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

    private Byte tentativa;

    @Basic
    @javax.persistence.Column(name = "Tentativa", nullable = true, insertable = true, updatable = true)
    public Byte getTentativa() {
        return tentativa;
    }

    public void setTentativa(Byte tentativa) {
        this.tentativa = tentativa;
    }

    private String pautaSérie;

    @Basic
    @javax.persistence.Column(name = "PautaSérie", nullable = true, insertable = true, updatable = true)
    public String getPautaSérie() {
        return pautaSérie;
    }

    public void setPautaSérie(String pautaSérie) {
        this.pautaSérie = pautaSérie;
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

    private boolean logado;

    @Basic
    @javax.persistence.Column(name = "Logado", nullable = false, insertable = true, updatable = true)
    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    private Timestamp nascimento;

    @Basic
    @javax.persistence.Column(name = "Nascimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getNascimento() {
        return nascimento;
    }

    public void setNascimento(Timestamp nascimento) {
        this.nascimento = nascimento;
    }

    private String mensagem;

    @Basic
    @javax.persistence.Column(name = "Mensagem", nullable = true, insertable = true, updatable = true)
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    private byte[] figura;

    @Basic
    @javax.persistence.Column(name = "Figura", nullable = true, insertable = true, updatable = true)
    public byte[] getFigura() {
        return figura;
    }

    public void setFigura(byte[] figura) {
        this.figura = figura;
    }

    private boolean lida;

    @Basic
    @javax.persistence.Column(name = "Lida", nullable = false, insertable = true, updatable = true)
    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }

    private Short codProfessor;

    @Basic
    @javax.persistence.Column(name = "CodProfessor", nullable = true, insertable = true, updatable = true)
    public Short getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Short codProfessor) {
        this.codProfessor = codProfessor;
    }

    private Integer idUsuárioPerfil;

    @Basic
    @javax.persistence.Column(name = "IDUsuárioPerfil", nullable = true, insertable = true, updatable = true)
    public Integer getIdUsuárioPerfil() {
        return idUsuárioPerfil;
    }

    public void setIdUsuárioPerfil(Integer idUsuárioPerfil) {
        this.idUsuárioPerfil = idUsuárioPerfil;
    }

    private Timestamp vencimento;

    @Basic
    @javax.persistence.Column(name = "Vencimento", nullable = true, insertable = true, updatable = true)
    public Timestamp getVencimento() {
        return vencimento;
    }

    public void setVencimento(Timestamp vencimento) {
        this.vencimento = vencimento;
    }

    private String senhaResponsável;

    @Basic
    @javax.persistence.Column(name = "SenhaResponsável", nullable = true, insertable = true, updatable = true)
    public String getSenhaResponsável() {
        return senhaResponsável;
    }

    public void setSenhaResponsável(String senhaResponsável) {
        this.senhaResponsável = senhaResponsável;
    }

    private String urlFtp;

    @Basic
    @javax.persistence.Column(name = "UrlFtp", nullable = true, insertable = true, updatable = true)
    public String getUrlFtp() {
        return urlFtp;
    }

    public void setUrlFtp(String urlFtp) {
        this.urlFtp = urlFtp;
    }

    private String urlMail;

    @Basic
    @javax.persistence.Column(name = "UrlMail", nullable = true, insertable = true, updatable = true)
    public String getUrlMail() {
        return urlMail;
    }

    public void setUrlMail(String urlMail) {
        this.urlMail = urlMail;
    }

    private String mail;

    @Basic
    @javax.persistence.Column(name = "Mail", nullable = true, insertable = true, updatable = true)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    private Timestamp expiraData;

    @Basic
    @javax.persistence.Column(name = "ExpiraData", nullable = true, insertable = true, updatable = true)
    public Timestamp getExpiraData() {
        return expiraData;
    }

    public void setExpiraData(Timestamp expiraData) {
        this.expiraData = expiraData;
    }

    private Timestamp data;

    @Basic
    @javax.persistence.Column(name = "Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
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

    private Boolean feed;

    @Basic
    @javax.persistence.Column(name = "Feed", nullable = true, insertable = true, updatable = true)
    public Boolean getFeed() {
        return feed;
    }

    public void setFeed(Boolean feed) {
        this.feed = feed;
    }

    private Boolean listaAniversariante;

    @Basic
    @javax.persistence.Column(name = "ListaAniversariante", nullable = true, insertable = true, updatable = true)
    public Boolean getListaAniversariante() {
        return listaAniversariante;
    }

    public void setListaAniversariante(Boolean listaAniversariante) {
        this.listaAniversariante = listaAniversariante;
    }

    private Timestamp últimoAcesso;

    @Basic
    @javax.persistence.Column(name = "ÚltimoAcesso", nullable = true, insertable = true, updatable = true)
    public Timestamp getÚltimoAcesso() {
        return últimoAcesso;
    }

    public void setÚltimoAcesso(Timestamp últimoAcesso) {
        this.últimoAcesso = últimoAcesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SgrUsuario that = (SgrUsuario) o;

        if (bloqueada != that.bloqueada) return false;
        if (idUsuário != that.idUsuário) return false;
        if (lida != that.lida) return false;
        if (logado != that.logado) return false;
        if (acesso != null ? !acesso.equals(that.acesso) : that.acesso != null) return false;
        if (codProfessor != null ? !codProfessor.equals(that.codProfessor) : that.codProfessor != null) return false;
        if (controle != null ? !controle.equals(that.controle) : that.controle != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (expiraData != null ? !expiraData.equals(that.expiraData) : that.expiraData != null) return false;
        if (feed != null ? !feed.equals(that.feed) : that.feed != null) return false;
        if (!Arrays.equals(figura, that.figura)) return false;
        if (idNível != null ? !idNível.equals(that.idNível) : that.idNível != null) return false;
        if (idUsuárioPerfil != null ? !idUsuárioPerfil.equals(that.idUsuárioPerfil) : that.idUsuárioPerfil != null)
            return false;
        if (listaAniversariante != null ? !listaAniversariante.equals(that.listaAniversariante) : that.listaAniversariante != null)
            return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
        if (mensagem != null ? !mensagem.equals(that.mensagem) : that.mensagem != null) return false;
        if (nascimento != null ? !nascimento.equals(that.nascimento) : that.nascimento != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (pautaSérie != null ? !pautaSérie.equals(that.pautaSérie) : that.pautaSérie != null) return false;
        if (senha != null ? !senha.equals(that.senha) : that.senha != null) return false;
        if (senhaResponsável != null ? !senhaResponsável.equals(that.senhaResponsável) : that.senhaResponsável != null)
            return false;
        if (tentativa != null ? !tentativa.equals(that.tentativa) : that.tentativa != null) return false;
        if (urlFtp != null ? !urlFtp.equals(that.urlFtp) : that.urlFtp != null) return false;
        if (urlMail != null ? !urlMail.equals(that.urlMail) : that.urlMail != null) return false;
        if (usuário != null ? !usuário.equals(that.usuário) : that.usuário != null) return false;
        if (vencimento != null ? !vencimento.equals(that.vencimento) : that.vencimento != null) return false;
        if (últimoAcesso != null ? !últimoAcesso.equals(that.últimoAcesso) : that.últimoAcesso != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuário;
        result = 31 * result + (usuário != null ? usuário.hashCode() : 0);
        result = 31 * result + (senha != null ? senha.hashCode() : 0);
        result = 31 * result + (bloqueada ? 1 : 0);
        result = 31 * result + (idNível != null ? idNível.hashCode() : 0);
        result = 31 * result + (tentativa != null ? tentativa.hashCode() : 0);
        result = 31 * result + (pautaSérie != null ? pautaSérie.hashCode() : 0);
        result = 31 * result + (controle != null ? controle.hashCode() : 0);
        result = 31 * result + (logado ? 1 : 0);
        result = 31 * result + (nascimento != null ? nascimento.hashCode() : 0);
        result = 31 * result + (mensagem != null ? mensagem.hashCode() : 0);
        result = 31 * result + (figura != null ? Arrays.hashCode(figura) : 0);
        result = 31 * result + (lida ? 1 : 0);
        result = 31 * result + (codProfessor != null ? codProfessor.hashCode() : 0);
        result = 31 * result + (idUsuárioPerfil != null ? idUsuárioPerfil.hashCode() : 0);
        result = 31 * result + (vencimento != null ? vencimento.hashCode() : 0);
        result = 31 * result + (senhaResponsável != null ? senhaResponsável.hashCode() : 0);
        result = 31 * result + (urlFtp != null ? urlFtp.hashCode() : 0);
        result = 31 * result + (urlMail != null ? urlMail.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (expiraData != null ? expiraData.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (acesso != null ? acesso.hashCode() : 0);
        result = 31 * result + (feed != null ? feed.hashCode() : 0);
        result = 31 * result + (listaAniversariante != null ? listaAniversariante.hashCode() : 0);
        result = 31 * result + (últimoAcesso != null ? últimoAcesso.hashCode() : 0);
        return result;
    }
}
