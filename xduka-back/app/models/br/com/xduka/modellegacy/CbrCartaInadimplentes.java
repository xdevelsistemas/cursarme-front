package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(CbrCartaInadimplentesPK.class)
public class CbrCartaInadimplentes {
    private long cartaInadimplentesId;
    private int codUnidade;
    private byte codCarta;
    private String cartaInadimplente1;
    private String cartaInadimplente2;

    @Basic
    @Column(name = "CartaInadimplentes_ID", nullable = false, insertable = true, updatable = true)
    public long getCartaInadimplentesId() {
        return cartaInadimplentesId;
    }

    public void setCartaInadimplentesId(long cartaInadimplentesId) {
        this.cartaInadimplentesId = cartaInadimplentesId;
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
    @Column(name = "CodCarta", nullable = false, insertable = true, updatable = true)
    public byte getCodCarta() {
        return codCarta;
    }

    public void setCodCarta(byte codCarta) {
        this.codCarta = codCarta;
    }

    @Basic
    @Column(name = "CartaInadimplente1", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente1() {
        return cartaInadimplente1;
    }

    public void setCartaInadimplente1(String cartaInadimplente1) {
        this.cartaInadimplente1 = cartaInadimplente1;
    }

    @Basic
    @Column(name = "CartaInadimplente2", nullable = true, insertable = true, updatable = true)
    public String getCartaInadimplente2() {
        return cartaInadimplente2;
    }

    public void setCartaInadimplente2(String cartaInadimplente2) {
        this.cartaInadimplente2 = cartaInadimplente2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbrCartaInadimplentes that = (CbrCartaInadimplentes) o;

        if (cartaInadimplentesId != that.cartaInadimplentesId) return false;
        if (codCarta != that.codCarta) return false;
        if (codUnidade != that.codUnidade) return false;
        if (cartaInadimplente1 != null ? !cartaInadimplente1.equals(that.cartaInadimplente1) : that.cartaInadimplente1 != null)
            return false;
        if (cartaInadimplente2 != null ? !cartaInadimplente2.equals(that.cartaInadimplente2) : that.cartaInadimplente2 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cartaInadimplentesId ^ (cartaInadimplentesId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + (int) codCarta;
        result = 31 * result + (cartaInadimplente1 != null ? cartaInadimplente1.hashCode() : 0);
        result = 31 * result + (cartaInadimplente2 != null ? cartaInadimplente2.hashCode() : 0);
        return result;
    }
}
