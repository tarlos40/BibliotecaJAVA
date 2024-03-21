import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Categoria> categorias;

    public Biblioteca() {
        this.categorias = new ArrayList<>();
    }

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void exibirCategoriasDisponiveis() {
        System.out.println("Categorias disponíveis na biblioteca:");
        int count = 1;
        for (Categoria categoria : categorias) {
            System.out.println(count + ": " + categoria.getNome());
            count++;
        }
    }

    public String getLivrosCategoria(int numero) {
        String nomeCategoria = "";
        int count = 1;

        for (Categoria categoria : categorias) {

            if (count == numero) {
                nomeCategoria = categoria.getNome();

                System.out.println("Os livros da categoria [ " + categoria.getNome() + " ] São os seguintes");
                categoria.mostrarLivros();

                return nomeCategoria;
            }
            count++;
        }
        nomeCategoria = "Categoria não existe";

        return nomeCategoria;
    }

}