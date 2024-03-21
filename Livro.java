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

    public Queue<Usuario> getFilaDeEspera() {
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

    public void locar(Livro livro, Usuario usuario) {
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            System.out.println("Livro locado com sucesso [ " + livro.getTitulo() + " ]");
        } else {
            System.out
                    .println("Livro indisponível usuário adicionado na fila de espera: [ " + usuario.getNome() + " ]");
            livro.adicionarUsuarioFilaEspera(usuario);
        }
    }
}
