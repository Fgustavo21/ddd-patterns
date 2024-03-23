package model.entity;

import model.vo.Autor;
import model.vo.Descritivo;
import model.vo.Estoque;

import java.util.Objects;

public class Livro {

    private Descritivo descritivo;
    private Autor autor;
    private int qtdRevisoes;
    private Avaliacao avaliacaoClientes;
    private Estoque estoque;
    private Oferta oferta;

    public Descritivo getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(Descritivo descritivo) {
        this.descritivo = descritivo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getQtdRevisoes() {
        return qtdRevisoes;
    }

    public void setQtdRevisoes(int qtdRevisoes) {
        this.qtdRevisoes = qtdRevisoes;
    }

    public Avaliacao getAvaliacaoClientes() {
        return avaliacaoClientes;
    }

    public void setAvaliacaoClientes(Avaliacao avaliacaoClientes) {
        this.avaliacaoClientes = avaliacaoClientes;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return qtdRevisoes == livro.qtdRevisoes && Objects.equals(descritivo, livro.descritivo) && Objects.equals(autor, livro.autor) && Objects.equals(avaliacaoClientes, livro.avaliacaoClientes) && Objects.equals(estoque, livro.estoque) && Objects.equals(oferta, livro.oferta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descritivo, autor, qtdRevisoes, avaliacaoClientes, estoque, oferta);
    }
}
