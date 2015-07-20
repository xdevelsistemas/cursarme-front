package br.com.xduka.modellegacy.entities;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdTurnoPK.class)
public class AcdTurno {
    private int codUnidade;
    private String codTurno;
    private String turno;
    private String horaEntrada;
    private String horaEntradaLimite;
    private String horaSaída;
//    private List<AcdReserva> acdReservas;

    @Id
    @Column(name = "CodUnidade", nullable = false, insertable = true, updatable = true)
    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Id
    @Column(name = "CodTurno", nullable = false, insertable = true, updatable = true)
    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }

    @Basic
    @Column(name = "Turno", nullable = true, insertable = true, updatable = true)
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Basic
    @Column(name = "HoraEntrada", nullable = true, insertable = true, updatable = true)
    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Basic
    @Column(name = "HoraEntradaLimite", nullable = true, insertable = true, updatable = true)
    public String getHoraEntradaLimite() {
        return horaEntradaLimite;
    }

    public void setHoraEntradaLimite(String horaEntradaLimite) {
        this.horaEntradaLimite = horaEntradaLimite;
    }

    @Basic
    @Column(name = "HoraSaída", nullable = true, insertable = true, updatable = true)
    public String getHoraSaída() {
        return horaSaída;
    }

    public void setHoraSaída(String horaSaída) {
        this.horaSaída = horaSaída;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdTurno acdTurno = (AcdTurno) o;

        if (codUnidade != acdTurno.codUnidade) return false;
        if (codTurno != null ? !codTurno.equals(acdTurno.codTurno) : acdTurno.codTurno != null) return false;
        if (horaEntrada != null ? !horaEntrada.equals(acdTurno.horaEntrada) : acdTurno.horaEntrada != null)
            return false;
        if (horaEntradaLimite != null ? !horaEntradaLimite.equals(acdTurno.horaEntradaLimite) : acdTurno.horaEntradaLimite != null)
            return false;
        if (horaSaída != null ? !horaSaída.equals(acdTurno.horaSaída) : acdTurno.horaSaída != null) return false;
        if (turno != null ? !turno.equals(acdTurno.turno) : acdTurno.turno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codUnidade;
        result = 31 * result + (codTurno != null ? codTurno.hashCode() : 0);
        result = 31 * result + (turno != null ? turno.hashCode() : 0);
        result = 31 * result + (horaEntrada != null ? horaEntrada.hashCode() : 0);
        result = 31 * result + (horaEntradaLimite != null ? horaEntradaLimite.hashCode() : 0);
        result = 31 * result + (horaSaída != null ? horaSaída.hashCode() : 0);
        return result;
    }

//    @OneToMany(mappedBy = "acdTurno")
//    public List<AcdReserva> getAcdReservas() {
//        return acdReservas;
//    }
//
//    public void setAcdReservas(List<AcdReserva> acdReservas) {
//        this.acdReservas = acdReservas;
//    }
}
