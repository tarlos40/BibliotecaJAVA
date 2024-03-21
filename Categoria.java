import java.util.ArrayList;
import java.util.List;


public class Categoria {
    private String nome;
    private List<Livro> livros;

    public Categoria(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", livros=" + livros +
                '}';
    }
}

