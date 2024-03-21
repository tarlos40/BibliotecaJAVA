import java.util.LinkedList;
import java.util.Queue;

public class Livro {
    private String titulo;
    private boolean disponivel;
    private Queue<Usuario> filaDeEspera;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
        this.filaDeEspera = new LinkedList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public Queue<Usuario> getFilaDeEspera(){
        return filaDeEspera;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void adicionarUsuarioFilaEspera(Usuario usuario) {
        filaDeEspera.add(usuario);
    }

    public Usuario removerPrimeiroUsuarioFilaEspera() {
        return filaDeEspera.poll();
    }

    public Usuario obterProximoUsuarioFilaEspera() {
        return filaDeEspera.peek();
    }

    public boolean filaDeEsperaVazia() {
        return filaDeEspera.isEmpty();
    }

    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", disponivel=" + disponivel +
                ", filaDeEspera=" + filaDeEspera +
                '}';
    }
}
