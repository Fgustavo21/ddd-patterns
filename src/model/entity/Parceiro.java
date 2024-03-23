package model.entity;

import java.util.Objects;
import java.util.UUID;

public class Parceiro {

    private UUID idParceiro;
    private String nome;
    private int parceiroDesde;

    public UUID getIdParceiro() {
        return idParceiro;
    }

    public void setIdParceiro(UUID idParceiro) {
        this.idParceiro = idParceiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getParceiroDesde() {
        return parceiroDesde;
    }

    public void setParceiroDesde(int parceiroDesde) {
        this.parceiroDesde = parceiroDesde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parceiro parceiro = (Parceiro) o;
        return parceiroDesde == parceiro.parceiroDesde && Objects.equals(idParceiro, parceiro.idParceiro) && Objects.equals(nome, parceiro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idParceiro, nome, parceiroDesde);
    }
}
