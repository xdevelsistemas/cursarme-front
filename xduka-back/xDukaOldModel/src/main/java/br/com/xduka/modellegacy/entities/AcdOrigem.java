package br.com.xduka.modellegacy.entities;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdOrigemPK.class)
public class AcdOrigem {
    private long origemId;
    private int codUnidade;
    private short codOrigem;
    private String origem;
    private byte[] cts;

    @Basic
    @Column(name = "Origem_ID", nullable = false, insertable = true, updatable = true)
    public long getOrigemId() {
        return origemId;
    }

    public void setOrigemId(long origemId) {
        this.origemId = origemId;
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
    @Column(name = "CodOrigem", nullable = false, insertable = true, updatable = true)
    public short getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(short codOrigem) {
        this.codOrigem = codOrigem;
    }

    @Basic
    @Column(name = "Origem", nullable = true, insertable = true, updatable = true)
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Basic
    @Column(name = "CTS", nullable = true, insertable = true, updatable = true)
    public byte[] getCts() {
        return cts;
    }

    public void setCts(byte[] cts) {
        this.cts = cts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdOrigem acdOrigem = (AcdOrigem) o;

        if (codOrigem != acdOrigem.codOrigem) return false;
        if (codUnidade != acdOrigem.codUnidade) return false;
        if (origemId != acdOrigem.origemId) return false;
        if (!Arrays.equals(cts, acdOrigem.cts)) return false;
        if (origem != null ? !origem.equals(acdOrigem.origem) : acdOrigem.origem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (origemId ^ (origemId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) codOrigem;
        result = 31 * result + (origem != null ? origem.hashCode() : 0);
        result = 31 * result + (cts != null ? Arrays.hashCode(cts) : 0);
        return result;
    }
}
