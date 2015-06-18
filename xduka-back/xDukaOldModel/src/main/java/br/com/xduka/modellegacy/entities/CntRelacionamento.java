package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CntRelacionamentoPK.class)
public class CntRelacionamento {
    private long relacionamentoId;

    @Basic
    @javax.persistence.Column(name = "Relacionamento_ID", nullable = false, insertable = true, updatable = true)
    public long getRelacionamentoId() {
        return relacionamentoId;
    }

    public void setRelacionamentoId(long relacionamentoId) {
        this.relacionamentoId = relacionamentoId;
    }

    private int codUnidade;

    @Id
    @javax.persistence.Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    private int codRelacionamento;

    @Id
    @javax.persistence.Column(name = "CodRelacionamento", nullable = false, insertable = true, updatable = true)
    public int getCodRelacionamento() {
        return codRelacionamento;
    }

    public void setCodRelacionamento(int codRelacionamento) {
        this.codRelacionamento = codRelacionamento;
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

    private String apelido;

    @Basic
    @javax.persistence.Column(name = "Apelido", nullable = true, insertable = true, updatable = true)
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    private byte[] foto;

    @Basic
    @javax.persistence.Column(name = "Foto", nullable = true, insertable = true, updatable = true)
    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    private Integer codRelacionamentoTipo;

    @Basic
    @javax.persistence.Column(name = "CodRelacionamentoTipo", nullable = true, insertable = true, updatable = true)
    public Integer getCodRelacionamentoTipo() {
        return codRelacionamentoTipo;
    }

    public void setCodRelacionamentoTipo(Integer codRelacionamentoTipo) {
        this.codRelacionamentoTipo = codRelacionamentoTipo;
    }

    private Short codGrupo;

    @Basic
    @javax.persistence.Column(name = "CodGrupo", nullable = true, insertable = true, updatable = true)
    public Short getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(Short codGrupo) {
        this.codGrupo = codGrupo;
    }

    private boolean pessoaFísica;

    @Basic
    @javax.persistence.Column(name = "PessoaFísica", nullable = false, insertable = true, updatable = true)
    public boolean isPessoaFísica() {
        return pessoaFísica;
    }

    public void setPessoaFísica(boolean pessoaFísica) {
        this.pessoaFísica = pessoaFísica;
    }

    private String sexo;

    @Basic
    @javax.persistence.Column(name = "Sexo", nullable = true, insertable = true, updatable = true)
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private String cpf;

    @Basic
    @javax.persistence.Column(name = "CPF", nullable = true, insertable = true, updatable = true)
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String rg;

    @Basic
    @javax.persistence.Column(name = "RG", nullable = true, insertable = true, updatable = true)
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    private String rgExpedição;

    @Basic
    @javax.persistence.Column(name = "RGExpedição", nullable = true, insertable = true, updatable = true)
    public String getRgExpedição() {
        return rgExpedição;
    }

    public void setRgExpedição(String rgExpedição) {
        this.rgExpedição = rgExpedição;
    }

    private Timestamp rgData;

    @Basic
    @javax.persistence.Column(name = "RGData", nullable = true, insertable = true, updatable = true)
    public Timestamp getRgData() {
        return rgData;
    }

    public void setRgData(Timestamp rgData) {
        this.rgData = rgData;
    }

    private String rguf;

    @Basic
    @javax.persistence.Column(name = "RGUF", nullable = true, insertable = true, updatable = true)
    public String getRguf() {
        return rguf;
    }

    public void setRguf(String rguf) {
        this.rguf = rguf;
    }

    private String im;

    @Basic
    @javax.persistence.Column(name = "IM", nullable = true, insertable = true, updatable = true)
    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    private String títuloEleitor;

    @Basic
    @javax.persistence.Column(name = "TítuloEleitor", nullable = true, insertable = true, updatable = true)
    public String getTítuloEleitor() {
        return títuloEleitor;
    }

    public void setTítuloEleitor(String títuloEleitor) {
        this.títuloEleitor = títuloEleitor;
    }

    private String títuloEleitorZona;

    @Basic
    @javax.persistence.Column(name = "TítuloEleitorZona", nullable = true, insertable = true, updatable = true)
    public String getTítuloEleitorZona() {
        return títuloEleitorZona;
    }

    public void setTítuloEleitorZona(String títuloEleitorZona) {
        this.títuloEleitorZona = títuloEleitorZona;
    }

    private String títuloEleitorSeção;

    @Basic
    @javax.persistence.Column(name = "TítuloEleitorSeção", nullable = true, insertable = true, updatable = true)
    public String getTítuloEleitorSeção() {
        return títuloEleitorSeção;
    }

    public void setTítuloEleitorSeção(String títuloEleitorSeção) {
        this.títuloEleitorSeção = títuloEleitorSeção;
    }

    private String títuloEleitorUf;

    @Basic
    @javax.persistence.Column(name = "TítuloEleitorUF", nullable = true, insertable = true, updatable = true)
    public String getTítuloEleitorUf() {
        return títuloEleitorUf;
    }

    public void setTítuloEleitorUf(String títuloEleitorUf) {
        this.títuloEleitorUf = títuloEleitorUf;
    }

    private Byte certificadoMilitar;

    @Basic
    @javax.persistence.Column(name = "CertificadoMilitar", nullable = true, insertable = true, updatable = true)
    public Byte getCertificadoMilitar() {
        return certificadoMilitar;
    }

    public void setCertificadoMilitar(Byte certificadoMilitar) {
        this.certificadoMilitar = certificadoMilitar;
    }

    private String certificadoMilitarNúmero;

    @Basic
    @javax.persistence.Column(name = "CertificadoMilitarNúmero", nullable = true, insertable = true, updatable = true)
    public String getCertificadoMilitarNúmero() {
        return certificadoMilitarNúmero;
    }

    public void setCertificadoMilitarNúmero(String certificadoMilitarNúmero) {
        this.certificadoMilitarNúmero = certificadoMilitarNúmero;
    }

    private String certificadoMilitarCategoria;

    @Basic
    @javax.persistence.Column(name = "CertificadoMilitarCategoria", nullable = true, insertable = true, updatable = true)
    public String getCertificadoMilitarCategoria() {
        return certificadoMilitarCategoria;
    }

    public void setCertificadoMilitarCategoria(String certificadoMilitarCategoria) {
        this.certificadoMilitarCategoria = certificadoMilitarCategoria;
    }

    private String certificadoMilitarRegião;

    @Basic
    @javax.persistence.Column(name = "CertificadoMilitarRegião", nullable = true, insertable = true, updatable = true)
    public String getCertificadoMilitarRegião() {
        return certificadoMilitarRegião;
    }

    public void setCertificadoMilitarRegião(String certificadoMilitarRegião) {
        this.certificadoMilitarRegião = certificadoMilitarRegião;
    }

    private String certificadoMilitarUf;

    @Basic
    @javax.persistence.Column(name = "CertificadoMilitarUF", nullable = true, insertable = true, updatable = true)
    public String getCertificadoMilitarUf() {
        return certificadoMilitarUf;
    }

    public void setCertificadoMilitarUf(String certificadoMilitarUf) {
        this.certificadoMilitarUf = certificadoMilitarUf;
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

    private String nacionalidade;

    @Basic
    @javax.persistence.Column(name = "Nacionalidade", nullable = true, insertable = true, updatable = true)
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private String naturalidadeCidade;

    @Basic
    @javax.persistence.Column(name = "NaturalidadeCidade", nullable = true, insertable = true, updatable = true)
    public String getNaturalidadeCidade() {
        return naturalidadeCidade;
    }

    public void setNaturalidadeCidade(String naturalidadeCidade) {
        this.naturalidadeCidade = naturalidadeCidade;
    }

    private String naturalidadeUf;

    @Basic
    @javax.persistence.Column(name = "NaturalidadeUF", nullable = true, insertable = true, updatable = true)
    public String getNaturalidadeUf() {
        return naturalidadeUf;
    }

    public void setNaturalidadeUf(String naturalidadeUf) {
        this.naturalidadeUf = naturalidadeUf;
    }

    private String codDepartamento;

    @Basic
    @javax.persistence.Column(name = "CodDepartamento", nullable = true, insertable = true, updatable = true)
    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    private Timestamp dataAssinatura;

    @Basic
    @javax.persistence.Column(name = "DataAssinatura", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(Timestamp dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    private Timestamp dataInclusão;

    @Basic
    @javax.persistence.Column(name = "DataInclusão", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataInclusão() {
        return dataInclusão;
    }

    public void setDataInclusão(Timestamp dataInclusão) {
        this.dataInclusão = dataInclusão;
    }

    private Integer codCadastro;

    @Basic
    @javax.persistence.Column(name = "CodCadastro", nullable = true, insertable = true, updatable = true)
    public Integer getCodCadastro() {
        return codCadastro;
    }

    public void setCodCadastro(Integer codCadastro) {
        this.codCadastro = codCadastro;
    }

    private Timestamp dataUltimaEdição;

    @Basic
    @javax.persistence.Column(name = "DataUltimaEdição", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataUltimaEdição() {
        return dataUltimaEdição;
    }

    public void setDataUltimaEdição(Timestamp dataUltimaEdição) {
        this.dataUltimaEdição = dataUltimaEdição;
    }

    private String homePage;

    @Basic
    @javax.persistence.Column(name = "HomePage", nullable = true, insertable = true, updatable = true)
    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "Email", nullable = true, insertable = true, updatable = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private boolean selecionado;

    @Basic
    @javax.persistence.Column(name = "Selecionado", nullable = false, insertable = true, updatable = true)
    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }

    private Integer codEmpresa;

    @Basic
    @javax.persistence.Column(name = "CodEmpresa", nullable = true, insertable = true, updatable = true)
    public Integer getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    private String religião;

    @Basic
    @javax.persistence.Column(name = "Religião", nullable = true, insertable = true, updatable = true)
    public String getReligião() {
        return religião;
    }

    public void setReligião(String religião) {
        this.religião = religião;
    }

    private Integer codAgência;

    @Basic
    @javax.persistence.Column(name = "CodAgência", nullable = true, insertable = true, updatable = true)
    public Integer getCodAgência() {
        return codAgência;
    }

    public void setCodAgência(Integer codAgência) {
        this.codAgência = codAgência;
    }

    private boolean cancelado;

    @Basic
    @javax.persistence.Column(name = "Cancelado", nullable = false, insertable = true, updatable = true)
    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    private String pronomeTratamento;

    @Basic
    @javax.persistence.Column(name = "PronomeTratamento", nullable = true, insertable = true, updatable = true)
    public String getPronomeTratamento() {
        return pronomeTratamento;
    }

    public void setPronomeTratamento(String pronomeTratamento) {
        this.pronomeTratamento = pronomeTratamento;
    }

    private Byte certidão;

    @Basic
    @javax.persistence.Column(name = "Certidão", nullable = true, insertable = true, updatable = true)
    public Byte getCertidão() {
        return certidão;
    }

    public void setCertidão(Byte certidão) {
        this.certidão = certidão;
    }

    private String certidãoNúmero;

    @Basic
    @javax.persistence.Column(name = "CertidãoNúmero", nullable = true, insertable = true, updatable = true)
    public String getCertidãoNúmero() {
        return certidãoNúmero;
    }

    public void setCertidãoNúmero(String certidãoNúmero) {
        this.certidãoNúmero = certidãoNúmero;
    }

    private String certidãoCartório;

    @Basic
    @javax.persistence.Column(name = "CertidãoCartório", nullable = true, insertable = true, updatable = true)
    public String getCertidãoCartório() {
        return certidãoCartório;
    }

    public void setCertidãoCartório(String certidãoCartório) {
        this.certidãoCartório = certidãoCartório;
    }

    private String certidãoLivro;

    @Basic
    @javax.persistence.Column(name = "CertidãoLivro", nullable = true, insertable = true, updatable = true)
    public String getCertidãoLivro() {
        return certidãoLivro;
    }

    public void setCertidãoLivro(String certidãoLivro) {
        this.certidãoLivro = certidãoLivro;
    }

    private String certidãoFolhas;

    @Basic
    @javax.persistence.Column(name = "CertidãoFolhas", nullable = true, insertable = true, updatable = true)
    public String getCertidãoFolhas() {
        return certidãoFolhas;
    }

    public void setCertidãoFolhas(String certidãoFolhas) {
        this.certidãoFolhas = certidãoFolhas;
    }

    private String certidãoCidade;

    @Basic
    @javax.persistence.Column(name = "CertidãoCidade", nullable = true, insertable = true, updatable = true)
    public String getCertidãoCidade() {
        return certidãoCidade;
    }

    public void setCertidãoCidade(String certidãoCidade) {
        this.certidãoCidade = certidãoCidade;
    }

    private String certidãoUf;

    @Basic
    @javax.persistence.Column(name = "CertidãoUF", nullable = true, insertable = true, updatable = true)
    public String getCertidãoUf() {
        return certidãoUf;
    }

    public void setCertidãoUf(String certidãoUf) {
        this.certidãoUf = certidãoUf;
    }

    private Byte histórico;

    @Basic
    @javax.persistence.Column(name = "Histórico", nullable = true, insertable = true, updatable = true)
    public Byte getHistórico() {
        return histórico;
    }

    public void setHistórico(Byte histórico) {
        this.histórico = histórico;
    }

    private Byte foto3X4;

    @Basic
    @javax.persistence.Column(name = "Foto3x4", nullable = true, insertable = true, updatable = true)
    public Byte getFoto3X4() {
        return foto3X4;
    }

    public void setFoto3X4(Byte foto3X4) {
        this.foto3X4 = foto3X4;
    }

    private boolean falecido;

    @Basic
    @javax.persistence.Column(name = "Falecido", nullable = false, insertable = true, updatable = true)
    public boolean isFalecido() {
        return falecido;
    }

    public void setFalecido(boolean falecido) {
        this.falecido = falecido;
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

    private String paiNome;

    @Basic
    @javax.persistence.Column(name = "PaiNome", nullable = true, insertable = true, updatable = true)
    public String getPaiNome() {
        return paiNome;
    }

    public void setPaiNome(String paiNome) {
        this.paiNome = paiNome;
    }

    private Byte codEstadoCivil;

    @Basic
    @javax.persistence.Column(name = "CodEstadoCivil", nullable = true, insertable = true, updatable = true)
    public Byte getCodEstadoCivil() {
        return codEstadoCivil;
    }

    public void setCodEstadoCivil(Byte codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
    }

    private String mãeNome;

    @Basic
    @javax.persistence.Column(name = "MãeNome", nullable = true, insertable = true, updatable = true)
    public String getMãeNome() {
        return mãeNome;
    }

    public void setMãeNome(String mãeNome) {
        this.mãeNome = mãeNome;
    }

    private String cargo;

    @Basic
    @javax.persistence.Column(name = "Cargo", nullable = true, insertable = true, updatable = true)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private String empresaFunção;

    @Basic
    @javax.persistence.Column(name = "EmpresaFunção", nullable = true, insertable = true, updatable = true)
    public String getEmpresaFunção() {
        return empresaFunção;
    }

    public void setEmpresaFunção(String empresaFunção) {
        this.empresaFunção = empresaFunção;
    }

    private String conjugueNome;

    @Basic
    @javax.persistence.Column(name = "ConjugueNome", nullable = true, insertable = true, updatable = true)
    public String getConjugueNome() {
        return conjugueNome;
    }

    public void setConjugueNome(String conjugueNome) {
        this.conjugueNome = conjugueNome;
    }

    private String empresaTrabalho;

    @Basic
    @javax.persistence.Column(name = "EmpresaTrabalho", nullable = true, insertable = true, updatable = true)
    public String getEmpresaTrabalho() {
        return empresaTrabalho;
    }

    public void setEmpresaTrabalho(String empresaTrabalho) {
        this.empresaTrabalho = empresaTrabalho;
    }

    private String profissão;

    @Basic
    @javax.persistence.Column(name = "Profissão", nullable = true, insertable = true, updatable = true)
    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    private Long númeroCobrançaUtilizada;

    @Basic
    @javax.persistence.Column(name = "NúmeroCobrançaUtilizada", nullable = true, insertable = true, updatable = true)
    public Long getNúmeroCobrançaUtilizada() {
        return númeroCobrançaUtilizada;
    }

    public void setNúmeroCobrançaUtilizada(Long númeroCobrançaUtilizada) {
        this.númeroCobrançaUtilizada = númeroCobrançaUtilizada;
    }

    private String endereço;

    @Basic
    @javax.persistence.Column(name = "Endereço", nullable = true, insertable = true, updatable = true)
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    private Integer codRaça;

    @Basic
    @javax.persistence.Column(name = "CodRaça", nullable = true, insertable = true, updatable = true)
    public Integer getCodRaça() {
        return codRaça;
    }

    public void setCodRaça(Integer codRaça) {
        this.codRaça = codRaça;
    }

    private String endereçoTodos;

    @Basic
    @javax.persistence.Column(name = "EndereçoTodos", nullable = true, insertable = true, updatable = true)
    public String getEndereçoTodos() {
        return endereçoTodos;
    }

    public void setEndereçoTodos(String endereçoTodos) {
        this.endereçoTodos = endereçoTodos;
    }

    private String telefoneTodos;

    @Basic
    @javax.persistence.Column(name = "TelefoneTodos", nullable = true, insertable = true, updatable = true)
    public String getTelefoneTodos() {
        return telefoneTodos;
    }

    public void setTelefoneTodos(String telefoneTodos) {
        this.telefoneTodos = telefoneTodos;
    }

    private String endereçoCobrança;

    @Basic
    @javax.persistence.Column(name = "EndereçoCobrança", nullable = true, insertable = true, updatable = true)
    public String getEndereçoCobrança() {
        return endereçoCobrança;
    }

    public void setEndereçoCobrança(String endereçoCobrança) {
        this.endereçoCobrança = endereçoCobrança;
    }

    private String mecNis;

    @Basic
    @javax.persistence.Column(name = "MEC_NIS", nullable = true, insertable = true, updatable = true)
    public String getMecNis() {
        return mecNis;
    }

    public void setMecNis(String mecNis) {
        this.mecNis = mecNis;
    }

    private String ctps;

    @Basic
    @javax.persistence.Column(name = "CTPS", nullable = true, insertable = true, updatable = true)
    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    private String ctpsSérie;

    @Basic
    @javax.persistence.Column(name = "CTPSSérie", nullable = true, insertable = true, updatable = true)
    public String getCtpsSérie() {
        return ctpsSérie;
    }

    public void setCtpsSérie(String ctpsSérie) {
        this.ctpsSérie = ctpsSérie;
    }

    private Timestamp ctpsData;

    @Basic
    @javax.persistence.Column(name = "CTPSData", nullable = true, insertable = true, updatable = true)
    public Timestamp getCtpsData() {
        return ctpsData;
    }

    public void setCtpsData(Timestamp ctpsData) {
        this.ctpsData = ctpsData;
    }

    private String ctpsuf;

    @Basic
    @javax.persistence.Column(name = "CTPSUF", nullable = true, insertable = true, updatable = true)
    public String getCtpsuf() {
        return ctpsuf;
    }

    public void setCtpsuf(String ctpsuf) {
        this.ctpsuf = ctpsuf;
    }

    private Timestamp dataAdmissão;

    @Basic
    @javax.persistence.Column(name = "DataAdmissão", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(Timestamp dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    private Timestamp dataDemissão;

    @Basic
    @javax.persistence.Column(name = "DataDemissão", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataDemissão() {
        return dataDemissão;
    }

    public void setDataDemissão(Timestamp dataDemissão) {
        this.dataDemissão = dataDemissão;
    }

    private String escolaOrigem;

    @Basic
    @javax.persistence.Column(name = "EscolaOrigem", nullable = true, insertable = true, updatable = true)
    public String getEscolaOrigem() {
        return escolaOrigem;
    }

    public void setEscolaOrigem(String escolaOrigem) {
        this.escolaOrigem = escolaOrigem;
    }

    private String nomeSemAcento;

    @Basic
    @javax.persistence.Column(name = "NomeSemAcento", nullable = true, insertable = true, updatable = true)
    public String getNomeSemAcento() {
        return nomeSemAcento;
    }

    public void setNomeSemAcento(String nomeSemAcento) {
        this.nomeSemAcento = nomeSemAcento;
    }

    private String observação;

    @Basic
    @javax.persistence.Column(name = "Observação", nullable = true, insertable = true, updatable = true)
    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    private String escolaridade;

    @Basic
    @javax.persistence.Column(name = "Escolaridade", nullable = true, insertable = true, updatable = true)
    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    private String escolaridadeFormação;

    @Basic
    @javax.persistence.Column(name = "EscolaridadeFormação", nullable = true, insertable = true, updatable = true)
    public String getEscolaridadeFormação() {
        return escolaridadeFormação;
    }

    public void setEscolaridadeFormação(String escolaridadeFormação) {
        this.escolaridadeFormação = escolaridadeFormação;
    }

    private Boolean leitor;

    @Basic
    @javax.persistence.Column(name = "Leitor", nullable = true, insertable = true, updatable = true)
    public Boolean getLeitor() {
        return leitor;
    }

    public void setLeitor(Boolean leitor) {
        this.leitor = leitor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CntRelacionamento that = (CntRelacionamento) o;

        if (cancelado != that.cancelado) return false;
        if (codRelacionamento != that.codRelacionamento) return false;
        if (codUnidade != that.codUnidade) return false;
        if (falecido != that.falecido) return false;
        if (pessoaFísica != that.pessoaFísica) return false;
        if (relacionamentoId != that.relacionamentoId) return false;
        if (selecionado != that.selecionado) return false;
        if (apelido != null ? !apelido.equals(that.apelido) : that.apelido != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (certidão != null ? !certidão.equals(that.certidão) : that.certidão != null) return false;
        if (certidãoCartório != null ? !certidãoCartório.equals(that.certidãoCartório) : that.certidãoCartório != null)
            return false;
        if (certidãoCidade != null ? !certidãoCidade.equals(that.certidãoCidade) : that.certidãoCidade != null)
            return false;
        if (certidãoFolhas != null ? !certidãoFolhas.equals(that.certidãoFolhas) : that.certidãoFolhas != null)
            return false;
        if (certidãoLivro != null ? !certidãoLivro.equals(that.certidãoLivro) : that.certidãoLivro != null)
            return false;
        if (certidãoNúmero != null ? !certidãoNúmero.equals(that.certidãoNúmero) : that.certidãoNúmero != null)
            return false;
        if (certidãoUf != null ? !certidãoUf.equals(that.certidãoUf) : that.certidãoUf != null) return false;
        if (certificadoMilitar != null ? !certificadoMilitar.equals(that.certificadoMilitar) : that.certificadoMilitar != null)
            return false;
        if (certificadoMilitarCategoria != null ? !certificadoMilitarCategoria.equals(that.certificadoMilitarCategoria) : that.certificadoMilitarCategoria != null)
            return false;
        if (certificadoMilitarNúmero != null ? !certificadoMilitarNúmero.equals(that.certificadoMilitarNúmero) : that.certificadoMilitarNúmero != null)
            return false;
        if (certificadoMilitarRegião != null ? !certificadoMilitarRegião.equals(that.certificadoMilitarRegião) : that.certificadoMilitarRegião != null)
            return false;
        if (certificadoMilitarUf != null ? !certificadoMilitarUf.equals(that.certificadoMilitarUf) : that.certificadoMilitarUf != null)
            return false;
        if (codAgência != null ? !codAgência.equals(that.codAgência) : that.codAgência != null) return false;
        if (codCadastro != null ? !codCadastro.equals(that.codCadastro) : that.codCadastro != null) return false;
        if (codDepartamento != null ? !codDepartamento.equals(that.codDepartamento) : that.codDepartamento != null)
            return false;
        if (codEmpresa != null ? !codEmpresa.equals(that.codEmpresa) : that.codEmpresa != null) return false;
        if (codEstadoCivil != null ? !codEstadoCivil.equals(that.codEstadoCivil) : that.codEstadoCivil != null)
            return false;
        if (codGrupo != null ? !codGrupo.equals(that.codGrupo) : that.codGrupo != null) return false;
        if (codRaça != null ? !codRaça.equals(that.codRaça) : that.codRaça != null) return false;
        if (codRelacionamentoTipo != null ? !codRelacionamentoTipo.equals(that.codRelacionamentoTipo) : that.codRelacionamentoTipo != null)
            return false;
        if (conjugueNome != null ? !conjugueNome.equals(that.conjugueNome) : that.conjugueNome != null) return false;
        if (cpf != null ? !cpf.equals(that.cpf) : that.cpf != null) return false;
        if (ctps != null ? !ctps.equals(that.ctps) : that.ctps != null) return false;
        if (ctpsData != null ? !ctpsData.equals(that.ctpsData) : that.ctpsData != null) return false;
        if (ctpsSérie != null ? !ctpsSérie.equals(that.ctpsSérie) : that.ctpsSérie != null) return false;
        if (ctpsuf != null ? !ctpsuf.equals(that.ctpsuf) : that.ctpsuf != null) return false;
        if (dataAdmissão != null ? !dataAdmissão.equals(that.dataAdmissão) : that.dataAdmissão != null) return false;
        if (dataAssinatura != null ? !dataAssinatura.equals(that.dataAssinatura) : that.dataAssinatura != null)
            return false;
        if (dataDemissão != null ? !dataDemissão.equals(that.dataDemissão) : that.dataDemissão != null) return false;
        if (dataInclusão != null ? !dataInclusão.equals(that.dataInclusão) : that.dataInclusão != null) return false;
        if (dataUltimaEdição != null ? !dataUltimaEdição.equals(that.dataUltimaEdição) : that.dataUltimaEdição != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (empresaFunção != null ? !empresaFunção.equals(that.empresaFunção) : that.empresaFunção != null)
            return false;
        if (empresaTrabalho != null ? !empresaTrabalho.equals(that.empresaTrabalho) : that.empresaTrabalho != null)
            return false;
        if (endereço != null ? !endereço.equals(that.endereço) : that.endereço != null) return false;
        if (endereçoCobrança != null ? !endereçoCobrança.equals(that.endereçoCobrança) : that.endereçoCobrança != null)
            return false;
        if (endereçoTodos != null ? !endereçoTodos.equals(that.endereçoTodos) : that.endereçoTodos != null)
            return false;
        if (escolaOrigem != null ? !escolaOrigem.equals(that.escolaOrigem) : that.escolaOrigem != null) return false;
        if (escolaridade != null ? !escolaridade.equals(that.escolaridade) : that.escolaridade != null) return false;
        if (escolaridadeFormação != null ? !escolaridadeFormação.equals(that.escolaridadeFormação) : that.escolaridadeFormação != null)
            return false;
        if (!Arrays.equals(foto, that.foto)) return false;
        if (foto3X4 != null ? !foto3X4.equals(that.foto3X4) : that.foto3X4 != null) return false;
        if (histórico != null ? !histórico.equals(that.histórico) : that.histórico != null) return false;
        if (homePage != null ? !homePage.equals(that.homePage) : that.homePage != null) return false;
        if (im != null ? !im.equals(that.im) : that.im != null) return false;
        if (leitor != null ? !leitor.equals(that.leitor) : that.leitor != null) return false;
        if (mecNis != null ? !mecNis.equals(that.mecNis) : that.mecNis != null) return false;
        if (mãeNome != null ? !mãeNome.equals(that.mãeNome) : that.mãeNome != null) return false;
        if (nacionalidade != null ? !nacionalidade.equals(that.nacionalidade) : that.nacionalidade != null)
            return false;
        if (nascimento != null ? !nascimento.equals(that.nascimento) : that.nascimento != null) return false;
        if (naturalidadeCidade != null ? !naturalidadeCidade.equals(that.naturalidadeCidade) : that.naturalidadeCidade != null)
            return false;
        if (naturalidadeUf != null ? !naturalidadeUf.equals(that.naturalidadeUf) : that.naturalidadeUf != null)
            return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (nomeSemAcento != null ? !nomeSemAcento.equals(that.nomeSemAcento) : that.nomeSemAcento != null)
            return false;
        if (númeroCobrançaUtilizada != null ? !númeroCobrançaUtilizada.equals(that.númeroCobrançaUtilizada) : that.númeroCobrançaUtilizada != null)
            return false;
        if (observação != null ? !observação.equals(that.observação) : that.observação != null) return false;
        if (paiNome != null ? !paiNome.equals(that.paiNome) : that.paiNome != null) return false;
        if (profissão != null ? !profissão.equals(that.profissão) : that.profissão != null) return false;
        if (pronomeTratamento != null ? !pronomeTratamento.equals(that.pronomeTratamento) : that.pronomeTratamento != null)
            return false;
        if (religião != null ? !religião.equals(that.religião) : that.religião != null) return false;
        if (rg != null ? !rg.equals(that.rg) : that.rg != null) return false;
        if (rgData != null ? !rgData.equals(that.rgData) : that.rgData != null) return false;
        if (rgExpedição != null ? !rgExpedição.equals(that.rgExpedição) : that.rgExpedição != null) return false;
        if (rguf != null ? !rguf.equals(that.rguf) : that.rguf != null) return false;
        if (sexo != null ? !sexo.equals(that.sexo) : that.sexo != null) return false;
        if (telefoneTodos != null ? !telefoneTodos.equals(that.telefoneTodos) : that.telefoneTodos != null)
            return false;
        if (títuloEleitor != null ? !títuloEleitor.equals(that.títuloEleitor) : that.títuloEleitor != null)
            return false;
        if (títuloEleitorSeção != null ? !títuloEleitorSeção.equals(that.títuloEleitorSeção) : that.títuloEleitorSeção != null)
            return false;
        if (títuloEleitorUf != null ? !títuloEleitorUf.equals(that.títuloEleitorUf) : that.títuloEleitorUf != null)
            return false;
        if (títuloEleitorZona != null ? !títuloEleitorZona.equals(that.títuloEleitorZona) : that.títuloEleitorZona != null)
            return false;
        if (usuário != null ? !usuário.equals(that.usuário) : that.usuário != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (relacionamentoId ^ (relacionamentoId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codRelacionamento;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (apelido != null ? apelido.hashCode() : 0);
        result = 31 * result + (foto != null ? Arrays.hashCode(foto) : 0);
        result = 31 * result + (codRelacionamentoTipo != null ? codRelacionamentoTipo.hashCode() : 0);
        result = 31 * result + (codGrupo != null ? codGrupo.hashCode() : 0);
        result = 31 * result + (pessoaFísica ? 1 : 0);
        result = 31 * result + (sexo != null ? sexo.hashCode() : 0);
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (rg != null ? rg.hashCode() : 0);
        result = 31 * result + (rgExpedição != null ? rgExpedição.hashCode() : 0);
        result = 31 * result + (rgData != null ? rgData.hashCode() : 0);
        result = 31 * result + (rguf != null ? rguf.hashCode() : 0);
        result = 31 * result + (im != null ? im.hashCode() : 0);
        result = 31 * result + (títuloEleitor != null ? títuloEleitor.hashCode() : 0);
        result = 31 * result + (títuloEleitorZona != null ? títuloEleitorZona.hashCode() : 0);
        result = 31 * result + (títuloEleitorSeção != null ? títuloEleitorSeção.hashCode() : 0);
        result = 31 * result + (títuloEleitorUf != null ? títuloEleitorUf.hashCode() : 0);
        result = 31 * result + (certificadoMilitar != null ? certificadoMilitar.hashCode() : 0);
        result = 31 * result + (certificadoMilitarNúmero != null ? certificadoMilitarNúmero.hashCode() : 0);
        result = 31 * result + (certificadoMilitarCategoria != null ? certificadoMilitarCategoria.hashCode() : 0);
        result = 31 * result + (certificadoMilitarRegião != null ? certificadoMilitarRegião.hashCode() : 0);
        result = 31 * result + (certificadoMilitarUf != null ? certificadoMilitarUf.hashCode() : 0);
        result = 31 * result + (nascimento != null ? nascimento.hashCode() : 0);
        result = 31 * result + (nacionalidade != null ? nacionalidade.hashCode() : 0);
        result = 31 * result + (naturalidadeCidade != null ? naturalidadeCidade.hashCode() : 0);
        result = 31 * result + (naturalidadeUf != null ? naturalidadeUf.hashCode() : 0);
        result = 31 * result + (codDepartamento != null ? codDepartamento.hashCode() : 0);
        result = 31 * result + (dataAssinatura != null ? dataAssinatura.hashCode() : 0);
        result = 31 * result + (dataInclusão != null ? dataInclusão.hashCode() : 0);
        result = 31 * result + (codCadastro != null ? codCadastro.hashCode() : 0);
        result = 31 * result + (dataUltimaEdição != null ? dataUltimaEdição.hashCode() : 0);
        result = 31 * result + (homePage != null ? homePage.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (selecionado ? 1 : 0);
        result = 31 * result + (codEmpresa != null ? codEmpresa.hashCode() : 0);
        result = 31 * result + (religião != null ? religião.hashCode() : 0);
        result = 31 * result + (codAgência != null ? codAgência.hashCode() : 0);
        result = 31 * result + (cancelado ? 1 : 0);
        result = 31 * result + (pronomeTratamento != null ? pronomeTratamento.hashCode() : 0);
        result = 31 * result + (certidão != null ? certidão.hashCode() : 0);
        result = 31 * result + (certidãoNúmero != null ? certidãoNúmero.hashCode() : 0);
        result = 31 * result + (certidãoCartório != null ? certidãoCartório.hashCode() : 0);
        result = 31 * result + (certidãoLivro != null ? certidãoLivro.hashCode() : 0);
        result = 31 * result + (certidãoFolhas != null ? certidãoFolhas.hashCode() : 0);
        result = 31 * result + (certidãoCidade != null ? certidãoCidade.hashCode() : 0);
        result = 31 * result + (certidãoUf != null ? certidãoUf.hashCode() : 0);
        result = 31 * result + (histórico != null ? histórico.hashCode() : 0);
        result = 31 * result + (foto3X4 != null ? foto3X4.hashCode() : 0);
        result = 31 * result + (falecido ? 1 : 0);
        result = 31 * result + (usuário != null ? usuário.hashCode() : 0);
        result = 31 * result + (paiNome != null ? paiNome.hashCode() : 0);
        result = 31 * result + (codEstadoCivil != null ? codEstadoCivil.hashCode() : 0);
        result = 31 * result + (mãeNome != null ? mãeNome.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (empresaFunção != null ? empresaFunção.hashCode() : 0);
        result = 31 * result + (conjugueNome != null ? conjugueNome.hashCode() : 0);
        result = 31 * result + (empresaTrabalho != null ? empresaTrabalho.hashCode() : 0);
        result = 31 * result + (profissão != null ? profissão.hashCode() : 0);
        result = 31 * result + (númeroCobrançaUtilizada != null ? númeroCobrançaUtilizada.hashCode() : 0);
        result = 31 * result + (endereço != null ? endereço.hashCode() : 0);
        result = 31 * result + (codRaça != null ? codRaça.hashCode() : 0);
        result = 31 * result + (endereçoTodos != null ? endereçoTodos.hashCode() : 0);
        result = 31 * result + (telefoneTodos != null ? telefoneTodos.hashCode() : 0);
        result = 31 * result + (endereçoCobrança != null ? endereçoCobrança.hashCode() : 0);
        result = 31 * result + (mecNis != null ? mecNis.hashCode() : 0);
        result = 31 * result + (ctps != null ? ctps.hashCode() : 0);
        result = 31 * result + (ctpsSérie != null ? ctpsSérie.hashCode() : 0);
        result = 31 * result + (ctpsData != null ? ctpsData.hashCode() : 0);
        result = 31 * result + (ctpsuf != null ? ctpsuf.hashCode() : 0);
        result = 31 * result + (dataAdmissão != null ? dataAdmissão.hashCode() : 0);
        result = 31 * result + (dataDemissão != null ? dataDemissão.hashCode() : 0);
        result = 31 * result + (escolaOrigem != null ? escolaOrigem.hashCode() : 0);
        result = 31 * result + (nomeSemAcento != null ? nomeSemAcento.hashCode() : 0);
        result = 31 * result + (observação != null ? observação.hashCode() : 0);
        result = 31 * result + (escolaridade != null ? escolaridade.hashCode() : 0);
        result = 31 * result + (escolaridadeFormação != null ? escolaridadeFormação.hashCode() : 0);
        result = 31 * result + (leitor != null ? leitor.hashCode() : 0);
        return result;
    }
}
