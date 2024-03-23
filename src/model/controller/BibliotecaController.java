package model.controller;

import model.entity.Livro;
import services.BibliotecaService;

public class BibliotecaController {

    private BibliotecaService bibliotecaService;

    public void cadastrarLivro(Livro livro){
        bibliotecaService.cadastrarLivro(livro);
    }
}
