package services;

import model.entity.Livro;
import repository.Biblioteca;

public class BibliotecaService {

    private Biblioteca biblioteca;

    public void cadastrarLivro(Livro livro){
        //todo: implementar a regra de negócio.
        biblioteca.cadastrarLivro();
    }

    public void editarLivro(){
        //todo: implementar a regra de negócio.
        biblioteca.editarLivro();

    }
    public void excluirLivro(){
        //todo: implementar a regra de negócio.
        biblioteca.excluirLivro();

    }
    public void consultarLivro(){
        //todo: implementar a regra de negócio.
        biblioteca.consultarLivro();

    }






}
