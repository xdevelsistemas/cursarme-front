package models.br.com.xduka.modellegacy;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdReservaPK.class)
public class AcdReserva {
    private long reservaId;
    private int anoLetivo;
    private int codUnidade;
    private int codAluno;
    private Integer codPai;
    private Integer codMãe;
    private Integer codCurso;
    private Integer codPeríodo;
    private String codTurno;
    private Timestamp dataInscrição;
    private String mensagem;
    private String ip;
    private AcdPeríodo acdPeríodo;
    private AcdTurno acdTurno;

    @Basic
    @Column(name = "Reserva_ID", nullable = false, insertable = true, updatable = true)
    public long getReservaId() {
        return reservaId;
    }

    public void setReservaId(long reservaId) {
        this.reservaId = reservaId;
    }

    @Id
    @Column(name = "AnoLetivo", nullable = false, insertable = true, updatable = true)
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodAluno", nullable = false, insertable = true, updatable = true)
    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    @Basic
    @Column(name = "CodPai", nullable = true, insertable = true, updatable = true)
    public Integer getCodPai() {
        return codPai;
    }

    public void setCodPai(Integer codPai) {
        this.codPai = codPai;
    }

    @Basic
    @Column(name = "CodMãe", nullable = true, insertable = true, updatable = true)
    public Integer getCodMãe() {
        return codMãe;
    }

    public void setCodMãe(Integer codMãe) {
        this.codMãe = codMãe;
    }

    @Basic
    @Column(name = "CodCurso", nullable = true, insertable = true, updatable = true)
    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    @Basic
    @Column(name = "CodPeríodo", nullable = true, insertable = true, updatable = true)
    public Integer getCodPeríodo() {
        return codPeríodo;
    }

    public void setCodPeríodo(Integer codPeríodo) {
        this.codPeríodo = codPeríodo;
    }

    @Basic
    @Column(name = "CodTurno", nullable = true, insertable = true, updatable = true)
    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    @Basic
    @Column(name = "DataInscrição", nullable = true, insertable = true, updatable = true)
    public Timestamp getDataInscrição() {
        return dataInscrição;
    }

    public void setDataInscrição(Timestamp dataInscrição) {
        this.dataInscrição = dataInscrição;
    }

    @Basic
    @Column(name = "Mensagem", nullable = true, insertable = true, updatable = true)
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Basic
    @Column(name = "Ip", nullable = true, insertable = true, updatable = true)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdReserva that = (AcdReserva) o;

        if (anoLetivo != that.anoLetivo) return false;
        if (codAluno != that.codAluno) return false;
        if (codUnidade != that.codUnidade) return false;
        if (reservaId != that.reservaId) return false;
        if (codCurso != null ? !codCurso.equals(that.codCurso) : that.codCurso != null) return false;
        if (codMãe != null ? !codMãe.equals(that.codMãe) : that.codMãe != null) return false;
        if (codPai != null ? !codPai.equals(that.codPai) : that.codPai != null) return false;
        if (codPeríodo != null ? !codPeríodo.equals(that.codPeríodo) : that.codPeríodo != null) return false;
        if (codTurno != null ? !codTurno.equals(that.codTurno) : that.codTurno != null) return false;
        if (dataInscrição != null ? !dataInscrição.equals(that.dataInscrição) : that.dataInscrição != null)
            return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (mensagem != null ? !mensagem.equals(that.mensagem) : that.mensagem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (reservaId ^ (reservaId >>> 32));
        result = 31 * result + anoLetivo;
        result = 31 * result + codUnidade;
        result = 31 * result + codAluno;
        result = 31 * result + (codPai != null ? codPai.hashCode() : 0);
        result = 31 * result + (codMãe != null ? codMãe.hashCode() : 0);
        result = 31 * result + (codCurso != null ? codCurso.hashCode() : 0);
        result = 31 * result + (codPeríodo != null ? codPeríodo.hashCode() : 0);
        result = 31 * result + (codTurno != null ? codTurno.hashCode() : 0);
        result = 31 * result + (dataInscrição != null ? dataInscrição.hashCode() : 0);
        result = 31 * result + (mensagem != null ? mensagem.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodCurso", referencedColumnName = "CodCurso" , nullable = false), @JoinColumn(name = "CodPeríodo", referencedColumnName = "CodPeríodo", nullable = false)})
    public AcdPeríodo getAcdPeríodo() {
        return acdPeríodo;
    }

    public void setAcdPeríodo(AcdPeríodo acdPeríodo) {
        this.acdPeríodo = acdPeríodo;
    }

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CodUnidade", referencedColumnName = "CodUnidade", nullable = false), @JoinColumn(name = "CodTurno", referencedColumnName = "CodTurno" , nullable = false)})
    public AcdTurno getAcdTurno() {
        return acdTurno;
    }

    public void setAcdTurno(AcdTurno acdTurno) {
        this.acdTurno = acdTurno;
    }
}
