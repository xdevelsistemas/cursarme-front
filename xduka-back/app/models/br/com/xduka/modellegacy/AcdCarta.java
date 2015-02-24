package models.br.com.xduka.modellegacy;

import javax.persistence.*;

/**
 * Created by clayton on 04/12/14.
 */
@Entity
@IdClass(AcdCartaPK.class)
public class AcdCarta {
    private long cartaId;
    private int codUnidade;
    private int codCarta;
    private String carta;
    private String cartaTexto;

    @Basic
    @Column(name = "Carta_ID", nullable = false, insertable = true, updatable = true)
    public long getCartaId() {
        return cartaId;
    }

    public void setCartaId(long cartaId) {
        this.cartaId = cartaId;
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
    public int getCodCarta() {
        return codCarta;
    }

    public void setCodCarta(int codCarta) {
        this.codCarta = codCarta;
    }

    @Basic
    @Column(name = "Carta", nullable = false, insertable = true, updatable = true)
    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    @Basic
    @Column(name = "CartaTexto", nullable = true, insertable = true, updatable = true)
    public String getCartaTexto() {
        return cartaTexto;
    }

    public void setCartaTexto(String cartaTexto) {
        this.cartaTexto = cartaTexto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcdCarta acdCarta = (AcdCarta) o;

        if (cartaId != acdCarta.cartaId) return false;
        if (codCarta != acdCarta.codCarta) return false;
        if (codUnidade != acdCarta.codUnidade) return false;
        if (carta != null ? !carta.equals(acdCarta.carta) : acdCarta.carta != null) return false;
        if (cartaTexto != null ? !cartaTexto.equals(acdCarta.cartaTexto) : acdCarta.cartaTexto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cartaId ^ (cartaId >>> 32));
        result = 31 * result + codUnidade;
        result = 31 * result + codCarta;
        result = 31 * result + (carta != null ? carta.hashCode() : 0);
        result = 31 * result + (cartaTexto != null ? cartaTexto.hashCode() : 0);
        return result;
    }
}
