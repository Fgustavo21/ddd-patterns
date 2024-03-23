package model.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Oferta {

    private Double preco;
    private Parceiro parceiro;
    private LocalDateTime dataLancamento;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }

    public LocalDateTime getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDateTime dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return Objects.equals(preco, oferta.preco) && Objects.equals(parceiro, oferta.parceiro) && Objects.equals(dataLancamento, oferta.dataLancamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preco, parceiro, dataLancamento);
    }
}
