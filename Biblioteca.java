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
        for (Categoria categoria : categorias) {
            System.out.println("- " + categoria.getNome());
        }
    }
}