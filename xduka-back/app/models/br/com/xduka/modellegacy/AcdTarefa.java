package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdTarefaPK.class)
public class AcdTarefa {
    private int codUnidade;
    private int codTarefa;
    private int codDisciplina;
    private Timestamp data;
    private String assunto;
    private String tarefa;
    private Timestamp dataInício;
    private Timestamp dataFim;
    private String anexo;
    private boolean cancelada;
    private List<AcdTarefaTurma> acdTarefaTurmas;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodTarefa", nullable = false, insertable = true, updatable = true)
    public int getCodTarefa() {
        return codTarefa;
    }

    public void setCodTarefa(int codTarefa) {
        this.codTarefa = codTarefa;
    }

    @Basic
    @Column(name = "CodDisciplina", nullable = false, insertable = true, updatable = true)
    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    @Basic
    @Column(name = "Data", nullable = true, insertable = true, updatable = true)
    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    @Basic
    @Column(name = "Assunto", nullable = true, insertable = true, updatable = true, length = 120)
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Basic
    @Column(name = "Tarefa", nullable = true, insertable = true, updatable = true, length = 1000)
    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    @Basic
    @Column(name = "DataInício", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataInício() {
        return dataInício;
    }

    public void setDataInício(Timestamp dataInício) {
        this.dataInício = dataInício;
    }

    @Basic
    @Column(name = "DataFim", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataFim() {
        return dataFim;
    }

    public void setDataFim(Timestamp dataFim) {
        this.dataFim = dataFim;
    }

    @Basic
    @Column(name = "Anexo", nullable = true, insertable = true, updatable = true, length = 255)
    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    @Basic
    @Column(name = "Cancelada", nullable = false, insertable = true, updatable = true)
    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTarefa acdTarefa = (AcdTarefa) o;

        if (cancelada != acdTarefa.cancelada) return false;
        if (codDisciplina != acdTarefa.codDisciplina) return false;
        if (codTarefa != acdTarefa.codTarefa) return false;
        if (codUnidade != acdTarefa.codUnidade) return false;
        if (anexo != null ? !anexo.equals(acdTarefa.anexo) : acdTarefa.anexo != null) return false;
        if (assunto != null ? !assunto.equals(acdTarefa.assunto) : acdTarefa.assunto != null) return false;
        if (data != null ? !data.equals(acdTarefa.data) : acdTarefa.data != null) return false;
        if (dataFim != null ? !dataFim.equals(acdTarefa.dataFim) : acdTarefa.dataFim != null) return false;
        if (dataInício != null ? !dataInício.equals(acdTarefa.dataInício) : acdTarefa.dataInício != null) return false;
        if (tarefa != null ? !tarefa.equals(acdTarefa.tarefa) : acdTarefa.tarefa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + codTarefa;
        result = 31 * result + codDisciplina;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (assunto != null ? assunto.hashCode() : 0);
        result = 31 * result + (tarefa != null ? tarefa.hashCode() : 0);
        result = 31 * result + (dataInício != null ? dataInício.hashCode() : 0);
        result = 31 * result + (dataFim != null ? dataFim.hashCode() : 0);
        result = 31 * result + (anexo != null ? anexo.hashCode() : 0);
        result = 31 * result + (cancelada ? 1 : 0);
        return result;
    }

    @OneToMany(mappedBy = "acdTarefa")
    public List<AcdTarefaTurma> getAcdTarefaTurmas() {
        return acdTarefaTurmas;
    }

    public void setAcdTarefaTurmas(List<AcdTarefaTurma> acdTarefaTurmas) {
        this.acdTarefaTurmas = acdTarefaTurmas;
    }
}
