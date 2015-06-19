package br.com.xduka.modellegacy.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdTurmaPK.class)
public class AcdTurma {
    private long turmaId;

    @Basic
    @javax.persistence.Column(name = "Turma_ID", nullable = false, insertable = true, updatable = true)
    public long getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(long turmaId) {
        this.turmaId = turmaId;
    }

    private int anoLetivo;

    @Id
    @javax.persistence.Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    private String turma;

    @Id
    @javax.persistence.Column(name = "Turma", nullable = false, insertable = true, updatable = true)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
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

    private int codCurso;

    @Id
    @javax.persistence.Column(name = "CodCurso", nullable = false, insertable = true, updatable = true)
    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    private int codPeríodo;

    @Id
    @javax.persistence.Column(name = "CodPeríodo", nullable = false, insertable = true, updatable = true)
    public int getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(int codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    private int codGrade;

    @Basic
    @javax.persistence.Column(name = "CodGrade", nullable = false, insertable = true, updatable = true)
    public int getCodGrade() {
        return codGrade;
    }

    public void setCodGrade(int codGrade) {
        this.codGrade = codGrade;
    }

    private boolean fechada;

    @Basic
    @javax.persistence.Column(name = "Fechada", nullable = false, insertable = true, updatable = true)
    public boolean isFechada() {
        return fechada;
    }

    public void setFechada(boolean fechada) {
        this.fechada = fechada;
    }

    private boolean rematrícula;

    @Basic
    @javax.persistence.Column(name = "Rematrícula", nullable = false, insertable = true, updatable = true)
    public boolean isRematrícula() {
        return rematrícula;
    }

    public void setRematrícula(boolean rematrícula) {
        this.rematrícula = rematrícula;
    }

    private boolean todosAlunos;

    @Basic
    @javax.persistence.Column(name = "TodosAlunos", nullable = false, insertable = true, updatable = true)
    public boolean isTodosAlunos() {
        return todosAlunos;
    }

    public void setTodosAlunos(boolean todosAlunos) {
        this.todosAlunos = todosAlunos;
    }

    private boolean desatualizada;

    @Basic
    @javax.persistence.Column(name = "Desatualizada", nullable = false, insertable = true, updatable = true)
    public boolean isDesatualizada() {
        return desatualizada;
    }

    public void setDesatualizada(boolean desatualizada) {
        this.desatualizada = desatualizada;
    }

    private Byte codDisciplina;

    @Basic
    @javax.persistence.Column(name = "CodDisciplina", nullable = true, insertable = true, updatable = true)
    public Byte getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(Byte codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    private String áreaFoto;

    @Basic
    @javax.persistence.Column(name = "ÁreaFoto", nullable = true, insertable = true, updatable = true)
    public String getÁreaFoto() {
        return áreaFoto;
    }

    public void setÁreaFoto(String áreaFoto) {
        this.áreaFoto = áreaFoto;
    }

    private String áreaNome;

    @Basic
    @javax.persistence.Column(name = "ÁreaNome", nullable = true, insertable = true, updatable = true)
    public String getÁreaNome() {
        return áreaNome;
    }

    public void setÁreaNome(String áreaNome) {
        this.áreaNome = áreaNome;
    }

    private String mensagemBoleto;

    @Basic
    @javax.persistence.Column(name = "MensagemBoleto", nullable = true, insertable = true, updatable = true)
    public String getMensagemBoleto() {
        return mensagemBoleto;
    }

    public void setMensagemBoleto(String mensagemBoleto) {
        this.mensagemBoleto = mensagemBoleto;
    }

    private Byte codAnuidade;

    @Basic
    @javax.persistence.Column(name = "CodAnuidade", nullable = true, insertable = true, updatable = true)
    public Byte getCodAnuidade() {
        return codAnuidade;
    }

    public void setCodAnuidade(Byte codAnuidade) {
        this.codAnuidade = codAnuidade;
    }

    private Byte codCaixa;

    @Basic
    @javax.persistence.Column(name = "CodCaixa", nullable = true, insertable = true, updatable = true)
    public Byte getCodCaixa() {
        return codCaixa;
    }

    public void setCodCaixa(Byte codCaixa) {
        this.codCaixa = codCaixa;
    }

    private Integer codConta;

    @Basic
    @javax.persistence.Column(name = "CodConta", nullable = true, insertable = true, updatable = true)
    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    private Integer codUnidadeAnoPosterior;

    @Basic
    @javax.persistence.Column(name = "CodUnidadeAnoPosterior", nullable = true, insertable = true, updatable = true)
    public Integer getCodUnidadeAnoPosterior() {
        return codUnidadeAnoPosterior;
    }

    public void setCodUnidadeAnoPosterior(Integer codUnidadeAnoPosterior) {
        this.codUnidadeAnoPosterior = codUnidadeAnoPosterior;
    }

    private String codTurnoAnoPosterior;

    @Basic
    @javax.persistence.Column(name = "CodTurnoAnoPosterior", nullable = true, insertable = true, updatable = true)
    public String getCodTurnoAnoPosterior() {
        return codTurnoAnoPosterior;
    }

    public void setCodTurnoAnoPosterior(String codTurnoAnoPosterior) {
        this.codTurnoAnoPosterior = codTurnoAnoPosterior;
    }

    private Integer codCursoAnoPosterior;

    @Basic
    @javax.persistence.Column(name = "CodCursoAnoPosterior", nullable = true, insertable = true, updatable = true)
    public Integer getCodCursoAnoPosterior() {
        return codCursoAnoPosterior;
    }

    public void setCodCursoAnoPosterior(Integer codCursoAnoPosterior) {
        this.codCursoAnoPosterior = codCursoAnoPosterior;
    }

    private Integer codPeríodoAnoPosterior;

    @Basic
    @javax.persistence.Column(name = "CodPeríodoAnoPosterior", nullable = true, insertable = true, updatable = true)
    public Integer getCodPeríodoAnoPosterior() {
        return codPeríodoAnoPosterior;
    }

    public void setCodPeríodoAnoPosterior(Integer codPeríodoAnoPosterior) {
        this.codPeríodoAnoPosterior = codPeríodoAnoPosterior;
    }

    private String turmaAnoPosterior;

    @Basic
    @javax.persistence.Column(name = "TurmaAnoPosterior", nullable = true, insertable = true, updatable = true)
    public String getTurmaAnoPosterior() {
        return turmaAnoPosterior;
    }

    public void setTurmaAnoPosterior(String turmaAnoPosterior) {
        this.turmaAnoPosterior = turmaAnoPosterior;
    }

    private String plano;

    @Basic
    @javax.persistence.Column(name = "Plano", nullable = true, insertable = true, updatable = true)
    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
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

    private BigDecimal valorEntrada;

    @Basic
    @javax.persistence.Column(name = "ValorEntrada", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(BigDecimal valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    private BigDecimal valorParcela;

    @Basic
    @javax.persistence.Column(name = "ValorParcela", nullable = true, insertable = true, updatable = true, precision = 4)
    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    private Byte tipoPagamento;

    @Basic
    @javax.persistence.Column(name = "TipoPagamento", nullable = true, insertable = true, updatable = true)
    public Byte getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Byte tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    private Byte tipoCobrança;

    @Basic
    @javax.persistence.Column(name = "TipoCobrança", nullable = true, insertable = true, updatable = true)
    public Byte getTipoCobrança() {
        return tipoCobrança;
    }

    public void setTipoCobrança(Byte tipoCobrança) {
        this.tipoCobrança = tipoCobrança;
    }

    private Integer quantidadeParcelas;

    @Basic
    @javax.persistence.Column(name = "QuantidadeParcelas", nullable = true, insertable = true, updatable = true)
    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    private Timestamp início;

    @Basic
    @javax.persistence.Column(name = "Início", nullable = true, insertable = true, updatable = true)
    public Timestamp getInício() {
        return início;
    }

    public void setInício(Timestamp início) {
        this.início = início;
    }

    private Timestamp fim;

    @Basic
    @javax.persistence.Column(name = "Fim", nullable = true, insertable = true, updatable = true)
    public Timestamp getFim() {
        return fim;
    }

    public void setFim(Timestamp fim) {
        this.fim = fim;
    }

    private Timestamp matrículaInício;

    @Basic
    @javax.persistence.Column(name = "MatrículaInício", nullable = true, insertable = true, updatable = true)
    public Timestamp getMatrículaInício() {
        return matrículaInício;
    }

    public void setMatrículaInício(Timestamp matrículaInício) {
        this.matrículaInício = matrículaInício;
    }

    private Timestamp matrículaFim;

    @Basic
    @javax.persistence.Column(name = "MatrículaFim", nullable = true, insertable = true, updatable = true)
    public Timestamp getMatrículaFim() {
        return matrículaFim;
    }

    public void setMatrículaFim(Timestamp matrículaFim) {
        this.matrículaFim = matrículaFim;
    }

    private Boolean disponível;

    @Basic
    @javax.persistence.Column(name = "Disponível", nullable = true, insertable = true, updatable = true)
    public Boolean getDisponível() {
        return disponível;
    }

    public void setDisponível(Boolean disponível) {
        this.disponível = disponível;
    }

    private Integer codSituaçãoApto;

    @Basic
    @javax.persistence.Column(name = "CodSituaçãoApto", nullable = true, insertable = true, updatable = true)
    public Integer getCodSituaçãoApto() {
        return codSituaçãoApto;
    }

    public void setCodSituaçãoApto(Integer codSituaçãoApto) {
        this.codSituaçãoApto = codSituaçãoApto;
    }

    private Integer diasLetivos;

    @Basic
    @javax.persistence.Column(name = "DiasLetivos", nullable = true, insertable = true, updatable = true)
    public Integer getDiasLetivos() {
        return diasLetivos;
    }

    public void setDiasLetivos(Integer diasLetivos) {
        this.diasLetivos = diasLetivos;
    }

    private String horaInício;

    @Basic
    @javax.persistence.Column(name = "HoraInício", nullable = true, insertable = true, updatable = true)
    public String getHoraInício() {
        return horaInício;
    }

    public void setHoraInício(String horaInício) {
        this.horaInício = horaInício;
    }

    private String horaFim;

    @Basic
    @javax.persistence.Column(name = "HoraFim", nullable = true, insertable = true, updatable = true)
    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    private Integer codInscrição;

    @Basic
    @javax.persistence.Column(name = "CodInscrição", nullable = true, insertable = true, updatable = true)
    public Integer getCodInscrição() {
        return codInscrição;
    }

    public void setCodInscrição(Integer codInscrição) {
        this.codInscrição = codInscrição;
    }

    private String mensagemSacado;

    @Basic
    @javax.persistence.Column(name = "MensagemSacado", nullable = true, insertable = true, updatable = true)
    public String getMensagemSacado() {
        return mensagemSacado;
    }

    public void setMensagemSacado(String mensagemSacado) {
        this.mensagemSacado = mensagemSacado;
    }

    private String mensagemAtraso;

    @Basic
    @javax.persistence.Column(name = "MensagemAtraso", nullable = true, insertable = true, updatable = true)
    public String getMensagemAtraso() {
        return mensagemAtraso;
    }

    public void setMensagemAtraso(String mensagemAtraso) {
        this.mensagemAtraso = mensagemAtraso;
    }

    private String mensagemCompensação;

    @Basic
    @javax.persistence.Column(name = "MensagemCompensação", nullable = true, insertable = true, updatable = true)
    public String getMensagemCompensação() {
        return mensagemCompensação;
    }

    public void setMensagemCompensação(String mensagemCompensação) {
        this.mensagemCompensação = mensagemCompensação;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTurma acdTurma = (AcdTurma) o;

        if (anoLetivo != acdTurma.anoLetivo) return false;
        if (codCurso != acdTurma.codCurso) return false;
        if (codGrade != acdTurma.codGrade) return false;
        if (codPeríodo != acdTurma.codPeríodo) return false;
        if (codUnidade != acdTurma.codUnidade) return false;
        if (desatualizada != acdTurma.desatualizada) return false;
        if (fechada != acdTurma.fechada) return false;
        if (rematrícula != acdTurma.rematrícula) return false;
        if (todosAlunos != acdTurma.todosAlunos) return false;
        if (turmaId != acdTurma.turmaId) return false;
        if (codAnuidade != null ? !codAnuidade.equals(acdTurma.codAnuidade) : acdTurma.codAnuidade != null)
            return false;
        if (codCaixa != null ? !codCaixa.equals(acdTurma.codCaixa) : acdTurma.codCaixa != null) return false;
        if (codConta != null ? !codConta.equals(acdTurma.codConta) : acdTurma.codConta != null) return false;
        if (codCursoAnoPosterior != null ? !codCursoAnoPosterior.equals(acdTurma.codCursoAnoPosterior) : acdTurma.codCursoAnoPosterior != null)
            return false;
        if (codDisciplina != null ? !codDisciplina.equals(acdTurma.codDisciplina) : acdTurma.codDisciplina != null)
            return false;
        if (codInscrição != null ? !codInscrição.equals(acdTurma.codInscrição) : acdTurma.codInscrição != null)
            return false;
        if (codPeríodoAnoPosterior != null ? !codPeríodoAnoPosterior.equals(acdTurma.codPeríodoAnoPosterior) : acdTurma.codPeríodoAnoPosterior != null)
            return false;
        if (codSituaçãoApto != null ? !codSituaçãoApto.equals(acdTurma.codSituaçãoApto) : acdTurma.codSituaçãoApto != null)
            return false;
        if (codTurnoAnoPosterior != null ? !codTurnoAnoPosterior.equals(acdTurma.codTurnoAnoPosterior) : acdTurma.codTurnoAnoPosterior != null)
            return false;
        if (codUnidadeAnoPosterior != null ? !codUnidadeAnoPosterior.equals(acdTurma.codUnidadeAnoPosterior) : acdTurma.codUnidadeAnoPosterior != null)
            return false;
        if (diasLetivos != null ? !diasLetivos.equals(acdTurma.diasLetivos) : acdTurma.diasLetivos != null)
            return false;
        if (disponível != null ? !disponível.equals(acdTurma.disponível) : acdTurma.disponível != null) return false;
        if (fim != null ? !fim.equals(acdTurma.fim) : acdTurma.fim != null) return false;
        if (horaFim != null ? !horaFim.equals(acdTurma.horaFim) : acdTurma.horaFim != null) return false;
        if (horaInício != null ? !horaInício.equals(acdTurma.horaInício) : acdTurma.horaInício != null) return false;
        if (início != null ? !início.equals(acdTurma.início) : acdTurma.início != null) return false;
        if (matrículaFim != null ? !matrículaFim.equals(acdTurma.matrículaFim) : acdTurma.matrículaFim != null)
            return false;
        if (matrículaInício != null ? !matrículaInício.equals(acdTurma.matrículaInício) : acdTurma.matrículaInício != null)
            return false;
        if (mensagemAtraso != null ? !mensagemAtraso.equals(acdTurma.mensagemAtraso) : acdTurma.mensagemAtraso != null)
            return false;
        if (mensagemBoleto != null ? !mensagemBoleto.equals(acdTurma.mensagemBoleto) : acdTurma.mensagemBoleto != null)
            return false;
        if (mensagemCompensação != null ? !mensagemCompensação.equals(acdTurma.mensagemCompensação) : acdTurma.mensagemCompensação != null)
            return false;
        if (mensagemSacado != null ? !mensagemSacado.equals(acdTurma.mensagemSacado) : acdTurma.mensagemSacado != null)
            return false;
        if (plano != null ? !plano.equals(acdTurma.plano) : acdTurma.plano != null) return false;
        if (quantidadeParcelas != null ? !quantidadeParcelas.equals(acdTurma.quantidadeParcelas) : acdTurma.quantidadeParcelas != null)
            return false;
        if (tipoCobrança != null ? !tipoCobrança.equals(acdTurma.tipoCobrança) : acdTurma.tipoCobrança != null)
            return false;
        if (tipoPagamento != null ? !tipoPagamento.equals(acdTurma.tipoPagamento) : acdTurma.tipoPagamento != null)
            return false;
        if (turma != null ? !turma.equals(acdTurma.turma) : acdTurma.turma != null) return false;
        if (turmaAnoPosterior != null ? !turmaAnoPosterior.equals(acdTurma.turmaAnoPosterior) : acdTurma.turmaAnoPosterior != null)
            return false;
        if (valorEntrada != null ? !valorEntrada.equals(acdTurma.valorEntrada) : acdTurma.valorEntrada != null)
            return false;
        if (valorParcela != null ? !valorParcela.equals(acdTurma.valorParcela) : acdTurma.valorParcela != null)
            return false;
        if (vencimento != null ? !vencimento.equals(acdTurma.vencimento) : acdTurma.vencimento != null) return false;
        if (áreaFoto != null ? !áreaFoto.equals(acdTurma.áreaFoto) : acdTurma.áreaFoto != null) return false;
        if (áreaNome != null ? !áreaNome.equals(acdTurma.áreaNome) : acdTurma.áreaNome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (turmaId ^ (turmaId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + (turma != null ? turma.hashCode() : 0);
        result = 31 * result + codUnidade;
        result = 31 * result + codCurso;
        result = 31 * result + codPeríodo;
        result = 31 * result + codGrade;
        result = 31 * result + (fechada ? 1 : 0);
        result = 31 * result + (rematrícula ? 1 : 0);
        result = 31 * result + (todosAlunos ? 1 : 0);
        result = 31 * result + (desatualizada ? 1 : 0);
        result = 31 * result + (codDisciplina != null ? codDisciplina.hashCode() : 0);
        result = 31 * result + (áreaFoto != null ? áreaFoto.hashCode() : 0);
        result = 31 * result + (áreaNome != null ? áreaNome.hashCode() : 0);
        result = 31 * result + (mensagemBoleto != null ? mensagemBoleto.hashCode() : 0);
        result = 31 * result + (codAnuidade != null ? codAnuidade.hashCode() : 0);
        result = 31 * result + (codCaixa != null ? codCaixa.hashCode() : 0);
        result = 31 * result + (codConta != null ? codConta.hashCode() : 0);
        result = 31 * result + (codUnidadeAnoPosterior != null ? codUnidadeAnoPosterior.hashCode() : 0);
        result = 31 * result + (codTurnoAnoPosterior != null ? codTurnoAnoPosterior.hashCode() : 0);
        result = 31 * result + (codCursoAnoPosterior != null ? codCursoAnoPosterior.hashCode() : 0);
        result = 31 * result + (codPeríodoAnoPosterior != null ? codPeríodoAnoPosterior.hashCode() : 0);
        result = 31 * result + (turmaAnoPosterior != null ? turmaAnoPosterior.hashCode() : 0);
        result = 31 * result + (plano != null ? plano.hashCode() : 0);
        result = 31 * result + (vencimento != null ? vencimento.hashCode() : 0);
        result = 31 * result + (valorEntrada != null ? valorEntrada.hashCode() : 0);
        result = 31 * result + (valorParcela != null ? valorParcela.hashCode() : 0);
        result = 31 * result + (tipoPagamento != null ? tipoPagamento.hashCode() : 0);
        result = 31 * result + (tipoCobrança != null ? tipoCobrança.hashCode() : 0);
        result = 31 * result + (quantidadeParcelas != null ? quantidadeParcelas.hashCode() : 0);
        result = 31 * result + (início != null ? início.hashCode() : 0);
        result = 31 * result + (fim != null ? fim.hashCode() : 0);
        result = 31 * result + (matrículaInício != null ? matrículaInício.hashCode() : 0);
        result = 31 * result + (matrículaFim != null ? matrículaFim.hashCode() : 0);
        result = 31 * result + (disponível != null ? disponível.hashCode() : 0);
        result = 31 * result + (codSituaçãoApto != null ? codSituaçãoApto.hashCode() : 0);
        result = 31 * result + (diasLetivos != null ? diasLetivos.hashCode() : 0);
        result = 31 * result + (horaInício != null ? horaInício.hashCode() : 0);
        result = 31 * result + (horaFim != null ? horaFim.hashCode() : 0);
        result = 31 * result + (codInscrição != null ? codInscrição.hashCode() : 0);
        result = 31 * result + (mensagemSacado != null ? mensagemSacado.hashCode() : 0);
        result = 31 * result + (mensagemAtraso != null ? mensagemAtraso.hashCode() : 0);
        result = 31 * result + (mensagemCompensação != null ? mensagemCompensação.hashCode() : 0);
        return result;
    }
}
