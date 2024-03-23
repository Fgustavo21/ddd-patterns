package model.vo;

import java.util.Objects;
import java.util.UUID;

public class Descritivo {

    private UUID idDescritivo;
    private String titulo;
    private String sinopse;
    private int anoLancamento;

    public UUID getIdDescritivo() {
        return idDescritivo;
    }

    public void setIdDescritivo(UUID idDescritivo) {
        this.idDescritivo = idDescritivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descritivo that = (Descritivo) o;
        return anoLancamento == that.anoLancamento && Objects.equals(idDescritivo, that.idDescritivo) && Objects.equals(titulo, that.titulo) && Objects.equals(sinopse, that.sinopse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDescritivo, titulo, sinopse, anoLancamento);
    }
}
