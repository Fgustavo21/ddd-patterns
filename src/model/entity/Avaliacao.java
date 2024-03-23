package model.entity;

import model.vo.Autor;

import java.util.Objects;

public class Avaliacao {

    private int nota;
    private Autor autor;
    private String comentario;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avaliacao avaliacao = (Avaliacao) o;
        return nota == avaliacao.nota && Objects.equals(autor, avaliacao.autor) && Objects.equals(comentario, avaliacao.comentario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nota, autor, comentario);
    }
}
