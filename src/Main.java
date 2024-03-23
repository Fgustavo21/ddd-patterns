import model.controller.BibliotecaController;
import model.entity.Livro;
import model.vo.Autor;
import model.vo.Descritivo;
import model.vo.Estoque;

public class Main {


    public static void main(String[] args) {

        BibliotecaController controller = new BibliotecaController();

        Livro livro = new Livro();
        livro.setAutor(new Autor());
        livro.setDescritivo(new Descritivo());
        livro.setEstoque(new Estoque());

        controller.cadastrarLivro(livro);
    }
}