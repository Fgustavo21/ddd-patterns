package model.vo;

import java.util.Objects;

public class Estoque {

    private long quantidadeDisponivel;
    private String local;
    private String corredor;
    private String prateleira;
    private String gaveta;

    public long getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(long quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public String getGaveta() {
        return gaveta;
    }

    public void setGaveta(String gaveta) {
        this.gaveta = gaveta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estoque estoque = (Estoque) o;
        return quantidadeDisponivel == estoque.quantidadeDisponivel && Objects.equals(local, estoque.local) && Objects.equals(corredor, estoque.corredor) && Objects.equals(prateleira, estoque.prateleira) && Objects.equals(gaveta, estoque.gaveta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidadeDisponivel, local, corredor, prateleira, gaveta);
    }
}
